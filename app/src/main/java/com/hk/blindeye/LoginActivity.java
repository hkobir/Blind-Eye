package com.hk.blindeye;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText e1;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //check database pass with userpass
        login=(Button) findViewById(R.id.loginButtonID);
        e1=(EditText)findViewById(R.id.loginInputID);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputPass=e1.getText().toString();

                if(inputPass.isEmpty()){
                    e1.setError("Input the password");
                    e1.requestFocus();
                    Toast.makeText(LoginActivity.this,"password must not be empty!",Toast.LENGTH_SHORT).show();
                }
                else{
                    SharedPreferences sharedPreferences=getSharedPreferences("Password", 0);
                    if (sharedPreferences.contains("pass")){
                        String DBpass=sharedPreferences.getString("pass","");
                        if(inputPass.equals(DBpass)){
                            Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                        else{
                            Toast.makeText(LoginActivity.this,"Invalid Password!",Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
        });
    }
}
