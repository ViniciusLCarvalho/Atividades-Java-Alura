package Praticando_2;

import java.util.Scanner;

public class PrincipalAcesso {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira o código de acesso e o nivel de acesso: \nEx.: 9999-9");
        Acesso a = new Acesso(s.nextLine());
        a.verificaAcesso();
        s.close();
    }
}
