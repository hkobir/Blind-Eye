package com.hk.blindeye;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class SettingActivity extends AppCompatActivity {
    private Switch aSwitch;
    private Toolbar cToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        cToolbar=findViewById(R.id.customToolBar);

        setSupportActionBar(cToolbar);

        passRequest();

    }


    //impliments passSwitch on or off

    public void passRequest(){
        aSwitch=(Switch)findViewById(R.id.passRequestSwitchID);

        //turn switch on/off base on priviosly territory database
        SharedPreferences sharedPreferences=getSharedPreferences("SwitchStatus", Context.MODE_PRIVATE);
        String SwitchMode=sharedPreferences.getString("passSwitch","");
        if(SwitchMode.isEmpty()||SwitchMode.equals("off")){
            aSwitch.setChecked(false);
        }
        else{
            aSwitch.setChecked(true);
        }


        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean switchStatus=aSwitch.isChecked();
                if(switchStatus==false){
                    Toast.makeText(SettingActivity.this,"password request is OFF",Toast.LENGTH_SHORT).show();
                    SharedPreferences sharedPreferences=getSharedPreferences("SwitchStatus", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=sharedPreferences.edit();
                    editor.putString("passSwitch","off");
                    editor.commit();


                    //check are previously registered?

                }
                else{
                    Toast.makeText(SettingActivity.this,"password request is ON",Toast.LENGTH_SHORT).show();
                    SharedPreferences sharedPreferences=getSharedPreferences("SwitchStatus", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=sharedPreferences.edit();
                    editor.putString("passSwitch","on");
                    editor.commit();
                }
            }
        });
    }


    public void backPrevious(View view) {
        onBackPressed();
    }
}
