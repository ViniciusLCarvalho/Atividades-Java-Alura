package EstudoApiStream;

import java.math.BigDecimal;
import java.util.List;

public class Practicing {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Teclado", new BigDecimal("150.00"), true),
                new Produto("Mouse", new BigDecimal("80.00"), false),
                new Produto("Monitor", new BigDecimal("900.00"), true),
                new Produto("Cabo HDMI", new BigDecimal("45.00"), true),
                new Produto("Headset", new BigDecimal("250.00"), false));

        /*
         * Desafio adicional
         *
         * List<Produto> produtosFiltrados = produtos.stream()
         * .filter(produto -> produto.isDisponivel()
         * && produto.getPreco().compareTo(new BigDecimal("500.00")) < 0)
         * .toList();
         */

        List<Produto> produtosFiltrados = produtos.stream()
                .filter(produto -> produto.isDisponivel())
                .filter(produto -> produto.getPreco().compareTo(new BigDecimal("500.00")) < 0)
                .toList();

        produtosFiltrados.forEach(System.out::println);
    }
}
