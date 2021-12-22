package com.ybennun.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private Button makeItRain;
    private Button showInfo;
    private TextView moneyValue;
    private int moneyCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeItRain = findViewById(R.id.buttonMakeItRain);
        moneyValue = findViewById(R.id.moneyValue);

        //makeItRain.setOnClickListener(view -> Log.d("MainActivity","onClick: Make it rain!"));
    }

    public void showMoney(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        moneyCounter += 1000;
        moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter)));
        //Log.d("MIR", "onClick: " + moneyCounter);
    }
}