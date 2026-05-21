package PraticandoCondicionais;

import java.util.Scanner;

public class PrincipalAluno {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Insira a nota do aluno: ");
        String entrada = x.nextLine().trim().replace(',', '.');
        Aluno a = new Aluno(Double.parseDouble(entrada));
        x.close();
        System.out.println("O estudante teve media " + a.media() +
                " e foi " + a.verificaAluno());
    }
}
