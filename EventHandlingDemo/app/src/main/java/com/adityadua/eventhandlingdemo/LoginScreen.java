package com.adityadua.eventhandlingdemo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by AdityaDua on 14/10/17.
 */

public class LoginScreen extends AppCompatActivity implements View.OnClickListener{

    private EditText UserName;
    private EditText Password;
    private Button login;
    private Button reset;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        UserName = (EditText)findViewById(R.id.editText2);
        Password = (EditText)findViewById(R.id.editText4);

        login = (Button)findViewById(R.id.button4);
        reset = (Button)findViewById(R.id.button5);

        login.setOnClickListener(this);
        reset.setOnClickListener(this);
        iv = (ImageView)findViewById(R.id.imageView);



    }

    @Override
    public void onClick(View v) {

        String userN = UserName.getText().toString();
        String passW= Password.getText().toString();
        boolean login = false;
        if(userN.equalsIgnoreCase("aditya") && passW.equals("Aditya")){
            login = true;
        }
        else login = false;
        if(v.getId() == R.id.button4){
            if(login){
                Toast.makeText(this, "Login Success For "+userN, Toast.LENGTH_SHORT).show();
                iv.setImageResource(R.drawable.login);
            }else{
                Toast.makeText(this, "You seem to have passed a Wrong Id & PWd", Toast.LENGTH_SHORT).show();
            }


        }else if(v.getId() == R.id.button5){
            UserName.setText("");
            Password.setText("");
            iv.setImageResource(R.color.colorPrimary);


        }

    }
}
