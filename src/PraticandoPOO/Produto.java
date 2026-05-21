package PraticandoPOO;

public record Produto(String nome, double preco, int quantidade) {
    void exibirInfo(){
        System.out.println("Produto: "+this.nome);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
        System.out.println("Quantidade em estoque: "+this.quantidade);
    }
}
