package com.spaceavoider.manckin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Ecologic extends AppCompatActivity {
    EditText EditText1, EditText2;
    TextView ScoreOut;
    int Score, a1, b1, k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecologic);
        EditText1 = findViewById(R.id.editTextTextPersonName1);
        EditText2 = findViewById(R.id.editTextTextPersonName2);
        ScoreOut = findViewById(R.id.textView4);
    }
    public void setScore() {
        String a = EditText1.getText().toString();
        String b = EditText2.getText().toString();
        a1 = Integer.parseInt(a);
        b1 = Integer.parseInt(b);
        if (a1 < b1){
            k = (a1/b1);
        }
        if (a1 > b1){
            k = (b1/a1);
        }
        if (a1 == b1){
            k = 1;
        }
        Score = k*(a1+b1);
    }
    public void Click(View view){
        ScoreOut.setText(Score);
    }
}