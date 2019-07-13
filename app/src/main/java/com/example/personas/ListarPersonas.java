package com.example.personas;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListarPersonas extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Persona> personas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas);

        tabla = findViewById(R.id.tabla);
        personas = Datos.obtener();

        for (int i=0;i<personas.size();i++) {

            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText("" + (i + 1));
            c1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            c1.setTextColor(Color.YELLOW);

            c2.setText(personas.get(i).getCedula());
            c2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            c2.setTextColor(Color.RED);

            c3.setText(personas.get(i).getNombre());
            c3.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            c3.setTextColor(Color.GREEN);

            c4.setText(personas.get(i).getApellido());
            c4.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            c4.setTextColor(Color.BLUE);

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla.addView(fila);
        }

    }
}
