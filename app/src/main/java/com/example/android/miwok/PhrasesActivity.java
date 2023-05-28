package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words= new ArrayList<Word>();
        words.add(new Word ("One","Lutti"));
        words.add(new Word ("Two","Otiiko"));
        words.add(new Word ("Three","Tolookosu"));
        words.add(new Word ("Four","Oyyisa"));
        words.add(new Word ("Five","Massokka"));
        words.add(new Word ("Six","Temmokka"));
        words.add(new Word ("Seven","Kenekaku"));
        words.add(new Word ("Eight","Kawinta"));
        words.add(new Word ("Nine","Wo'e"));
        words.add(new Word ("Ten","Na'aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this,words);
        ListView listview = findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
    }
}