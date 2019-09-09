package com.hk.blindeye;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {
    private ImageView loading;
    private ImageView iconBlink;
    public String Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //Animation start
        loading=findViewById(R.id.AnimateIcon);
        iconBlink=findViewById(R.id.appsIcon);
        Animation animation1= AnimationUtils.loadAnimation(SplashActivity.this,R.anim.rotate_clock);
        Animation animation2=AnimationUtils.loadAnimation(SplashActivity.this,R.anim.blink_icon);
        loading.startAnimation(animation1);
        iconBlink.startAnimation(animation2);
        //post delayed on welcome screen
        splash();


    }
    public void splash(){

        SharedPreferences sharedPreferences=getSharedPreferences("Password", 0);
        Password=sharedPreferences.getString("pass","");
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences=getSharedPreferences("SwitchStatus", Context.MODE_PRIVATE);
                String Switch=sharedPreferences.getString("passSwitch","");
                if(Switch.equals("off")||Switch.isEmpty()){
                    //when switch is off
                    Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    if(Password.isEmpty()){

                        //if database pass is empty then means new user need registration
                        Intent intent=new Intent(SplashActivity.this,RegActivity.class);
                        startActivity(intent);
                        finish();

                    }
                    else{
                        Intent intent2=new Intent(SplashActivity.this,LoginActivity.class);
                        startActivity(intent2);
                        finish();
                    }
                }



            }
        },3500);
    }
}
