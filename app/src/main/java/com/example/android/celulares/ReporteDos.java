package com.example.android.celulares;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by android on 26/09/2017.
 */

public class ReporteDos extends AppCompatActivity {
         /*Mostrar el número de celulares marca Apple color Negro
            registrados.*/

    private TableLayout tabla;
    private ArrayList<Celular> celulares;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_celulares);
        tabla = (TableLayout)findViewById(R.id.Tabla);
        celulares = Datos.Obtener();

        for (int i = 0; i <celulares.size() ; i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);
            TextView c6 = new TextView(this);


            c1.setText(""+(i+1));
            c2.setText(celulares.get(i).getMarca());
            c3.setText(celulares.get(i).getPrecio());
            c4.setText(celulares.get(i).getRam());
            c5.setText(celulares.get(i).getColor());
            c6.setText(celulares.get(i).getSO());

            String marca,color,precio,ram,SO;
            precio = celulares.get(i).getPrecio();
            ram = celulares.get(i).getRam();
            marca = celulares.get(i).getMarca();
            color = celulares.get(i).getColor();
            SO = celulares.get(i).getSO();

            //validacion de condiciones
            if(marca.trim().equalsIgnoreCase("apple")
                    && (color.trim().equalsIgnoreCase("negro")||color.trim().equalsIgnoreCase("black"))) {

                fila.addView(c1);
                fila.addView(c2);
                fila.addView(c3);
                fila.addView(c4);
                fila.addView(c5);
                fila.addView(c6);
            }
            tabla.addView(fila);


        }
    }
}
