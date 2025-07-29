package ProdutoCalculavel;

public class Livro implements Calculavel {
    private String autor;
    private String titulo;
    private double preco;
    
    public Livro(String autor, String titulo, double preco) {
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal(){
        return preco - (preco * 0.25);
    }
}
