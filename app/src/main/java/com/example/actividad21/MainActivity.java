package com.example.actividad21;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private ImageView ftImg;
    private Button btnPasar;

    @SuppressLint({"MissingInflatedId", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        ftImg = findViewById(R.drawable.img);
        btnPasar = findViewById(R.id.btnPasar);


        btnPasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explicito();
            }
        });
    }

    private void explicito() {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("nombre",txtNombre.getText().toString());
        intent.putExtra("imagen",R.drawable.img);
        startActivity(intent);
    }
}