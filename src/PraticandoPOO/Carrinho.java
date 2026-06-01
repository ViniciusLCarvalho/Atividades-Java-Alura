package PraticandoPOO;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    List<Item> carrinho = new ArrayList<>();
    double total;

    void adicionar(Item i){
        carrinho.add(i);
        System.out.println(i.nome()+" adicionado ao carrinho!");
    }

    void finalizarCompra(){
        for (Item item : carrinho) {
            total += (item.preco() * item.quantidade());
        }

        System.out.printf("Total da compra: R$ %.2f\n", total);
    }
}
