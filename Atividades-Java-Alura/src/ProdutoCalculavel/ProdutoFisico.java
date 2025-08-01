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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(double taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    @Override
    public double calcularPrecoFinal(){
        return (precoBase * 1.05) + taxaFrete;
    }
}