package com.usman.quranapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonForParah = findViewById(R.id.btnReadParah);
        Button buttonForSurah = findViewById(R.id.btnReadSurah);
        Button buttonForAllSurah = findViewById(R.id.btnAllSurah);
        Button buttonForQuranPak = findViewById(R.id.btnReadQuran);

        buttonForParah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paraIntent = new Intent(MainActivity.this, ReadParah.class);
                startActivity(paraIntent);
            }
        });

        buttonForSurah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent surahIntent = new Intent(MainActivity.this, ReadSurah.class);
                startActivity(surahIntent);
            }
        });

        buttonForAllSurah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent allSurahIntent = new Intent(MainActivity.this, AllSurah.class);
                startActivity(allSurahIntent);
            }
        });

        buttonForQuranPak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quranIntent = new Intent(MainActivity.this, QuranPak.class);
                startActivity(quranIntent);
            }
        });

    }
}