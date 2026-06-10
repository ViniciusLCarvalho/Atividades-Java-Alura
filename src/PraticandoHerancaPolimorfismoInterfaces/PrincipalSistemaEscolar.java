package PraticandoHerancaPolimorfismoInterfaces;

public class PrincipalSistemaEscolar {
    public static void main(String[] args) {
        AlunoB a1 = new AlunoB("Julia", 16, 8.5);
        AlunoB a2 = new AlunoB("Caio", 17, 7.2);

        Docente d1 = new Docente("Marta", 40, "Matematica");
        Docente d2 = new Docente("Roberto", 38, "História");

        a1.exibir();
        a2.exibir();

        d1.exibir();
        d2.exibir();
    }
}
