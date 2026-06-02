package PraticandoPOO;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Item> estoque = new ArrayList<>();

    void adicionar(Item i){
        estoque.add(i);
        System.out.println(i.getNome()+" adicionado ao estoque!");
    }

    void remover(String nome){
        for (Item item : estoque) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                estoque.remove(estoque.indexOf(item));
                System.out.println(item.getNome()+" removido do estoque!");
            } else {
                System.out.println("Produto não encontrado!");
            }
        }
    }

    Item buscarProduto(String nome){
        for (Item item : estoque) {
            if (item.getNome().equalsIgnoreCase(nome)) {
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

    void atualizaQuantidade(String nome, int q){
        for (Item item : estoque) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                int novaQuant = item.getQuantidade() - q;
                item.setQuantidade(novaQuant);
            }
        }
    }
}
