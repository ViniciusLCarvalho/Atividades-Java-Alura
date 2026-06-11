package PraticandoHerancaPolimorfismoInterfaces;

public class PrincipalNotificacoes {
    public static void main(String[] args) {
        Email e = new Email("cliente@exemplo.com", "Aproveite nossos descontos esta semana.", "Promoção Especial!");
        Sms s = new Sms("(11) 98765-4321", "Sua fatura foi paga com sucesso.");
        Push p = new Push("usuario_app", "Você tem uma nova mensagem não lida.", "Novidade!");

        e.enviar();
        s.enviar();
        p.enviar();
    }
}
