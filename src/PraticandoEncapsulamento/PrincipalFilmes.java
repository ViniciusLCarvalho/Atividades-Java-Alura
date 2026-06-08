package PraticandoEncapsulamento;

public class PrincipalFilmes {
    public static void main(String[] args) {
        Filme f = new Filme("Matrix");
        f.adicionarAvaliacao(5);
        f.adicionarAvaliacao(4);
        f.adicionarAvaliacao(5);
        f.adicionarAvaliacao(3);
        f.adicionarAvaliacao(4);

        System.out.printf("Média de avaliações para %s: %.2f\n", f.getTitulo(), f.calcularMedia());
    }
}
