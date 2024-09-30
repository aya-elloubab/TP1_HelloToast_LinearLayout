package com.example.tp1exercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button toast, count;
    private TextView number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast = findViewById(R.id.toastBtn);
        count = findViewById(R.id.countBtn);
        number = findViewById(R.id.number);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Toast", Toast.LENGTH_LONG).show();
            }
        });

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nbr = Integer.parseInt(number.getText().toString());
                nbr+=1;
                number.setText(String.valueOf(nbr));
            }
        });

    }
}