package PraticandoHerancaPolimorfismoInterfaces;

public class ArCondicionado implements Controlavel {
    private boolean ligado = false;

    public void ligar(){
        if (!ligado) {
            ligado = true;
            System.out.println("Ar-Condicionado ligada.");
        } else {
            System.out.println("Ar-Condicionado já está ligada.");
        }
    }

    public void desligar(){
        if (ligado) {
            ligado = false;
            System.out.println("Ar-Condicionado desligada.");
        } else {
            System.out.println("Ar-Condicionado já está desligada.");
        }
    }
}
