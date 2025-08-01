package CalculaForma;

import java.util.ArrayList;

public class TesteForma {
    public static void main(String[] args) {
        Circulo circle = new Circulo();
        circle.raio = 5;

        Quadrado square = new Quadrado();
        square.lado = 4;

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circle);
        listaFormas.add(square);

        for (Forma forma : listaFormas) {
            System.out.println("Area: " + forma.calcularArea());
        }
    }
}
