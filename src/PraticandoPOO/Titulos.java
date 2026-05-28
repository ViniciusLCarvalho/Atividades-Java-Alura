package PraticandoPOO;

public class Titulos {
    String titulo;
    int diasDeAtraso;

    public Titulos(String titulo, int diasDeAtraso){
        this.titulo = titulo;
        this.diasDeAtraso = diasDeAtraso;
    }

    double calculaMulta(){
        return diasDeAtraso * 2.50;
    }

    void exibirDetalhes(){
        double multa = calculaMulta();
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n", titulo, diasDeAtraso, multa);
    }
}
