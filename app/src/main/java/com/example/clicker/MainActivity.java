package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners(){
        Button btnToast = findViewById(R.id.btn_toast);
        Button btnCount = findViewById(R.id.btn_count);

        TextView tvCounter = findViewById(R.id.tv_counter);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hello toast! "+ tvCounter.getText().toString(), Toast.LENGTH_SHORT).show();            }
        });

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = 0;
                if(!tvCounter.getText().toString().isEmpty()){
                    value  = Integer.parseInt(tvCounter.getText().toString());
                }
                int quantity = value + 1;
                tvCounter.setText(String.valueOf(quantity));
            }
        });
    }

}