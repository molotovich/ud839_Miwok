package com.example.android.miwok;

public class Word {
    private String mEnglish;
    private String mMiwok;
    private int mImagen;

    private int mAudio;

    public Word(String english, String miwok, int imagen, int audio) {
        this.mEnglish = english;
        this.mMiwok = miwok;
        this.mImagen = imagen;
        this.mAudio = audio;
    }

    public Word(String english, String miwok, int audio) {
        this.mEnglish = english;
        this.mMiwok = miwok;
        this.mAudio = audio;
    }

    public String getEnglish() {
        return mEnglish;
    }

    public String getMiwok() {
        return mMiwok;
    }

    public int getImagen() {
        return mImagen;
    }

    public int getAudio() {
        return mAudio;
    }
}