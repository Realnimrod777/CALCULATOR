package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber4);
        EditText et3=(EditText) findViewById(R.id.editTextNumber5);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1+n2;
        et3.setText("result"+result);
    }
    public void subtract(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber4);
        EditText et3=(EditText) findViewById(R.id.editTextNumber5);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1-n2;
        et3.setText("result"+result);
    }
    public void mul(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber4);
        EditText et3=(EditText) findViewById(R.id.editTextNumber5);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1*n2;
        et3.setText("result"+result);
    }
    public void div(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber4);
        EditText et3=(EditText) findViewById(R.id.editTextNumber5);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1/n2;
        et3.setText("result"+result);
    }

}