package PraticandoHerancaPolimorfismoInterfaces;

public class PrincipalPagamento {
    public static void main(String[] args) {
        Pagamento cartao = new Cartao(250.00);
        Pagamento boleto = new Boleto(500.00);
        Pagamento pix = new Pix(300.00);
        
        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();
 
    }
}