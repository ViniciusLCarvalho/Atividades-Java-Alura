package CalculaForma;

public class Circulo implements Forma {
    double raio;

    @Override
    public double calcularArea(){
        // return Math.PI * (Math.pow(raio, 2));
        return Math.PI * raio * raio;
    }
}
