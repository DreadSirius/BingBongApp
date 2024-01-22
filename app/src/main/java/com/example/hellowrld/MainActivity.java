package com.example.hellowrld;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        aSwitch = findViewById(R.id.switch1);
    }

    public void updateText(View view){
        if(aSwitch.isChecked()){
            textView.setText(R.string.switch_activated);
        } else {
            textView.setText(R.string.switch_not_activated);
        }
        System.out.println("Button Clicked");
    }
    @SuppressLint("SetTextI18n")
    public void takeTrash(View view){
        if(aSwitch.isChecked()){
            textView.setText("Taking Out Trash!");
        } else {
            textView.setText("Please turn on Power First!");
        }
    }
    @SuppressLint("SetTextI18n")
    public void followMe(View view){
        if(aSwitch.isChecked()){
            textView.setText("Following!");
        } else {
            textView.setText("Please turn on Power First!");
        }
    }
    @SuppressLint("SetTextI18n")
    public void Idle(View view){
        if(aSwitch.isChecked()){
            textView.setText("Idling!");
        } else {
            textView.setText("Please turn on Power First!");
        }
    }
}