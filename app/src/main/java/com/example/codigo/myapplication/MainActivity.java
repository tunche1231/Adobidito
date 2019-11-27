package com.example.codigo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imgb_entrarapp;
    Button btn_entrarapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgb_entrarapp = findViewById(R.id.imgb_entrarapp);
        btn_entrarapp = findViewById(R.id.btn_entrarapp);

        imgb_entrarapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tarjeta_adobada.class);
                startActivity(intent);
            }
        });

        btn_entrarapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tarjeta_adobada.class);
                startActivity(intent);
            }
        });

    }
}
