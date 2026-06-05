package PraticandoEncapsulamento;

public class PrincipalEstoque {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        e.setNome("mouse");
        e.setPreco(-59.90);

        System.out.printf("Produto: %s\nPreço: %.2f\n", e.getNome(), e.getPreco());
    }
}
