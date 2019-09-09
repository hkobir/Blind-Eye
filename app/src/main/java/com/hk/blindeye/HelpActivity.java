package com.hk.blindeye;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hk.blindeye.databinding.ActivityHelpBinding;

public class HelpActivity extends AppCompatActivity {
private ActivityHelpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_help);

        setSupportActionBar(binding.customToolBar);
    }

    public void backPrevious(View view) {
        onBackPressed();
    }
}
