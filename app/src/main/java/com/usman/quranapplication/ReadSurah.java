package com.usman.quranapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReadSurah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_surah);

        EditText paraText = findViewById(R.id.editTextSurahNumber);
        final int[] number = new int[1];
        final int[] startSurah = new int[1];
        final int[] endSurah = new int[1];
        Button buttonGo = findViewById(R.id.btnReadSurahByNo);
        TextView textView = findViewById(R.id.txtViewQuran);


        QuranArabicText Quran = new QuranArabicText();
        QDH allData = new QDH();


        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number[0] = Integer.parseInt(paraText.getText().toString());
                int total = allData.getSurahVerses(number[0]-1) + 1;
                startSurah[0] = allData.getSurahStart(number[0]-1);
                endSurah[0] = startSurah[0] + total;
                String str=String.join(" ", Quran.GetData(startSurah[0]-1,endSurah[0]-1));
                textView.setText(str);
            }
        });
    }
}