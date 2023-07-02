package com.jorgear.mixtico;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ColoresP1 extends AppCompatActivity {

    RadioGroup radiog;
    RadioButton rb1, rb2, rb3, rb4;
    ImageView correctoimg, incorrectoimg;
    TextView correctotxt, incorrectotxt;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores_p1);

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

    }


    //Metodo para el boton verificar respuesta
    public void Respuesta(View view) {
        if(rb1.isChecked()) {
            correctoimg.setVisibility(view.VISIBLE);
            correctotxt.setVisibility(view.VISIBLE);
            // Deshabilitar todas las opciones del RadioGroup
            for (int i = 0; i < radiog.getChildCount(); i++) {
                radiog.getChildAt(i).setEnabled(false);
            }
            button1.setText("SIGUIENTE");
            button1.setBackgroundColor(getResources().getColor(R.color.green));
            button1.setEnabled(false);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    p2(); // Llama al método para ir a la siguiente actividad después del retraso
                }
            }, 2000);

        }
        else if(rb2.isChecked()) {
            incorrectoimg.setVisibility(view.VISIBLE);
            incorrectotxt.setVisibility(view.VISIBLE);
            for (int i = 0; i < radiog.getChildCount(); i++) {
                radiog.getChildAt(i).setEnabled(false);
            }
            button1.setText("SIGUIENTE");
            button1.setBackgroundColor(getResources().getColor(R.color.red));
            button1.setEnabled(false);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    p2(); // Llama al método para ir a la siguiente actividad después del retraso
                }
            }, 2000);

        }
        else if(rb3.isChecked()) {
            incorrectoimg.setVisibility(view.VISIBLE);
            incorrectotxt.setVisibility(view.VISIBLE);
            for (int i = 0; i < radiog.getChildCount(); i++) {
                radiog.getChildAt(i).setEnabled(false);
            }
            button1.setText("SIGUIENTE");
            button1.setBackgroundColor(getResources().getColor(R.color.red));
            button1.setEnabled(false);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    p2(); // Llama al método para ir a la siguiente actividad después del retraso
                }
            }, 2000);

        }
        else if(rb4.isChecked()) {
            incorrectoimg.setVisibility(view.VISIBLE);
            incorrectotxt.setVisibility(view.VISIBLE);
            for (int i = 0; i < radiog.getChildCount(); i++) {
                radiog.getChildAt(i).setEnabled(false);
            }
            button1.setText("SIGUIENTE");
            button1.setBackgroundColor(getResources().getColor(R.color.red));
            button1.setEnabled(false);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    p2(); // Llama al método para ir a la siguiente actividad después del retraso
                }
            }, 2000);

        }
    }


    //Dialogo de confirmacion para Salir
    private void mostrarDialogoDeConfirmacion() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirmar salida");
        builder.setMessage("¿Estás seguro de que deseas salir de la prueba?");

        builder.setPositiveButton("Salir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Acción para salir de la aplicación
                Salir();
            }
        });

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Acción para cancelar la salida
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    //Metodo para salir a Inicio
    public void Salir() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        finish();
    }


    //Metodo para boton regresar a Inicio
    public void SalirBoton(View view){
        mostrarDialogoDeConfirmacion();
    }

    //Metodo para ir a la siguiente pregunta
    public void p2(){
        Intent p2 = new Intent(this, ColoresP2.class);
        startActivity(p2);
    }
}