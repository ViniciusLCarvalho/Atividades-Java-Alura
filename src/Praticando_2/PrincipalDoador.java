package Praticando_2;

import java.util.Scanner;

public class PrincipalDoador {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a idade e o peso da doador (em kg): ");
        Doador d = new Doador(s.nextInt(), s.nextInt());
        d.verificaDoador();
        s.close();
    }
}
