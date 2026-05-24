package com.example.bibliothequeapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Livre livre = (Livre) getIntent().getSerializableExtra("livre");

        if (livre != null) {
            TextView tvTitre = findViewById(R.id.tvTitre);
            TextView tvAuteur = findViewById(R.id.tvAuteur);
            TextView tvIsbn = findViewById(R.id.tvIsbn);
            TextView tvDisponibilite = findViewById(R.id.tvDisponibilite);

            tvTitre.setText(livre.getTitre());
            tvAuteur.setText("Auteur : " + livre.getAuteur());
            tvIsbn.setText("ISBN : " + livre.getIsbn());
            tvDisponibilite.setText(livre.isDisponible() ? "Disponible" : "Indisponible");
        }
    }
}