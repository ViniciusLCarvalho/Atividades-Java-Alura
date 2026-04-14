package Praticando_1;

public record Moeda(double valorReais, double taxaCambio) {
    public double converteCambio(){
        return this.valorReais/this.taxaCambio;
    }
}
