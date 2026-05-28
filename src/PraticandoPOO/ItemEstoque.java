package PraticandoPOO;

public class ItemEstoque {
    String nome;
    int quantidade;

    public ItemEstoque(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    void vender(int qtdVendida){
        if (qtdVendida <= quantidade) {
            quantidade -= qtdVendida;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, quantidade);
        } else {
            System.out.println("Estoque insuficiente");
        }
    }
}
