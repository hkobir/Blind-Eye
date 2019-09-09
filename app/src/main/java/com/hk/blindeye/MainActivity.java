package com.hk.blindeye;

import android.content.DialogInterface;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hk.blindeye.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        setSupportActionBar(binding.customToolBar);
        process();
    }

    private void process() {
        binding.encryptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,EncryptionActivity.class);
                startActivity(intent);

            }
        });

        binding.decryptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DecryptionActivity.class);
                startActivity(intent);

            }
        });

        binding.helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,HelpActivity.class);
                startActivity(intent);


            }
        });

        binding.aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);

            }
        });



        binding.settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //open a bottomSheet for share and password setting
                SettingSheet settingSheet =new SettingSheet();
                settingSheet.show(getSupportFragmentManager(),"Setting");



            }
        });


    }


    //overRide onBackPressed() for confirmation exit from MainActivity

    @Override
    public void onBackPressed() {

        //exit confirmation Dialog create

        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(this);   //it also may be: (MainActivity.this)
        alertDialogBuilder.setTitle("Exit Application?");
        alertDialogBuilder.setIcon(R.drawable.ic_exit);
        alertDialogBuilder.setMessage("Click Yes to Exit!").setCancelable(false).setPositiveButton("Yes",new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int id) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        }).setNegativeButton("No",new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();

            }
        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }


}
