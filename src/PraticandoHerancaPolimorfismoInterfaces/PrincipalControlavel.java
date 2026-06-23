package PraticandoHerancaPolimorfismoInterfaces;

public class PrincipalControlavel {
    public static void main(String[] args) {
        Luz l = new Luz();
        ArCondicionado ar = new ArCondicionado();

        l.ligar();
        l.ligar();
        l.desligar();

        ar.desligar();
    }
}
