package Praticando_2;

import java.util.ArrayList;
import java.util.List;

public record Num(int val1, int val2) {
    public void verificaNumMaior() {

        if (this.val1 > this.val2) {
            System.out.println("O maior numero é " + this.val1);
        } else if (this.val2 > this.val1) {
            System.out.println("O maior numero é " + this.val2);
        } else {
            System.out.println("Os numeros " + this.val1 + " e " + this.val2 + " são iguais!");
        }

    }
}
