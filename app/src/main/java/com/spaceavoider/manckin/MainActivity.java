package com.spaceavoider.manckin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int x = 1;
    private int y = 1;
    private int a = 1;
    private int b = 1;
    private int c = 1;
    private int d = 1;

    @SuppressLint("ResourceAsColor")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView view1 = findViewById(R.id.view1);

        findViewById(R.id.buttonMin1).setOnClickListener( v -> {
            if (x > 1) {
                x--;
                view1.setText(String.valueOf(x));
            } else {
                view1.setText(String.valueOf(x));
            }
        });
        findViewById(R.id.buttonMax1).setOnClickListener( v -> {
            if (x < 10) {
                x++;
                view1.setText(String.valueOf(x));
            } else {
                view1.setText(String.valueOf(x));
            }
        });

        TextView view2 = findViewById(R.id.view2);

        findViewById(R.id.buttonMin2).setOnClickListener( v -> {
            if (y > 1) {
                y--;
                view2.setText(String.valueOf(y));
            } else {
                view2.setText(String.valueOf(y));
            }
        });
        findViewById(R.id.buttonMax2).setOnClickListener( v -> {
            if (y < 10) {
                y++;
                view2.setText(String.valueOf(y));
            } else {
                view2.setText(String.valueOf(y));
            }
        });

        TextView view3 = findViewById(R.id.view3);

        findViewById(R.id.buttonMin3).setOnClickListener( v -> {
            if (a > 1) {
                a--;
                view3.setText(String.valueOf(a));
            } else {
                view3.setText(String.valueOf(a));
            }
        });
        findViewById(R.id.buttonMax3).setOnClickListener( v -> {
            if (a < 10) {
                a++;
                view3.setText(String.valueOf(a));
            } else {
                view3.setText(String.valueOf(a));
            }
        });

        TextView view4 = findViewById(R.id.view4);

        findViewById(R.id.buttonMin4).setOnClickListener( v -> {
            if (b > 1) {
                b--;
                view4.setText(String.valueOf(b));
            } else {
                view4.setText(String.valueOf(b));
            }
        });
        findViewById(R.id.buttonMax4).setOnClickListener( v -> {
            if (b < 10) {
                b++;
                view4.setText(String.valueOf(b));
            } else {
                view4.setText(String.valueOf(b));
            }
        });

        TextView view5 = findViewById(R.id.view5);

        findViewById(R.id.buttonMin5).setOnClickListener( v -> {
            if (c > 1) {
                c--;
                view5.setText(String.valueOf(c));
            } else {
                view5.setText(String.valueOf(c));
            }
        });
        findViewById(R.id.buttonMax5).setOnClickListener( v -> {
            if (c < 10) {
                c++;
                view5.setText(String.valueOf(c));
            } else {
                view5.setText(String.valueOf(c));
            }
        });

        TextView view6 = findViewById(R.id.view6);

        findViewById(R.id.buttonMin6).setOnClickListener( v -> {
            if (d > 1) {
                d--;
                view6.setText(String.valueOf(d));
            } else {
                view6.setText(String.valueOf(d));
            }
        });
        findViewById(R.id.buttonMax6).setOnClickListener( v -> {
            if (d < 10) {
                d++;
                view6.setText(String.valueOf(d));
            } else {
                view6.setText(String.valueOf(d));
            }
        });

    }


}
