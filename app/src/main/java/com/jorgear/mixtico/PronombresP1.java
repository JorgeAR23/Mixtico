package com.jorgear.mixtico;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class PronombresP1 extends AppCompatActivity {

    RadioGroup radiog;
    RadioButton rb1, rb2, rb3, rb4;
    ImageView correctoimg, incorrectoimg;
    TextView correctotxt, incorrectotxt;
    Button button1;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    MediaPlayer mediaPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronombres_p1);

        radiog = findViewById(R.id.radioGroup);
        rb1 = findViewById(R.id.radioButton1);
        rb2 = findViewById(R.id.radioButton2);
        rb3 = findViewById(R.id.radioButton3);
        rb4 = findViewById(R.id.radioButton4);
        correctoimg = findViewById(R.id.correcto);
        incorrectoimg = findViewById(R.id.incorrecto);
        correctotxt = findViewById(R.id.respuestaCorrecta);
        incorrectotxt = findViewById(R.id.respuestaIncorrecta);
        button1 = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editTextMultiLine);
        editText.setKeyListener(null);
        sharedPreferences = getSharedPreferences("MiArchivoPreferences", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }


    //Metodo para el boton verificar respuesta
    public void Respuesta(View view) {
        if(rb1.isChecked()) {
            correctoimg.setVisibility(View.VISIBLE);
            correctotxt.setVisibility(View.VISIBLE);
            // Deshabilitar todas las opciones del RadioGroup
            for (int i = 0; i < radiog.getChildCount(); i++) {
                radiog.getChildAt(i).setEnabled(false);
            }
            mediaPlayer = MediaPlayer.create(this, R.raw.sonido_correcto);
            button1.setBackgroundColor(getResources().getColor(R.color.green));
            button1.setEnabled(false);

            //Manda el dato al MainActivity
            editor.putInt("aciertoPronombre1", 1);
            editor.apply();

            // Llama al método para ir a la siguiente actividad después del retraso
            new Handler().postDelayed(this::P2, 2000);

        }
        else if(rb2.isChecked()) {
            incorrectoimg.setVisibility(View.VISIBLE);
            incorrectotxt.setVisibility(View.VISIBLE);
            for (int i = 0; i < radiog.getChildCount(); i++) {
                radiog.getChildAt(i).setEnabled(false);
            }
            mediaPlayer = MediaPlayer.create(this, R.raw.sonido_incorrecto);
            button1.setBackgroundColor(getResources().getColor(R.color.red));
            button1.setEnabled(false);
            //Manda el dato al MainActivity
            editor.putInt("aciertoPronombre1", 0);
            editor.apply();
            // Llama al método para ir a la siguiente actividad después del retraso
            new Handler().postDelayed(this::P2, 2000);

        }
        else if(rb3.isChecked()) {
            incorrectoimg.setVisibility(View.VISIBLE);
            incorrectotxt.setVisibility(View.VISIBLE);
            for (int i = 0; i < radiog.getChildCount(); i++) {
                radiog.getChildAt(i).setEnabled(false);
            }
            mediaPlayer = MediaPlayer.create(this, R.raw.sonido_incorrecto);
            button1.setBackgroundColor(getResources().getColor(R.color.red));
            button1.setEnabled(false);
            //Manda el dato al MainActivity
            editor.putInt("aciertoPronombre1", 0);
            editor.apply();
            // Llama al método para ir a la siguiente actividad después del retraso
            new Handler().postDelayed(this::P2, 2000);

        }
        else if(rb4.isChecked()) {
            incorrectoimg.setVisibility(View.VISIBLE);
            incorrectotxt.setVisibility(View.VISIBLE);
            for (int i = 0; i < radiog.getChildCount(); i++) {
                radiog.getChildAt(i).setEnabled(false);
            }
            mediaPlayer = MediaPlayer.create(this, R.raw.sonido_incorrecto);
            button1.setBackgroundColor(getResources().getColor(R.color.red));
            button1.setEnabled(false);
            //Manda el dato al MainActivity
            editor.putInt("aciertoPronombre1", 0);
            editor.apply();
            // Llama al método para ir a la siguiente actividad después del retraso
            new Handler().postDelayed(this::P2, 2000);
        }
        // Reproduce el sonido si se ha cargado correctamente
        if (mediaPlayer != null) {
            // Libera los recursos del MediaPlayer
            mediaPlayer.setOnCompletionListener(MediaPlayer::release);
            mediaPlayer.start();
        }
    }


    //Dialogo de confirmacion para Salir
    private void mostrarDialogoDeConfirmacion() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirmar salida");
        builder.setMessage("¿Estás seguro de que deseas salir de la prueba?");

        builder.setPositiveButton("Salir", (dialog, which) -> {
            // Acción para salir del test
            Salir();
        });

        builder.setNegativeButton("Cancelar", (dialog, which) -> {
            // Acción para cancelar la salida
            dialog.dismiss();
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    //Metodo para ir a la siguiente pregunta
    public void P2(){
        Intent p2 = new Intent(this, PronombresP2.class);
        startActivity(p2);
    }

    //Metodo para salir a Inicio
    public void Salir() {
        Intent salir = new Intent(this, MainActivity.class);
        startActivity(salir);
    }

    //Metodo para el boton regresar a Inicio
    public void SalirBoton(View view){
        mostrarDialogoDeConfirmacion();
    }

    //Metodo para elegir que hace el boton de Regresar, si esta vacio lo desactiva
    @Override
    public void onBackPressed() {
        mostrarDialogoDeConfirmacion();
    }
}