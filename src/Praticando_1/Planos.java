package Praticando_1;

public record Planos(double preco) {
    public DescricaoPlanos categorizaPlanos(){
        if (this.preco <= 50.00) {
            return DescricaoPlanos.Econômico;
        } else if (this.preco > 50.00 && preco <= 200.00) {
            return DescricaoPlanos.Intermediário;
        } else {
            return DescricaoPlanos.Premium;
        }
    }
}
