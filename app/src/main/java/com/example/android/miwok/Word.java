package com.example.android.miwok;

public class Word {
    private final String mEnglish;
    private final String mMiwok;

    public Word(String english, String miwok) {
        mEnglish = english;
        mMiwok = miwok;
    }

    public String getEnglish() {
        return mEnglish;
    }

    public String getMiwok() {
        return mMiwok;
    }
}