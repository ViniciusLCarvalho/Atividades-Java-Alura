package PraticandoPOO;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Item> estoque = new ArrayList<>();

    void adicionar(Item i){
        estoque.add(i);
        System.out.println(i.nome()+" adicionado ao estoque!");
    }

    void remover(String nome){
        for (Item item : estoque) {
            if (item.nome().equalsIgnoreCase(nome)) {
                estoque.remove(estoque.indexOf(item));
            }
            System.out.println(item.nome()+" removido do estoque!");
        }
    }

    Item buscarProduto(String nome){
        for (Item item : estoque) {
            if (item.nome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }

    void exibirProdutos(){
        for (Item item : estoque) {
            System.out.println(item.toString());
        }
    }
}
