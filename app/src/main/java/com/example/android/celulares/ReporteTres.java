package com.example.android.celulares;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by android on 26/09/2017.
 */

public class ReporteTres extends AppCompatActivity {
         /*Mostrar el precio promedio de los celulares marca Nokia
           registrados.*/

    private TableLayout tabla;
    private ArrayList<Celular> celulares;
    double promedio=0.0;
    int contador=0;
    private Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_celulares);
        resources = this.getResources();
        tabla = (TableLayout)findViewById(R.id.Tabla);
        celulares = Datos.Obtener();
        TableRow fila = new TableRow(this);
        TextView aux = new TextView(this);
        for (int i = 0; i <celulares.size() ; i++) {
            fila = new TableRow(this);

            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);
            TextView c6 = new TextView(this);


            c2.setText(celulares.get(i).getMarca());
            c3.setText(celulares.get(i).getColor());
            c4.setText(celulares.get(i).getPrecio());
            c5.setText(celulares.get(i).getRam());
            c6.setText(celulares.get(i).getSO());

            String marca,color,precio,ram,SO;
            precio = celulares.get(i).getPrecio();
            ram = celulares.get(i).getRam();
            marca = celulares.get(i).getMarca();
            color = celulares.get(i).getColor();
            SO = celulares.get(i).getSO();

            //validacion de condiciones
            if(marca.trim().equalsIgnoreCase("nokia")) {

                contador++;
                c1.setText(""+contador);
                double precioActual = Double.parseDouble(precio);
                promedio = promedio+precioActual;
                promedio = promedio/contador;

             }

        }
        aux.setText("\n(Average|Promedio): $"+promedio);
        fila.addView(aux);
        tabla.addView(fila);
        //Toast.makeText(this, "el promedio es de"+promedio, Toast.LENGTH_SHORT).show();
    }
}
