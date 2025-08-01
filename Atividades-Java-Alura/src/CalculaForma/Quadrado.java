package CalculaForma;

public class Quadrado implements Forma {
    double lado;

    @Override
    public double calcularArea() {
        // return Math.pow(lado, 2);
        return lado * lado;
    }
}
