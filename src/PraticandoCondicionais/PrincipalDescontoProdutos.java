package PraticandoCondicionais;

import java.util.Scanner;

public class PrincipalDescontoProdutos {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        DescontoProdutos dp = new DescontoProdutos(x.nextDouble(), 10);
        dp.calculaDesconto();
        x.close();
    }
}
