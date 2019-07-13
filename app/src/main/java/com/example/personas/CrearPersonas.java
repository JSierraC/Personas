package com.example.personas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CrearPersonas extends AppCompatActivity {
    private EditText cedula, nombre, apellido;
    private Button btAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        
        cedula  = findViewById(R.id.txtCedula);
        nombre  = findViewById(R.id.txtNombre);
        apellido  = findViewById(R.id.txtApellido);
        btAdd = findViewById(R.id.btnAgregar);
        final Datos dato = new Datos();
/*
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Persona per = new Persona(cedula.getText().toString(), nombre.getText().toString(), apellido.getText().toString());
                Datos.guardar(per);
            }
        });
 */
    }

    public void guardar(View v){
        String nom, apell, ced;

        ced   = cedula.getText().toString();
        nom   = nombre.getText().toString();
        apell = apellido.getText().toString();

        Persona p = new Persona(ced, nom, apell);
        p.guardar();
        limpiar(v);

    }

    public void limpiar(View v){
        cedula.setText("");
        nombre.setText("");
        apellido.setText("");
        cedula.requestFocus();
    }
}
