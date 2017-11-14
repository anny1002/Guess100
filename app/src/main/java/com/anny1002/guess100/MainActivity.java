package com.anny1002.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int secret =(int)(Math.random()*100+1);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void findViews(View view){
        EditText number;
        TextView secret;
        TextView info;
        Button send;
        EditText edNumber = (EditText) findViewById(R.id.number);
        int n=Integer.parseInt(edNumber.getText().toString());


    }
}
