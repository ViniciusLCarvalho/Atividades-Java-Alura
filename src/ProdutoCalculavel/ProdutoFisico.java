package ProdutoCalculavel;

public class ProdutoFisico implements Calculavel {
    private String nome;
    private double precoBase;
    private double taxaFrete;
    
    public ProdutoFisico(String nome, double precoBase, double taxaFrete){
        this.nome = nome;
        this.precoBase = precoBase;
        this.taxaFrete = taxaFrete;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double calcularPrecoFinal(){
        return (precoBase * 1.05) + taxaFrete;
    }
}