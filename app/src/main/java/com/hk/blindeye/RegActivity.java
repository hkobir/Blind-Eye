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

public class RegActivity extends AppCompatActivity {
    private EditText e1,e2;
    private Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);



        //when pressed ok button
        e1=(EditText)findViewById(R.id.loginInputID);
        e2=(EditText)findViewById(R.id.loginconfirmInputID);
        reg=(Button) findViewById(R.id.loginButtonID);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //registration activity

                String inputPass=e1.getText().toString();
                String ConfirmInputPass=e2.getText().toString();
                if(inputPass.isEmpty()||ConfirmInputPass.isEmpty()){
                    if(inputPass.isEmpty()){
                        e1.setError("Input the password");
                        e1.requestFocus();
                    }
                    else if(ConfirmInputPass.isEmpty()){
                        e2.setError("Input the password");
                        e2.requestFocus();
                    }

                    Toast.makeText(RegActivity.this,"password must not be empty!",Toast.LENGTH_SHORT).show();
                }
                else if(!inputPass.equals(ConfirmInputPass)){
                    Toast.makeText(RegActivity.this,"password not matched",Toast.LENGTH_SHORT).show();
                }
                else {
                    //store the user password
                    SharedPreferences sharedPreferences=getSharedPreferences("Password", 0);
                    SharedPreferences.Editor editor=sharedPreferences.edit();
                    editor.putString("pass",inputPass);
                    editor.apply();
                    Toast.makeText(getApplicationContext(),"password ceated successfully",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(RegActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }
}

