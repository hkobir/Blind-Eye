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

import com.hk.blindeye.databinding.ActivityDecryptionBinding;

public class DecryptionActivity extends AppCompatActivity {
    private ActivityDecryptionBinding binding;

    //initialize lettervalue and key for cipher
    private int key=17;
    private int a=0,b=1,c=2,d=3,e=4,f=5,g=6,h=7,i=8,j=9,k=10,l=11,m=12,n=13,o=14,p=15,q=16,r=17,s=18,t=19,u=20,v=21,w=22,x=23,y=24,z=25;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_decryption);

        setSupportActionBar(binding.customToolBar);

        //text change listener add for clear button
        binding.ciphertextET.addTextChangedListener(TextWatcher());


        //process of button listner

        process();



    }


    //create text_change method for clearButton visibility

    private TextWatcher TextWatcher() {
        // TODO Auto-generated method stub
        return new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(binding.ciphertextET.getText().toString().isEmpty()) {
                    binding.clearTextButton.setVisibility(View.GONE);
                }
                else {
                    binding.clearTextButton.setVisibility(View.VISIBLE);
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
    public  void process(){
        //clear button
        binding.clearTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.ciphertextET.setText("");
                binding.displayPlaintext.setText("");
            }
        });

        //copy cipher text button impliment
        binding.copyPmessageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Copied Text",binding.displayPlaintext.getText().toString());
                clipboard.setPrimaryClip(clipData);

                //show snackBar message
                Snackbar snackbar=Snackbar.make(binding.decryptLinearlayout,"Copied Text Successfully",Snackbar.LENGTH_LONG);
                snackbar.show();
                //Toast.makeText(DecryptionActivity.this, "Copied Text", Toast.LENGTH_SHORT).show();
            }
        });





        //decryption process
        binding.decryptionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text=binding.ciphertextET.getText().toString().trim();
                char[] plain=text.toCharArray();
                int cnumber=0;

                if(text.equals("")){

                    binding.ciphertextET.setError("Enter your message");
                    binding.ciphertextET.requestFocus();
                   // Toast.makeText(DecryptionActivity.this, "Empty TextField!", Toast.LENGTH_LONG).show();
                }
                else{
                    for(int I=0;I<plain.length;I++){
                        if(plain[I]=='A'){

                            // additive cipher with adding key and cipher
                            cnumber=(a-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }


                        }
                        else if(plain[I]=='B'){

                            // additive cipher with adding key and cipher
                            cnumber=(b-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }

                        else if(plain[I]=='C'){
                            // additive cipher with adding key and cipher
                            cnumber=(c-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='D'){
                            // additive cipher with adding key and cipher
                            cnumber=(d-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='E'){
                            // additive cipher with adding key and cipher
                            cnumber=(e-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='F'){
                            // additive cipher with adding key and cipher
                            cnumber=(f-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='G'){
                            // additive cipher with adding key and cipher
                            cnumber=(g-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='H'){
                            // additive cipher with adding key and cipher
                            cnumber=(h-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='I'){
                            // additive cipher with adding key and cipher
                            cnumber=(i-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='J'){
                            // additive cipher with adding key and cipher
                            cnumber=(j-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='K'){
                            // additive cipher with adding key and cipher
                            cnumber=(k-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='L'){
                            cnumber=(l-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='M'){
                            // additive cipher with adding key and cipher
                            cnumber=(m-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='N'){
                            // additive cipher with adding key and cipher
                            cnumber=(n-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='O'){
                            // additive cipher with adding key and cipher
                            cnumber=(o-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='P'){
                            // additive cipher with adding key and cipher
                            cnumber=(p-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='Q'){
                            // additive cipher with adding key and cipher
                            cnumber=(q-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='R'){
                            // additive cipher with adding key and cipher
                            cnumber=(r-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='S'){
                            // additive cipher with adding key and cipher
                            cnumber=(s-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='T'){
                            // additive cipher with adding key and cipher
                            cnumber=(t-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='U'){
                            // additive cipher with adding key and cipher
                            cnumber=(u-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='V'){
                            // additive cipher with adding key and cipher
                            cnumber=(v-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='W'){
                            // additive cipher with adding key and cipher
                            cnumber=(w-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='X'){
                            // additive cipher with adding key and cipher
                            cnumber=(x-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='Y'){
                            // additive cipher with adding key and cipher
                            cnumber=(y-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else if(plain[I]=='Z'){
                            // additive cipher with adding key and cipher
                            cnumber=(z-key);       //if value would be negative
                            while(cnumber<0){
                                cnumber=cnumber+26;
                            }
                            cnumber=(cnumber%26);
                            //check cipher letter after substitution
                            if(cnumber==0){
                                plain[I]='a';
                            }

                            else if(cnumber==1){
                                plain[I]='b';
                            }


                            else if(cnumber==2){
                                plain[I]='c';
                            }
                            else if(cnumber==3){
                                plain[I]='d';
                            }
                            else if(cnumber==4){
                                plain[I]='e';
                            }
                            else if(cnumber==5){
                                plain[I]='f';
                            }
                            else if(cnumber==6){
                                plain[I]='g';
                            }
                            else if(cnumber==7){
                                plain[I]='h';
                            }
                            else if(cnumber==8){
                                plain[I]='i';
                            }
                            else if(cnumber==9){
                                plain[I]='j';
                            }
                            else if(cnumber==10){
                                plain[I]='k';
                            }
                            else if(cnumber==11){
                                plain[I]='l';
                            }
                            else if(cnumber==12){
                                plain[I]='m';
                            }
                            else if(cnumber==13){
                                plain[I]='n';
                            }
                            else if(cnumber==14){
                                plain[I]='o';
                            }

                            else if(cnumber==15){
                                plain[I]='p';
                            }
                            else if(cnumber==16){
                                plain[I]='q';
                            }
                            else if(cnumber==17){
                                plain[I]='r';
                            }
                            else if(cnumber==18){
                                plain[I]='s';
                            }
                            else if(cnumber==19){
                                plain[I]='t';
                            }
                            else if(cnumber==20){
                                plain[I]='u';
                            }
                            else if(cnumber==21){
                                plain[I]='v';
                            }
                            else if(cnumber==22){
                                plain[I]='w';
                            }
                            else if(cnumber==23){
                                plain[I]='x';
                            }
                            else if(cnumber==24){
                                plain[I]='y';
                            }
                            else{
                                plain[I]='z';
                            }
                        }
                        else{
                            plain[I]=' ';
                        }

                    }
                }
                for(int I=0;I<plain.length;I++){
                    binding.displayPlaintext.setText(String.copyValueOf(plain));
                }



            }
        });








    }     //end process method


    public void backPrevious(View view) {
        onBackPressed();

    }
}
