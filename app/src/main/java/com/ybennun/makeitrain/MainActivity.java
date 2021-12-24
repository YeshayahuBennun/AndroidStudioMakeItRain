package com.ybennun.makeitrain;

import static com.ybennun.makeitrain.R.color.orange;
import static com.ybennun.makeitrain.R.color.purple_700;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TextView moneyValue;
    private int moneyCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyValue = findViewById(R.id.moneyValue);

        moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this, orange));


    }

    public void showMoney(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        moneyCounter += 1000;
        moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter)));

        switch (moneyCounter) {
            case 20000:
                moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this, purple_700));
                break;
            case 30000:
                moneyValue.setTextColor(Color.MAGENTA);
                break;
            case 40000:
                moneyValue.setTextColor(Color.LTGRAY);
                break;
            default:
                moneyValue.setTextColor(Color.WHITE);
        }

    }

    public void showInfo(View view) {


        Snackbar.make(moneyValue, R.string.app_info, Snackbar.LENGTH_LONG).setAction("More", view1 -> {
            Log.d("Snack", "ShowInfo: SnackBar More");
        }).show();
    }
}