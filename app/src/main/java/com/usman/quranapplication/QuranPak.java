package com.usman.quranapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class QuranPak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_pak);

        QuranArabicText Quran = new QuranArabicText();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                Quran.GetData(0,Quran.getSize()));

        ListView listView = findViewById(R.id.listViewAllSurah);
        listView.setAdapter(adapter);
    }
}