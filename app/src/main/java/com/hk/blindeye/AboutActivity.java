package com.hk.blindeye;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hk.blindeye.databinding.ActivityAboutBinding;

public class AboutActivity extends AppCompatActivity {
private ActivityAboutBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_about);

        setSupportActionBar(binding.customToolBar);


    }

    public void backPrevious(View view) {
        onBackPressed();
    }
}
