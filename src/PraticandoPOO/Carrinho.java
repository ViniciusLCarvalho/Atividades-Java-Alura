package PraticandoPOO;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    List<Item> carrinho = new ArrayList<>();
    double total = 0;

    void adicionar(Item i){
        carrinho.add(i);
        System.out.println(i.getNome()+" adicionado ao carrinho!");
    }

    void remover(String nome){
        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                carrinho.remove(carrinho.indexOf(item));
                System.out.println(item.getNome()+" Removido do carrinho!");
            } else {
                System.out.println("O item não está no seu carrinho.");
            } 
        }
    }

    void finalizarCompra(){
        total = 0;
        for (Item item : carrinho) {
            total += (item.getPreco() * item.getQuantidade());
        }

        System.out.printf("Total da compra: R$ %.2f\n", total);
    }
}
