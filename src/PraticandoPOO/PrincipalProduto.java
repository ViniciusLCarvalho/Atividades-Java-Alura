package PraticandoPOO;

public class PrincipalProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse Gamer", 159.9, 2);
        Produto p2 = new Produto("Teclado", 120.0, 1);
        Produto p3 = new Produto("Monitor", 950.0, 1);

        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();
    }
}
