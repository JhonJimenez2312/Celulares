package com.example.android.celulares;

/**
 * Created by android on 26/09/2017.}
 *
 */

public class Celular {
    private String marca;
    private String color;
    private String precio;
    private String ram;
    private String SO;

    public Celular(String marca, String color, String precio, String ram, String SO) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.ram = ram;
        this.SO = SO;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
