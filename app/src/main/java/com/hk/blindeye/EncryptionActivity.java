package com.hk.blindeye;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.hk.blindeye.databinding.ActivityEncryptionBinding;
import com.hk.blindeye.databinding.ActivityMainBinding;

public class EncryptionActivity extends AppCompatActivity {
    private ActivityEncryptionBinding binding;



     //initialize lettervalue and key for cipher
     private int key=17;
    private int a=0,b=1,c=2,d=3,e=4,f=5,g=6,h=7,i=8,j=9,k=10,l=11,m=12,n=13,o=14,p=15,q=16,r=17,s=18,t=19,u=20,v=21,w=22,x=23,y=24,z=25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_encryption);

        setSupportActionBar(binding.customToolBar);

        //text change listener add for clear button
        binding.plainTextET.addTextChangedListener(TextWatcher());


        //process of button listner

        process();

    }


    //create text_change method for clearButton visibility

    private TextWatcher TextWatcher() {
        // TODO Auto-generated method stub
        return new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(binding.plainTextET.getText().toString().isEmpty()) {
                    binding.clearTextBtn.setVisibility(View.GONE);
                }
                else {
                    binding.clearTextBtn.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub

            }

        };
    }




    //button listner process
    private void process() {
        //clear button
        binding.clearTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.plainTextET.setText("");
                binding.displayCiphertext.setText("");
            }
        });

        //copy cipher text button impliment
        binding.copyCmessageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copied Text",binding.displayCiphertext.getText().toString());
                clipboard.setPrimaryClip(clipData);

                //show snackBar message
                Snackbar snackbar=Snackbar.make(binding.encryptLinearlayout,"Copied Text Successfully",Snackbar.LENGTH_LONG);
                snackbar.show();
                //Toast.makeText(EncryptionActivity.this, "Copied Text", Toast.LENGTH_SHORT).show();
            }
        });






        //encryption process

        binding.encryptionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=binding.plainTextET.getText().toString().trim();
                char[] plain=text.toCharArray();
                int cnumber=0;

                if(text.equals("")){
                    //Toast.makeText(EncryptionActivity.this, "Empty TextField!", Toast.LENGTH_LONG).show();
                    binding.plainTextET.setError("Enter your message");
                    binding.plainTextET.requestFocus();
                }
                else{
                    for(int I=0;I<plain.length;I++){
                        if(plain[I]=='a'){

                            // additive cipher with adding key and cipher
                            cnumber=(a+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else if(cnumber==25){
                                plain[I]='Z';
                            }


                        }
                        else if(plain[I]=='b'){

                            // additive cipher with adding key and cipher
                            cnumber=(b+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }

                        else if(plain[I]=='c'){
                            cnumber=(c+key)%26;
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='d'){
                            cnumber=(d+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='e'){
                            cnumber=(e+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='f'){
                            cnumber=(f+key)%26;

                            //check cIpher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='g'){
                            cnumber=(g+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='h'){
                            cnumber=(h+key)%26;
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='i'){
                            cnumber=(i+key)%26;
                            System.out.println(cnumber);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='j'){
                            cnumber=(j+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='k'){
                            cnumber=(k+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='l'){
                            cnumber=(l+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='m'){
                            cnumber=(m+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='n'){
                            cnumber=(n+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='o'){
                            cnumber=(o+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='p'){
                            cnumber=(p+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='q'){
                            cnumber=(q+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='r'){
                            cnumber=(r+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='s'){
                            cnumber=(s+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='t'){
                            cnumber=(t+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='u'){
                            cnumber=(u+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='v'){
                            cnumber=(v+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='w'){
                            cnumber=(w+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='x'){
                            cnumber=(x+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='y'){
                            cnumber=(y+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else if(plain[I]=='z'){
                            cnumber=(z+key)%26;

                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='A';
                            }

                            else if(cnumber==1){
                                plain[I]='B';
                            }


                            else if(cnumber==2){
                                plain[I]='C';
                            }
                            else if(cnumber==3){
                                plain[I]='D';
                            }
                            else if(cnumber==4){
                                plain[I]='E';
                            }
                            else if(cnumber==5){
                                plain[I]='F';
                            }
                            else if(cnumber==6){
                                plain[I]='G';
                            }
                            else if(cnumber==7){
                                plain[I]='H';
                            }
                            else if(cnumber==8){
                                plain[I]='I';
                            }
                            else if(cnumber==9){
                                plain[I]='J';
                            }
                            else if(cnumber==10){
                                plain[I]='K';
                            }
                            else if(cnumber==11){
                                plain[I]='L';
                            }
                            else if(cnumber==12){
                                plain[I]='M';
                            }
                            else if(cnumber==13){
                                plain[I]='N';
                            }
                            else if(cnumber==14){
                                plain[I]='O';
                            }

                            else if(cnumber==15){
                                plain[I]='P';
                            }
                            else if(cnumber==16){
                                plain[I]='Q';
                            }
                            else if(cnumber==17){
                                plain[I]='R';
                            }
                            else if(cnumber==18){
                                plain[I]='S';
                            }
                            else if(cnumber==19){
                                plain[I]='T';
                            }
                            else if(cnumber==20){
                                plain[I]='U';
                            }
                            else if(cnumber==21){
                                plain[I]='V';
                            }
                            else if(cnumber==22){
                                plain[I]='W';
                            }
                            else if(cnumber==23){
                                plain[I]='X';
                            }
                            else if(cnumber==24){
                                plain[I]='Y';
                            }
                            else{
                                plain[I]='Z';
                            }
                        }
                        else{
                            plain[I]=' ';
                        }

                    }
                }
                for(int I=0;I<plain.length;I++){
                    binding.displayCiphertext.setText(String.copyValueOf(plain));
                }
                }



        });




    }


    public void backPrevious(View view) {
        onBackPressed();
    }
}
