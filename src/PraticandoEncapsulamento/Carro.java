package PraticandoEncapsulamento;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;

    public Carro(String m, String p, int a){
        this.modelo = m;
        this.placa = p;
        this.ano = a;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }
}
