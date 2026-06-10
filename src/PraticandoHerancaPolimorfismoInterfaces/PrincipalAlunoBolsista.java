package PraticandoHerancaPolimorfismoInterfaces;

public class PrincipalAlunoBolsista {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Fernanda", "regular");
        Bolsista a2 = new Bolsista("Lucas");

        a1.identificar();
        a2.identificar();
    }
}
