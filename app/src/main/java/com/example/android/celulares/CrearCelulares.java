package com.example.android.celulares;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by android on 26/09/2017.
 * marca
 color
 precio
 capacidad de ram
 sistema operativo
 */

public class CrearCelulares  extends AppCompatActivity {
    private EditText marca,color,precio,ram,SO;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celulares);
        marca = (EditText)findViewById(R.id.txtMarca);
        color = (EditText)findViewById(R.id.txtColor);
        precio = (EditText)findViewById(R.id.txtPrecio);
        ram = (EditText)findViewById(R.id.txtRam);
        SO = (EditText)findViewById(R.id.txtSO);
        resources = this.getResources();
    }

    public void guardar(View view){
        String marc,col,pre,ra,So;
        marc = marca.getText().toString();
        col = color.getText().toString();
        pre = precio.getText().toString();
        ra = ram.getText().toString();
        So  = SO.getText().toString();

        Celular c = new Celular(marc,col,pre,ra,So);
        c.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_Exitoso),Toast.LENGTH_SHORT).show();
    }


}
