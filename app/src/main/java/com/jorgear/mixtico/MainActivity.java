package com.jorgear.mixtico;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//comment
public class MainActivity extends AppCompatActivity {

    TextView tvColores;
    public BottomNavigationView bottomNavigationView;


    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvColores = findViewById(R.id.textViewColores);
        SharedPreferences sharedPreferences = getSharedPreferences("MiArchivoPreferences", Context.MODE_PRIVATE);
        int aciertoColor1 = sharedPreferences.getInt("aciertoColor1", 0);
        int aciertoColor2 = sharedPreferences.getInt("aciertoColor2", 0);
        int aciertoColor3 = sharedPreferences.getInt("aciertoColor3", 0);
        int aciertoColor4 = sharedPreferences.getInt("aciertoColor4", 0);
        int aciertoColor5 = sharedPreferences.getInt("aciertoColor5", 0);
        int aciertosColor = aciertoColor1 + aciertoColor2 + aciertoColor3 + aciertoColor4 + aciertoColor5;
        String aciertosColorString = String.valueOf(aciertosColor);
        tvColores.setText(aciertosColorString + "/5 aciertos");



        // Obtione la referencia al BottomNavigationView
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.placeholder);

        // Agrega el listener para manejar los eventos de clic en los elementos del menú
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            // Obtiene el ID del elemento seleccionado
            int itemId = item.getItemId();

            // Realiza acciones según el elemento seleccionado
            switch (itemId) {
                case R.id.info:
                    //Metodo para ir a Info
                    Intent info = new Intent(this, Info.class);
                    startActivity(info);
                    break;

                case R.id.exitapp:
                    // Metodo para Salir
                    mostrarDialogoDeConfirmacion();
                    break;
            }

            // Devuelve true para indicar que el evento ha sido manejado correctamente
            return true;
        });
    }


    //Metodo para Salir
    private void mostrarDialogoDeConfirmacion() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirmar salida");
        builder.setMessage("¿Estás seguro de que deseas salir de la aplicación?");

        builder.setPositiveButton("Salir", (dialog, which) -> {
            // Acción para salir de la aplicación
            finishAndRemoveTask();
        });

        builder.setNegativeButton("Cancelar", (dialog, which) -> {
            // Acción para cancelar la salida
            dialog.dismiss();
            bottomNavigationView.setSelectedItemId(R.id.placeholder);
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }




    //Metodo para ir a AnimalesLP
    public void Animales(View view){
        Intent animales = new Intent(this, AnimalesLP.class);
        startActivity(animales);
    }

    //Metodo para ir a ColoresLP
    public void Colores(View view){
        Intent colores = new Intent(this, ColoresLP.class);
        startActivity(colores);
    }

    //Metodo para ir a PronombresLP
    public void Pronombres(View view){
        Intent pronombres = new Intent(this, PronombresLP.class);
        startActivity(pronombres);
    }


    public void onBackPressed() {
        finishAffinity();
    }
}
