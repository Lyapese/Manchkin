package com.spaceavoider.manckin;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ecologic extends AppCompatActivity {
    EditText EditText1, EditText2;
    TextView ScoreOut;
    double a1;
    double b1;
    String x;
    float k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecologic);
        EditText1 = findViewById(R.id.EditEco);
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
            k = (float) ((a1/b1)*(a1+b1));
            DecimalFormat decimalFormat = new DecimalFormat("#.#");
            x = decimalFormat.format(k);
        }
        if (a1 > b1){
            k = (float) ((b1/a1)*(a1+b1));
            DecimalFormat decimalFormat = new DecimalFormat("#.#");
            x = decimalFormat.format(k);
        }
        if (a1 == b1){
            k = (int) (a1+b1);
            x = Integer.toString((int) k);
        }
    ScoreOut.setText(x);
    }
}