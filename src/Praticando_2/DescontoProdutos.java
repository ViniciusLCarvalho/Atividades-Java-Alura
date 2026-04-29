package Praticando_2;

public record DescontoProdutos(double valor, int desconto) {
    public void calculaDesconto(){
        double resultado;
        
        if (this.valor >= 100) {
            resultado = this.valor - (this.valor * this.desconto / 100);
            System.out.println("Desconto de "+this.desconto+"% aplicado");
            System.out.println("Novo valor: R$"+resultado);
        } else{
            System.out.println("Nenhum desconto aplicado");
            System.out.println("Valor total: R$"+this.valor);
        }
    }
}