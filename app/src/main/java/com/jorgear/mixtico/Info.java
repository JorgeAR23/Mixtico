package com.jorgear.mixtico;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;

//comment
public class Info extends AppCompatActivity {

    public BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        // Obtione la referencia al BottomNavigationView
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.info);

        // Agrega el listener para manejar los eventos de clic en los elementos del menú
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            // Obtener el ID del elemento seleccionado
            int itemId = item.getItemId();

            // Realiza acciones según el elemento seleccionado
            switch (itemId) {
                case R.id.placeholder:
                    //Metodo para ir a Info
                    Intent info = new Intent(this, MainActivity.class);
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

        builder.setPositiveButton("Salir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Acción para salir de la aplicación
                finishAffinity();
            }
        });

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Acción para cancelar la salida
                dialog.dismiss();
                bottomNavigationView.setSelectedItemId(R.id.info);
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    //Metodo para ir a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

}