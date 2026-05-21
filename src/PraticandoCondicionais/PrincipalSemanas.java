package PraticandoCondicionais;

import java.util.Scanner;

public class PrincipalSemanas {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Insira o dia da semana em letras minusculas: ");
        Semana s = new Semana(x.nextLine());
        s.verificaDiaUtil();
        x.close();
    }
}
