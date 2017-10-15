package com.adityadua.calculatordemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn0,btn1,btn2,btn3,btn4,btnAdd,btnEqual,btnClear;
    TextView textDisplay;
    int op1;
    int op2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);

        btn0 = (Button)findViewById(R.id.btn10);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);

        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnEqual = (Button)findViewById(R.id.btnEqual);
        btnClear = (Button)findViewById(R.id.btnC);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        btnAdd.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnClear.setOnClickListener(this);

        textDisplay = (TextView)findViewById(R.id.txtCalcDisplay);



    }

    @Override
    public void onClick(View v) {
        String dis;


        switch (v.getId()){
            case R.id.btn1 :
                dis = textDisplay.getText().toString();
                if(dis.equals("0")){
                    textDisplay.setText("1");
                }else{
                    textDisplay.setText(dis+"1");
                }
                break;
            case R.id.btn2 :
                dis = textDisplay.getText().toString();
                if(dis.equals("0")){
                    textDisplay.setText("2");
                }else{
                    textDisplay.setText(dis+"2");
                }
                break;

            case R.id.btn3 :
                dis = textDisplay.getText().toString();
                if(dis.equals("0")){
                    textDisplay.setText("3");
                }else{
                    textDisplay.setText(dis+"3");
                }
                break;



            case R.id.btnAdd :
                dis = textDisplay.getText().toString();
                if(dis.equals("0")){
                    op1=0;
                }else{
                    op1= Integer.parseInt(dis);
                    textDisplay.setText("0");
                }
                break;

            case R.id.btnEqual :
                int result;
                dis = textDisplay.getText().toString();

                op2= Integer.parseInt(dis);
                result= op1+op2;
                String temp;
                temp= Integer.toString(result);
                textDisplay.setText(temp);

                break;
            case R.id.btnC :
                textDisplay.setText("0");
                break;
            
            default:
                Toast.makeText(this, "Not a Valid Option", Toast.LENGTH_SHORT).show();
        }

    }
}
