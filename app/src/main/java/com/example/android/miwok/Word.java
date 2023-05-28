package com.example.android.miwok;

public class Word {
     private String mEnglish;
     private String mMiwok;

     public Word(String english, String miwok){
         mEnglish=english;
         mMiwok=miwok;
     }

     public String getEnglish(){
         return mEnglish;
     }

     public String getMiwok(){
         return mMiwok;
     }
}