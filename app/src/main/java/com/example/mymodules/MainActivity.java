package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textViewC346;
    TextView textViewC203;
    TextView textViewC206;
    TextView textViewC218;
    TextView textViewC235;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewC346 = findViewById(R.id.textView2);
        textViewC203 =  findViewById(R.id.textView3);
        textViewC206 = findViewById(R.id.textView4);
        textViewC218 = findViewById(R.id.textView5);
        textViewC235 = findViewById(R.id.textView6);


        textViewC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DisplayModule.class);
                intent.putExtra("ModuleCode", "C346");
                startActivity(intent);

            }
        });

        textViewC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayModule.class);
                intent.putExtra("ModuleCode", "C203");
                startActivity(intent);

            }
        });

        textViewC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayModule.class);
                intent.putExtra("ModuleCode", "C206");
                startActivity(intent);

            }
        });

        textViewC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayModule.class);
                intent.putExtra("ModuleCode", "C218");
                startActivity(intent);
            }
        });

        textViewC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayModule.class);
                intent.putExtra("ModuleCode", "C235");
                startActivity(intent);

            }
        });




    }
}