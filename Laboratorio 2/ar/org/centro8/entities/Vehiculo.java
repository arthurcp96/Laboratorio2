package ar.org.centro8.entities;

import java.text.DecimalFormat;

public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private double precio;

    // Constructor
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;

    }

    @Override
    public String toString() {
        return " /marca: " + marca + "/ modelo: " + modelo + "/ precio: " + precio;
    }

    @Override
    public int compareTo(Vehiculo para) {

        String thisVehiculo = this.getMarca() + ", " + this.getModelo() + ", " + this.getPrecio();
        String paraVehiculo = para.getMarca() + ", " + para.getModelo() + ", " + para.getPrecio();
        return thisVehiculo.compareTo(paraVehiculo);

    }

    DecimalFormat df = new DecimalFormat("###,###,###.00");

    public String PrecioDecimalFormat(double precio) {
        return df.format(precio);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

}