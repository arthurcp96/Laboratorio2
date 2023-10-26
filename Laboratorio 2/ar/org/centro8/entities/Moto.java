package ar.org.centro8.entities;

public class Moto extends Vehiculo {
    private String cilindrada;

    public Moto(String marca, String modelo, double precio, String cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() + " // Cilindrada: " + cilindrada
                + " // Precio: " + "$" + PrecioDecimalFormat(getPrecio());
    }

}
