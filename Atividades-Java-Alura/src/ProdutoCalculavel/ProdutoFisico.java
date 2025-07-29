package ProdutoCalculavel;

public class ProdutoFisico implements Calculavel {
    private double preco;
    private String nome;
    private String marca;

    public ProdutoFisico(double preco, String nome, String marca){
        this.preco = preco;
        this.nome = nome;
        this.marca = marca;
    }

    @Override
    public double calcularPrecoFinal(){
        return preco * 1.5;
    }
}
