package Praticando_1;

public record ConsumoVeiculo(double consumoMedio, double capacidadeTanque, double combustivelDisp, double distanciaViagem) {
    public double calculaAutonomiaMax(){
        return this.consumoMedio * this.capacidadeTanque;
    }

    public double calculaAutonomiaAtual(){
        return this.consumoMedio * this.combustivelDisp;
    }
}
