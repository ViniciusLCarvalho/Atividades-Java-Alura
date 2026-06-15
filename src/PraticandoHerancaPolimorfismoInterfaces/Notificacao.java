package PraticandoHerancaPolimorfismoInterfaces;

public class Notificacao {
    protected String destinatario;
    protected String mensagem;

    public Notificacao(String dest, String msg){
        this.destinatario = dest;
        this.mensagem = msg;
    }

    public Notificacao(){
        
    }

    void enviar(){};

    void enviarMensagem(String mensagem){
        System.out.printf("Mensagem enviada para todos: %s\n", mensagem);
    }

    void enviarMensagem(String nome, String mensagem){
        System.out.printf("Mensagem para %s: %s\n", nome, mensagem);
    }

    void enviarMensagem(String nome, String mensagem, int vezes){
        for (int i = 0; i < vezes; i++) {
            System.out.printf("Mensagem para %s: %s\n", nome, mensagem);
        }
    }
}
