package com.example.actividad21;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView txtNombre;
    private ImageView ftFoto2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtNombre = findViewById(R.id.idNombre);
        ftFoto2 = findViewById(R.id.idFoto_2);

        String nombre = getIntent().getExtras().getString("nombre");
        int imagen = getIntent().getIntExtra("imagen",0);
        txtNombre.setText(nombre);
        ftFoto2.setImageResource(imagen);
    }
}