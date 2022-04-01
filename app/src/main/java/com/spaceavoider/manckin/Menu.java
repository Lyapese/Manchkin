package com.spaceavoider.manckin;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
public class Menu extends AppCompatActivity implements View.OnClickListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    @Override
    public void onBackPressed() { moveTaskToBack(true);
    android.os.Process.killProcess(android.os.Process.myPid());
    System.exit(1); }
    @SuppressLint("NonConstantResourceId")
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent intent = new Intent(Menu.this, Manckin.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Toast toast = Toast.makeText(getApplicationContext(), "В разработке",Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button3:
                finishAndRemoveTask();
                break;
            case R.id.button4:
                Intent intent2 = new Intent(Menu.this, Ecologic.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}