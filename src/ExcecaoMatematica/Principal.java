package ExcecaoMatematica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int valor1, valor2, resultado;

        try {
            System.out.println("Informe o numerador: ");
            valor1 = x.nextInt();
            System.out.println("Informe o denominador: ");
            valor2 = x.nextInt();

            resultado = valor1 / valor2;
            System.out.println("Resultado: "+resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro no calculo | "+e);
        } catch (InputMismatchException e){
            System.out.println("Valor inserido não é numerico | "+e);
        } catch (Exception e){
            System.out.println("Erro inesperado | "+e);
        } finally {
            x.close();
        }
    }
}
