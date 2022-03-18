package com.spaceavoider.manckin;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class Menu extends AppCompatActivity implements View.OnClickListener  {
    Button button, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
    }
    @Override
    public void onBackPressed() { moveTaskToBack(true);
    android.os.Process.killProcess(android.os.Process.myPid());
    System.exit(1); }
    @SuppressLint("NonConstantResourceId")
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent intent = new Intent(this, Activity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Toast toast = Toast.makeText(getApplicationContext(), "В разработке",Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button3:
                onBackPressed();
                break;
            default:
                break;
        }
    }
}