package PraticandoPOO;

public class PrincipalSaldo {
    public static void main(String[] args) {
        Saldo s = new Saldo(1579.42);

        s.exibirSaldo();
        s.zerarSaldo();
        s.exibirSaldo();
    }
}
