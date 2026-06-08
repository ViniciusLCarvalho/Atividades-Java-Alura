package PraticandoEncapsulamento;

public class PrincipalBoletim {
    public static void main(String[] args) {
        Disciplina mat = new Disciplina("Matemática");

        mat.adicionarNota(7.5);
        mat.adicionarNota(11.0);
        mat.adicionarNota(8.0);
        mat.adicionarNota(-3.0);
        mat.adicionarNota(9.5);

        System.out.println("Total de notas válidas: "+mat.contar());
        System.out.printf("Média em %s: %.2f\n", mat.getNomeDisciplina(), mat.calcularMedia());
    }
}
