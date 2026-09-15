package EstudoApiStream;

import java.math.BigDecimal;

public class Produto {

    private final String nome;
    private final BigDecimal preco;
    private final boolean disponivel;

    public Produto(String nome, BigDecimal preco, boolean disponivel) {
        this.nome = nome;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}
