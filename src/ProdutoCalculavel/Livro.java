package ProdutoCalculavel;

public class Livro implements Calculavel {
    private String autor;
    private String titulo;
    private double precoBase;
    private double desconto;

    public Livro(String titulo, String autor, double precoBase, double desconto){
        this.titulo = titulo;
        this.autor = autor;
        this.precoBase = precoBase;
        this.desconto = desconto;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public double calcularPrecoFinal(){
        return (precoBase * 0.9) - (precoBase * desconto);
    }
}

