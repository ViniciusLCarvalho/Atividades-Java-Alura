package PraticandoHerancaPolimorfismoInterfaces;

public class Push extends Notificacao{
    private String titulo;

    public Push(String dest, String msg, String titulo) {
        super(dest, msg);
        this.titulo = titulo;
    }

    @Override
    void enviar() {
        System.out.printf("\nEnviando Push para: %s\nTitulo: %s\nConteúdo: %s\n", destinatario, titulo, mensagem);
    }
}
