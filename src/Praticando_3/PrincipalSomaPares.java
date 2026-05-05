package Praticando_3;

public class PrincipalSomaPares {
    public static void main(String[] args) {
        int somatorio = 0;
        for(int i = 0; i <= 100; i++){
            if (i%2 == 0) {
                somatorio+=i;
            }
        }
        System.out.println("A soma dos numeros pares de 1 a 100 é: "+somatorio);
    }
}
