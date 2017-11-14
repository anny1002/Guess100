package com.anny1002.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int secret =(int)(Math.random()*100+1);
    int min=1,max=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void findViews(View view){
        EditText edNumber;
        TextView tvsecret;
        TextView info;
        Button send;
        tvsecret= (TextView) findViewById(R.id.secret);
        edNumber = (EditText) findViewById(R.id.number);
        int n=Integer.parseInt(edNumber.getText().toString());
        String s = String.valueOf(secret);
        tvsecret.setText(s);
        if(secret==n){
            new AlertDialog.Builder(this)
                    .setMessage("答對了")
                    .setPositiveButton("ok",null)
                    .show();
        }
        if (secret>n){
            min=n;
            new AlertDialog.Builder(this)
                    .setMessage("大一點,請輸入"+min+"~"+max)
                    .setPositiveButton("ok",null)
                    .show();
        }
        if(secret<n){
            max=n;
            new AlertDialog.Builder(this)
                    .setMessage("小一點,請輸入"+min+"~"+max)
                    .setPositiveButton("ok",null)
                    .show();
        }

    }

}
