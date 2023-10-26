package ar.org.centro8.entities;

public class Auto extends Vehiculo {
    private String puertas;

    public Auto(String marca, String modelo, double precio, String puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() + " // Puertas: " + puertas
                + " // Precio: " + "$" + PrecioDecimalFormat(getPrecio());
    }

}
