package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word>androidWords){
        super(context,0,androidWords);
    }
    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItemView = convertView;
        Word currentWord = getItem(position);
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(
                    R.layout.listitem,parent,false);
        }
        TextView texto1 = (TextView) listItemView.findViewById(R.id.miwok_number);
        texto1.setText(currentWord.getMiwok());

        TextView texto2 = (TextView) listItemView.findViewById(R.id.english_number);
        texto2.setText(currentWord.getEnglish());
        return listItemView;
    }

}
