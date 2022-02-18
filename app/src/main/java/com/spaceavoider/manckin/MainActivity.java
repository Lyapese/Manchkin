package com.spaceavoider.manckin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.view1);

        textView.setText (Integer.toString(x));

    }
    int x;

    public Button clickMyBtnMin(View view1) {
        x = x++;
        return (Button) view1;
    }


}
