package ar.org.centro8.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.org.centro8.entities.Auto;
import ar.org.centro8.entities.Moto;
import ar.org.centro8.entities.Vehiculo;

public class Test {
    public static void main(String[] args) {

        List<Vehiculo> lista1 = new ArrayList();
        lista1.add(new Auto("Peugeot", "206", 200000.00, "4"));
        lista1.add(new Moto("Honda", "Titan", 60000, "125c"));
        lista1.add(new Auto("Peugeot", "208", 250000, "5"));
        lista1.add(new Moto("Yamaha", "YBR", 80500.50, "160c"));

        lista1.forEach(System.out::println);

        // Vehiculo más caro

        System.out.println("=============================\n");

        masCaro(lista1);

        // Vehiculo mas barato

        masBarato(lista1);

        System.out.println("=============================\n");

        // Vehiculo que contiene la letra 'Y'
        contieneLetraY(lista1);

        System.out.println("=============================\n");

        // Vehiculos ordenados por precio de mayor a menor

        ordenadoMayoraMenor(lista1);

        System.out.println("=============================\n");

        // Vehiculos ordenados por orden natural
        ordenNatural(lista1);

    }

    private static void masCaro(List<Vehiculo> lista1) {
        double precioMax = lista1
                .stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get()
                .getPrecio();
        lista1
                .stream()
                .filter(v -> v.getPrecio() == precioMax)
                .forEach(v -> System.out.println("Vehiculo mas caro: " + v.getMarca() + " " + v.getModelo()));
    }

    private static void masBarato(List<Vehiculo> lista1) {
        double precioMin = lista1
                .stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get()
                .getPrecio();

        lista1
                .stream()
                .filter(v -> v.getPrecio() == precioMin)
                .forEach(v -> System.out.println("Vehiculo mas barato: " + v.getMarca() + " " + v.getModelo()));
    }

    private static void contieneLetraY(List<Vehiculo> lista1) {
        lista1
                .stream()
                .filter(v -> v.getModelo().toLowerCase().contains("Y".toLowerCase()))
                .forEach(v -> System.out.println("Vehiculo que contiene la letra 'Y': " + v.getModelo() + " "
                        + v.getMarca() + " $" + v.getPrecio()));
    }

    private static void ordenadoMayoraMenor(List<Vehiculo> lista1) {
        System.out.println("Vehiculo ordenados por precio de mayor a menor: ");
        lista1
                .stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
                .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));
    }

    private static void ordenNatural(List<Vehiculo> lista1) {
        System.out.println("Vehiculos ordenados por orden natural(marca, precio, modelo): ");

        lista1
                .stream()
                .sorted()
                .forEach(System.out::println);
    }

}
