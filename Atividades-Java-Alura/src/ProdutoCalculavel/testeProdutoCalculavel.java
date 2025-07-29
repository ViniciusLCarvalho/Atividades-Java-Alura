package ProdutoCalculavel;

public class testeProdutoCalculavel {
    public static void main(String[] args) {
        Livro livro = new Livro("Código da Vinci", "Dan Brown", 50.0, 0.05);
        ProdutoFisico produtoF = new ProdutoFisico("Relogio Amazfit", 370.00, 50.0);

        System.out.println(produtoF.calcularPrecoFinal());
        System.out.println(livro.calcularPrecoFinal());
    }
}
