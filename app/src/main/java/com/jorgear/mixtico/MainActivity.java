package com.jorgear.mixtico;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    SharedPreferences.Editor editor;

    private ImageButton btnModoClaro, btnModoOscuro;
    public BottomNavigationView bottomNavigationView;
    TextView tvAdverbios, tvAnimales, tvAnimo, tvCalendario, tvColores, tvCuerpo, tvFamilia,
             tvNumeros, tvObjetos, tvPronombres, tvSaludos, tvVerbos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnModoClaro = findViewById(R.id.imageButtonDay);
        btnModoOscuro = findViewById(R.id.imageButtonNight);

        SharedPreferences sharedPreferencesCO = getSharedPreferences("MiArchivoPreferences", Context.MODE_PRIVATE);
        editor = sharedPreferencesCO.edit();
        int modoCO = sharedPreferencesCO.getInt("modoCO", 0);
        if (modoCO == 1){
            btnModoClaro.setEnabled(false);
            btnModoOscuro.setEnabled(true);
        } else if (modoCO == 2) {
            btnModoClaro.setEnabled(true);
            btnModoOscuro.setEnabled(false);
        }

        SharedPreferences sharedPreferencesAciertos = getSharedPreferences("MiArchivoPreferences", Context.MODE_PRIVATE);
        tvAnimales = findViewById(R.id.textViewAnimales);
        int aciertoAnimal1 = sharedPreferencesAciertos.getInt("aciertoAnimal1", 0);
        int aciertoAnimal2 = sharedPreferencesAciertos.getInt("aciertoAnimal2", 0);
        int aciertoAnimal3 = sharedPreferencesAciertos.getInt("aciertoAnimal3", 0);
        int aciertoAnimal4 = sharedPreferencesAciertos.getInt("aciertoAnimal4", 0);
        int aciertoAnimal5 = sharedPreferencesAciertos.getInt("aciertoAnimal5", 0);
        int aciertosAnimal = aciertoAnimal1 + aciertoAnimal2 + aciertoAnimal3 + aciertoAnimal4 + aciertoAnimal5;
        int aciertosFinAnimal = sharedPreferencesAciertos.getInt("aciertosFinAnimal", 0);
        if (aciertosAnimal > aciertosFinAnimal){
            editor.putInt("aciertosFinAnimal", aciertosAnimal);
            editor.apply();
            String aciertosAnimalString = String.valueOf(aciertosAnimal);
            tvAnimales.setText(aciertosAnimalString + "/5 Aciertos");
        } else {
            // Mostrar el número de aciertos anterior
            String aciertosFinAnimalString = String.valueOf(aciertosFinAnimal);
            tvAnimales.setText(aciertosFinAnimalString + "/5 Aciertos");
        }

        tvAnimo = findViewById(R.id.textViewAnimo);
        int aciertoAnimo1 = sharedPreferencesAciertos.getInt("aciertoAnimo1", 0);
        int aciertoAnimo2 = sharedPreferencesAciertos.getInt("aciertoAnimo2", 0);
        int aciertoAnimo3 = sharedPreferencesAciertos.getInt("aciertoAnimo3", 0);
        int aciertoAnimo4 = sharedPreferencesAciertos.getInt("aciertoAnimo4", 0);
        int aciertoAnimo5 = sharedPreferencesAciertos.getInt("aciertoAnimo5", 0);
        int aciertosAnimo = aciertoAnimo1 + aciertoAnimo2 + aciertoAnimo3 + aciertoAnimo4 + aciertoAnimo5;
        int aciertosFinAnimo = sharedPreferencesAciertos.getInt("aciertosFinAnimo", 0);
        if (aciertosAnimo > aciertosFinAnimo){
            editor.putInt("aciertosFinAnimo", aciertosAnimo);
            editor.apply();
            String aciertosAnimoString = String.valueOf(aciertosAnimo);
            tvAnimo.setText(aciertosAnimoString + "/5 Aciertos");
        } else {
            // Mostrar el número de aciertos anterior
            String aciertosFinAnimoString = String.valueOf(aciertosFinAnimo);
            tvAnimo.setText(aciertosFinAnimoString + "/5 Aciertos");
        }

        tvColores = findViewById(R.id.textViewColores);
        int aciertoColor1 = sharedPreferencesAciertos.getInt("aciertoColor1", 0);
        int aciertoColor2 = sharedPreferencesAciertos.getInt("aciertoColor2", 0);
        int aciertoColor3 = sharedPreferencesAciertos.getInt("aciertoColor3", 0);
        int aciertoColor4 = sharedPreferencesAciertos.getInt("aciertoColor4", 0);
        int aciertoColor5 = sharedPreferencesAciertos.getInt("aciertoColor5", 0);
        int aciertosColor = aciertoColor1 + aciertoColor2 + aciertoColor3 + aciertoColor4 + aciertoColor5;
        int aciertosFinColor = sharedPreferencesAciertos.getInt("aciertosFinColor", 0);
        if (aciertosColor > aciertosFinColor){
            editor.putInt("aciertosFinColor", aciertosColor);
            editor.apply();
            String aciertosColorString = String.valueOf(aciertosColor);
            tvColores.setText(aciertosColorString + "/5 Aciertos");
        } else {
            // Mostrar el número de aciertos anterior
            String aciertosFinColorString = String.valueOf(aciertosFinColor);
            tvColores.setText(aciertosFinColorString + "/5 Aciertos");
        }

        tvCuerpo = findViewById(R.id.textViewCuerpo);
        int aciertoCuerpo1 = sharedPreferencesAciertos.getInt("aciertoCuerpo1", 0);
        int aciertoCuerpo2 = sharedPreferencesAciertos.getInt("aciertoCuerpo2", 0);
        int aciertoCuerpo3 = sharedPreferencesAciertos.getInt("aciertoCuerpo3", 0);
        int aciertoCuerpo4 = sharedPreferencesAciertos.getInt("aciertoCuerpo4", 0);
        int aciertoCuerpo5 = sharedPreferencesAciertos.getInt("aciertoCuerpo5", 0);
        int aciertosCuerpo = aciertoCuerpo1 + aciertoCuerpo2 + aciertoCuerpo3 + aciertoCuerpo4 + aciertoCuerpo5;
        int aciertosFinCuerpo = sharedPreferencesAciertos.getInt("aciertosFinCuerpo", 0);
        if (aciertosCuerpo > aciertosFinCuerpo){
            editor.putInt("aciertosFinCuerpo", aciertosCuerpo);
            editor.apply();
            String aciertosCuerpoString = String.valueOf(aciertosCuerpo);
            tvCuerpo.setText(aciertosCuerpoString + "/5 Aciertos");
        } else {
            // Mostrar el número de aciertos anterior
            String aciertosFinCuerpoString = String.valueOf(aciertosFinCuerpo);
            tvCuerpo.setText(aciertosFinCuerpoString + "/5 Aciertos");
        }

        tvFamilia = findViewById(R.id.textViewFamilia);
        int aciertoFamilia1 = sharedPreferencesAciertos.getInt("aciertoFamilia1", 0);
        int aciertoFamilia2 = sharedPreferencesAciertos.getInt("aciertoFamilia2", 0);
        int aciertoFamilia3 = sharedPreferencesAciertos.getInt("aciertoFamilia3", 0);
        int aciertoFamilia4 = sharedPreferencesAciertos.getInt("aciertoFamilia4", 0);
        int aciertoFamilia5 = sharedPreferencesAciertos.getInt("aciertoFamilia5", 0);
        int aciertosFamilia = aciertoFamilia1 + aciertoFamilia2 + aciertoFamilia3 + aciertoFamilia4 + aciertoFamilia5;
        int aciertosFinFamilia = sharedPreferencesAciertos.getInt("aciertosFinFamilia", 0);
        if (aciertosFamilia > aciertosFinFamilia){
            editor.putInt("aciertosFinFamilia", aciertosFamilia);
            editor.apply();
            String aciertosFamiliaString = String.valueOf(aciertosFamilia);
            tvFamilia.setText(aciertosFamiliaString + "/5 Aciertos");
        } else {
            // Mostrar el número de aciertos anterior
            String aciertosFinFamiliaString = String.valueOf(aciertosFinFamilia);
            tvFamilia.setText(aciertosFinFamiliaString + "/5 Aciertos");
        }



        // Obtione la referencia al BottomNavigationView
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.placeholder);

        // Agrega el listener para manejar los eventos de clic en los elementos del menú
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            // Obtiene el ID del elemento seleccionado
            int itemId = item.getItemId();

            // Realiza acciones según el elemento seleccionado
            if (itemId == R.id.info) {
                    //Metodo para ir a Info
                    Intent info = new Intent(this, Info.class);
                    startActivity(info);
                    return true;
            } else if (itemId == R.id.creditos) {
                    // Metodo para ir a Creditos
                    Intent creditos = new Intent(this, Creditos.class);
                    startActivity(creditos);
                    return true;
            }

            // Devuelve false si no se ha manejado correctamente el evento
            return false;
        });
    }


    private void establecerTemaClaro() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        editor.putInt("modoCO", 1);
        editor.apply();
        btnModoClaro.setEnabled(false);
        btnModoOscuro.setEnabled(true);
    }

    private void establecerTemaOscuro() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        editor.putInt("modoCO", 2);
        editor.apply();
        btnModoClaro.setEnabled(true);
        btnModoOscuro.setEnabled(false);

    }

    public void Claro(View view){
        establecerTemaClaro();
    }
    public void Oscuro(View view){
        establecerTemaOscuro();
    }



    //Metodo para ir a AnimalesLP
    public void Animales(View view){
        Intent animales = new Intent(this, AnimalesLP.class);
        startActivity(animales);
    }

    //Metodo para ir a AnimoLP
    public void Animo(View view){
        Intent animo = new Intent(this, AnimoLP.class);
        startActivity(animo);
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



    //Metodo para la accion al presionar el boton del sistema "Regresar"
    public void onBackPressed() {
        finishAffinity();
    }
}
