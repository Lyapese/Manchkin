package com.spaceavoider.manckin;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ecologic extends AppCompatActivity {
    EditText EditText1, EditText2;
    TextView ScoreOut;
    double a1, b1, y, k, x;
    String val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecologic);
        EditText1 = findViewById(R.id.editTextTextPersonName6);
        EditText2 = findViewById(R.id.EditMoney);
        ScoreOut = findViewById(R.id.ScoreView);
    }
@SuppressLint("NonConstantResourceId")
    public void Score(View v) {
        String a, b;
        a = EditText1.getText().toString();
        b = EditText2.getText().toString();
        a1 = Float.parseFloat(a);
        b1 = Float.parseFloat(b);
        if (a1 == 0){
            a1 = 1.0;
        }
        if (b1 == 0) {
            b1 = 1.0;
        }
        if (a1 < b1){
            k = (double) ((a1/b1)*(a1+b1));
            x = Math.pow(10, 1);
            y = Math.ceil(k * x)/x;
            val = Float.toString((float) y);
        }
        if (a1 > b1){
            k = (double) ((b1/a1)*(a1+b1));
            x = Math.pow(10, 1);
            y = Math.ceil(k * x)/x;
            val = Float.toString((float) y);
        }
        if (a1 == b1){
            k = (int) (a1+b1);
            val = Integer.toString((int) k);
        }
    ScoreOut.setText(val);
    }
}