package Praticando_2;

public record Emprestimo(int valor) {
    public void verificaIntervaloValor() {
        if (this.valor >= 1000 && this.valor <= 5000) {
            System.out.println("O valor " + this.valor + "não está dentro do intervalo permitido para empréstimo");
        } else {
            System.out.println("O valor " + valor + " não está dentro do intervalo permitido para empréstimo.");
        }
    }
}
