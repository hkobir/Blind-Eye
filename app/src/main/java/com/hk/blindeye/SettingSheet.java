package com.hk.blindeye;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class SettingSheet extends BottomSheetDialogFragment {
private LinearLayout passSettingButton,shareButton;

    public SettingSheet() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.setting_sheet,container);


        passSettingButton=view.findViewById(R.id.passSettingBtn);
       shareButton=view.findViewById(R.id.shareBtn);


        passSettingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to activity for enable or disable password
                Intent intent=new Intent(getContext(),SettingActivity.class);
                startActivity(intent);

            }
        });


        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //share this apps
                Intent sintent = new Intent(Intent.ACTION_SEND);
                sintent.setType("text/plain");
                String subject="BlindEyes apps";
                String body="This apps is veru useful for Secure messaging communication..";
                sintent.putExtra(Intent.EXTRA_SUBJECT,subject);
                sintent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(sintent, "Share with"));
            }
        });


        return view;
    }
}

