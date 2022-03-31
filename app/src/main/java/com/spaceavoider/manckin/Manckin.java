package com.spaceavoider.manckin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class Manckin extends AppCompatActivity {

    private int x = 1;
    private int y = 1;
    private int a = 1;
    private int b = 1;
    private int c = 1;
    private int d = 1;
    EditText editTextTextPersonName1 = findViewById(R.id.editTextTextPersonName1);
    EditText editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
    EditText editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
    EditText editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
    EditText editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
    EditText editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
    String Name1;
    String Name2;
    String Name3;
    String Name4;
    String Name5;
    String Name6;
    SharedPreferences myPreferences;

    @SuppressLint("ResourceAsColor")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPreferences = PreferenceManager.getDefaultSharedPreferences(Manckin.this);
        Name1 = myPreferences.getString("Name1", Name1);
        Name2 = myPreferences.getString("Name2", Name2);
        Name3 = myPreferences.getString("Name3", Name3);
        Name4 = myPreferences.getString("Name4", Name4);
        Name5 = myPreferences.getString("Name5", Name5);
        Name6 = myPreferences.getString("Name6", Name6);
        editTextTextPersonName1.setText(Name1);
        editTextTextPersonName2.setText(Name2);
        editTextTextPersonName3.setText(Name3);
        editTextTextPersonName4.setText(Name4);
        editTextTextPersonName5.setText(Name5);
        editTextTextPersonName6.setText(Name6);

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

        editTextTextPersonName1.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                Name1 = s.toString();
                SharedPreferences.Editor myEditor = myPreferences.edit();
                myEditor.putString("Name1", Name1);
                myEditor.apply();

            }
        });
        editTextTextPersonName2.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                Name2 = s.toString();
                SharedPreferences.Editor myEditor = myPreferences.edit();
                myEditor.putString("Name2", Name2);
                myEditor.apply();
            }
        });
        editTextTextPersonName3.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                Name3 = s.toString();
                SharedPreferences.Editor myEditor = myPreferences.edit();
                myEditor.putString("Name3", Name3);
                myEditor.apply();
            }
        });
        editTextTextPersonName4.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                Name4 = s.toString();
                SharedPreferences.Editor myEditor = myPreferences.edit();
                myEditor.putString("Name4", Name4);
                myEditor.apply();
            }
        });
        editTextTextPersonName5.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                Name5 = s.toString();
                SharedPreferences.Editor myEditor = myPreferences.edit();
                myEditor.putString("Name5", Name5);
                myEditor.apply();
            }
        });
        editTextTextPersonName6.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                Name6 = s.toString();
                SharedPreferences.Editor myEditor = myPreferences.edit();
                myEditor.putString("Name6", Name6);
                myEditor.apply();
            }
        });

    }


}
