package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Creditos extends AppCompatActivity {

    public BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        // Obtione la referencia al BottomNavigationView
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.creditos);

        // Agrega el listener para manejar los eventos de clic en los elementos del menú
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            // Obtener el ID del elemento seleccionado
            int itemId = item.getItemId();

            // Realiza acciones según el elemento seleccionado
            if (itemId == R.id.placeholder) {
                    //Metodo para ir a Inicio
                    Intent inicio = new Intent(this, MainActivity.class);
                    startActivity(inicio);
                    return true;
            } else if (itemId == R.id.info) {
                    // Metodo para ir a Info
                    Intent info = new Intent(this, Info.class);
                    startActivity(info);
                    return true;
            }

            // Devuelve false si no se ha manejado correctamente el evento
            return false;
        });
    }

    //Metodo para ir a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

}