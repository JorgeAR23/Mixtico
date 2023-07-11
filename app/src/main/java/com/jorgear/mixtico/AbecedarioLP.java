package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AbecedarioLP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abecedario_lp);
    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, ColoresP1.class);
        startActivity(prueba);
    }

    public void Gato(View view){
    }
}