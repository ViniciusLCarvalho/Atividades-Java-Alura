package ProdutoCalculavel;

public class testeProdutoCalculavel {
    public static void main(String[] args) {
        Livro livro = new Livro("Dan Brown", "O Simbolo perdido", 55.85);
        ProdutoFisico relogio = new ProdutoFisico(370.90, "Smartwatch", "Amazfit");

        System.out.println(livro.calcularPrecoFinal());
        System.out.println(relogio.calcularPrecoFinal());
    }
}
