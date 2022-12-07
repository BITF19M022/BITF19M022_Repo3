package com.usman.quranapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReadParah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_parah);

        EditText paraText = findViewById(R.id.editTextSurahNumber);
        final int[] number = new int[1];
        Button buttonGo = findViewById(R.id.btnReadSurahByNo);
        TextView textView = findViewById(R.id.txtViewQuran);


        QuranArabicText Quran = new QuranArabicText();
        QDH allData = new QDH();

        final int[] startOfParah = new int[1];
        final int[] endOfParah = new int[1];


        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number[0] = Integer.parseInt(paraText.getText().toString());
                if(number[0] == 30)
                {
                    startOfParah[0] = allData.getParahStart(number[0]-1);
                    endOfParah[0] = 6342 + 6;
                }
                else
                {
                    startOfParah[0] = allData.getParahStart(number[0]-1);
                    endOfParah[0] = allData.getParahStart(number[0]);
                }
                String str=String.join(" ", Quran.GetData(startOfParah[0]-1,endOfParah[0]-1));
                textView.setText(str);
            }
        });

    }
}