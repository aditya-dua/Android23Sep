package com.adityadua.eventhandlingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    private Button btn2 ;
    TextView tv;
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        tv = (TextView)findViewById(R.id.textView);
        edt = (EditText)findViewById(R.id.editText);

        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.wtf("onclick started","Id IS ::"+v.getId());
                Log.i("onclick started","Id IS ::"+v.getId());
                btn.setText("Text from second Inner Class");
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("New TExt For TexT View");
            }
        });

    }


    public void ButtonClick(View v){

        String text = edt.getText().toString();
        Toast.makeText(this, "Text Entered Is:"+text, Toast.LENGTH_SHORT).show();

    }
}
