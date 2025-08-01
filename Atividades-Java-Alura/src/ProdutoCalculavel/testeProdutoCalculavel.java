package ProdutoCalculavel;

import java.util.ArrayList;

public class testeProdutoCalculavel {
    public static void main(String[] args) {
        Livro livro = new Livro("Código da Vinci", "Dan Brown", 50.0, 0.05);
        ProdutoFisico produtoF = new ProdutoFisico("Relogio Amazfit", 370.00, 50.0);
        ProdutoFisico produto1 = new ProdutoFisico("Monitor LG", 250.00, 25.0);
        ProdutoFisico produto2 = new ProdutoFisico("Notebook Lenovo", 1200.00, 30.0);
        ProdutoFisico produto3 = new ProdutoFisico("Teclado Logitech", 70.0, 20.0);
        ProdutoFisico produto4 = new ProdutoFisico("Mouse Logitech", 50.00, 10.0);

        //System.out.println(produtoF.calcularPrecoFinal());
        //System.out.println(livro.calcularPrecoFinal());

        ArrayList<ProdutoFisico> listaProdutos = new ArrayList<>();

        listaProdutos.add(produtoF);
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);

        double somaPrecos = 0;

        for (ProdutoFisico produto : listaProdutos) {
            somaPrecos += produto.getPrecoBase();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: "+precoMedio);
    }
}
