package PraticandoPOO;

import java.util.Scanner;

public class PrincipalCompra {
    public static void main(String[] args) {
        char opcao = 'e';
        Scanner in = new Scanner(System.in);
        Estoque e = new Estoque();
        Carrinho c = new Carrinho();

        while (opcao != 's') {
            System.out.println("\nEscolha a opção abaixo: ");
            System.out.println("A) Adicionar itens ao estoque.");
            System.out.println("B) Adicionar itens ao carrinho.");
            System.out.println("C) Finalizar Compra.");
            opcao = Character.toLowerCase(in.next().charAt(0));
            in.nextLine();

            if (opcao == 's') {
                //in.close();
                break;
            }

            if (opcao == 'a') {
                System.out.println("Insira o nome: ");
                String nome = in.nextLine();
                System.out.println("Insira o preço: ");
                double preco = in.nextDouble();
                System.out.println("Insira o quantidade: ");
                int quantidade = in.nextInt();
                in.nextLine();
                Item i = new Item(nome, preco, quantidade);
                e.adicionar(i);
                //System.out.println("Item adicionado ao estoque!");
            }

            if (opcao == 'b') {
                e.exibirProdutos();
                System.out.println("Informe o produto que deseja comprar");
                c.adicionar(e.buscarProduto(in.nextLine()));
                //System.out.println("Produto adicionado ao carrinho!\n");
            }

            if (opcao == 'c') {
                c.finalizarCompra();
            }
        }
        in.close();
    }
}
