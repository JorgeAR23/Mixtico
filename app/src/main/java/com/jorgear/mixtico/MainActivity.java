package com.jorgear.mixtico;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//comment
public class MainActivity extends AppCompatActivity {

    public BottomNavigationView bottomNavigationView;
    TextView tvAnimales, tvColores;
    ImageButton bDia;
    ImageButton bNoche;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bDia = findViewById(R.id.imageButtonDay);
        bNoche = findViewById(R.id.imageButtonNight);

        tvAnimales = findViewById(R.id.textViewAnimales);
        SharedPreferences sharedPreferencesAnimal = getSharedPreferences("MiArchivoPreferences", Context.MODE_PRIVATE);
        int aciertoAnimal1 = sharedPreferencesAnimal.getInt("aciertoAnimal1", 0);
        int aciertoAnimal2 = sharedPreferencesAnimal.getInt("aciertoAnimal2", 0);
        int aciertoAnimal3 = sharedPreferencesAnimal.getInt("aciertoAnimal3", 0);
        int aciertoAnimal4 = sharedPreferencesAnimal.getInt("aciertoAnimal4", 0);
        int aciertoAnimal5 = sharedPreferencesAnimal.getInt("aciertoAnimal5", 0);
        int aciertosAnimal = aciertoAnimal1 + aciertoAnimal2 + aciertoAnimal3 + aciertoAnimal4 + aciertoAnimal5;
        String aciertosAnimalString = String.valueOf(aciertosAnimal);
        tvAnimales.setText(aciertosAnimalString + "/5 Aciertos");

        tvColores = findViewById(R.id.textViewColores);
        SharedPreferences sharedPreferencesColor = getSharedPreferences("MiArchivoPreferences", Context.MODE_PRIVATE);
        int aciertoColor1 = sharedPreferencesColor.getInt("aciertoColor1", 0);
        int aciertoColor2 = sharedPreferencesColor.getInt("aciertoColor2", 0);
        int aciertoColor3 = sharedPreferencesColor.getInt("aciertoColor3", 0);
        int aciertoColor4 = sharedPreferencesColor.getInt("aciertoColor4", 0);
        int aciertoColor5 = sharedPreferencesColor.getInt("aciertoColor5", 0);
        int aciertosColor = aciertoColor1 + aciertoColor2 + aciertoColor3 + aciertoColor4 + aciertoColor5;
        String aciertosColorString = String.valueOf(aciertosColor);
        tvColores.setText(aciertosColorString + "/5 Aciertos");
        if(aciertosColorString.equals("5"))  {
            tvColores.setTextColor(getResources().getColor(R.color.green));
        }

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

                case R.id.creditos:
                    // Metodo para Salir
                    Intent creditos = new Intent(this, Creditos.class);
                    startActivity(creditos);
                    break;
            }

            // Devuelve true para indicar que el evento ha sido manejado correctamente
            return true;
        });
    }


    //Metodo para ir a AnimalesLP
    public void Abecedario(View view){
        Intent abecedario = new Intent(this, AdverbiosLP.class);
        startActivity(abecedario);
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

    //Metodo para ir a ColoresLP
    public void Cuerpo(View view){
        Intent cuerpo = new Intent(this, CuerpoLP.class);
        startActivity(cuerpo);
    }


    //Metodo para ir a FamiliaLP
    public void Familia(View view){
        Intent familia = new Intent(this, FamiliaLP.class);
        startActivity(familia);
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
