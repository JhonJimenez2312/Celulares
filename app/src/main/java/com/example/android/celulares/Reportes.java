package com.example.android.celulares;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by android on 26/09/2017.
 */

public class Reportes extends AppCompatActivity {
    private Resources resources;
    private Spinner reportes;
    private String op[];
    private Intent in;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
         reportes =(Spinner)findViewById(R.id.cmbReportes);
        resources = this.getResources();
        op = resources.getStringArray(R.array.reportes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op);
        reportes.setAdapter(adapter);

        final int reporteSeleccionado;
        reporteSeleccionado = reportes.getSelectedItemPosition();
}

    public void mostrarReportes(View v){
    final int reporteSeleccionado;
        reporteSeleccionado = reportes.getSelectedItemPosition();

        switch (reporteSeleccionado){
            case 0:
                in= new Intent(Reportes.this,ReporteUno.class);
                startActivity(in);
                break;
            case 1:
                in= new Intent(Reportes.this,ReporteDos.class);
                startActivity(in);
                break;
            case 2:
                in= new Intent(Reportes.this,ReporteTres.class);
                startActivity(in);
                break;
        }

    }

}
