package PraticandoCondicionais;

import java.util.Scanner;

public class PrincipalTriangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os lados do triangulo: ");
        Triangulo t = new Triangulo(s.nextInt(), s.nextInt(), s.nextInt());
        t.calculaTriangulo();
        s.close();
    }
}
