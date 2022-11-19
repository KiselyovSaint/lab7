package com.example.lab7l;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button) findViewById(R.id.btnStart);

        View.OnClickListener btnStart = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                btnStart.onClick(setVisible(false););
            }

            public void onClickStart(View v) {
                // действия при нажатии на кнопку
            }
        }
    }
}