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
        if(validar()) {

            Celular c = new Celular(marc, col, pre, ra, So);
            c.guardar();
            Toast.makeText(this, resources.getString(R.string.mensaje_Exitoso), Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiar(View view){
        marca.setText("");
        color.setText("");
        precio.setText("");
        ram.setText("");
        SO.setText("");
        marca.requestFocus();

    }

    public boolean validar(){
        marca = (EditText)findViewById(R.id.txtMarca);
        String x =marca.getText().toString();

        if(x.isEmpty()||marca.getText().toString().trim().isEmpty()){
            marca.setError(resources.getString(R.string.mensaje_error_uno));
            marca.setText("");
            marca.requestFocus();
            return false;
        }
        color = (EditText)findViewById(R.id.txtColor);
        x = color .getText().toString();

        if(x.isEmpty()||color .getText().toString().trim().isEmpty()){
            color .setError(resources.getString(R.string.mensaje_error_uno));
            color .setText("");
            color .requestFocus();
            return false;
        }

        precio = (EditText)findViewById(R.id.txtPrecio);
        x = precio .getText().toString();

        if(x.isEmpty()||precio.getText().toString().trim().isEmpty()){
            precio.setError(resources.getString(R.string.mensaje_error_uno));
            precio.setText("");
            precio.requestFocus();
            return false;
        }

        ram = (EditText)findViewById(R.id.txtRam);
        x = ram.getText().toString();

        if(x.isEmpty()||ram.getText().toString().trim().isEmpty()){
            ram.setError(resources.getString(R.string.mensaje_error_uno));
            ram.setText("");
            ram.requestFocus();
            return false;
        }
        SO = (EditText)findViewById(R.id.txtSO);
        x =   SO.getText().toString();

        if(x.isEmpty()||  SO.getText().toString().trim().isEmpty()){
            SO.setError(resources.getString(R.string.mensaje_error_uno));
            SO.setText("");
            SO.requestFocus();
            return false;
        }


        return true;
    }



}
