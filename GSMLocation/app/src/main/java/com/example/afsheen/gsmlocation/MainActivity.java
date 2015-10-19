package com.example.afsheen.gsmlocation;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity
{
    Button btn1;
    TextView txt;

    private TelephonyManager telmanager;
    public GsmCellLocation loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        txt = (TextView) findViewById(R.id.txt);

        this.telmanager = (TelephonyManager) this.getSystemService(TELEPHONY_SERVICE);


    }

    public void show(View v)
    {
        loc = (GsmCellLocation)telmanager.getCellLocation();
        txt.setText(loc.toString());
    }
}
