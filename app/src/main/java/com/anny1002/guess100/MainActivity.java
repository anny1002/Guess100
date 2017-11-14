package com.anny1002.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findViews(View view){
        EditText edNumber = (EditText) findViewById(R.id.number);
        int number=Integer.parseInt(edNumber.getText().toString());

    }
}
