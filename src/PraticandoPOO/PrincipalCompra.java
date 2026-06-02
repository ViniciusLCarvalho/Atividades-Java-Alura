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
            System.out.println("C) Remover itens do carrinho.");
            System.out.println("D) Finalizar Compra.");
            opcao = Character.toLowerCase(in.next().charAt(0));
            in.nextLine();

            if (opcao == 's') {
                break;
            }

            if (opcao == 'a') {
                Item i = new Item();
                System.out.println("Insira o nome: ");
                i.setNome(in.nextLine());
                System.out.println("Insira o preço: ");
                i.setPreco(in.nextDouble());
                System.out.println("Insira o quantidade: ");
                i.setQuantidade(in.nextInt());
                in.nextLine();
                e.adicionar(i);
            }

            if (opcao == 'b') {
                e.exibirProdutos();

                System.out.println("Informe o produto que deseja comprar");
                Item produtoEstoque = e.buscarProduto(in.nextLine());
                
                System.out.println("Informe a quantidade: ");
                int quantCarrinho = in.nextInt();
                                
                if (quantCarrinho <= produtoEstoque.getQuantidade()) {
                    Item itemcarrinho = new Item();
                    itemcarrinho.setNome(produtoEstoque.getNome());
                    itemcarrinho.setPreco(produtoEstoque.getPreco());
                    itemcarrinho.setQuantidade(quantCarrinho);
                    e.atualizaQuantidade(produtoEstoque.getNome(), quantCarrinho);
                    c.adicionar(itemcarrinho);
                } else {
                    System.out.println("Quantidade superior ao disponivel!");
                    System.out.println("Quantidade disponivel: " + produtoEstoque.getQuantidade());
                }
            }

            // Implementar remoção de itens do carrinho
            if(opcao == 'c'){
                // pedir nome do produto
                // guardar com scanner
                // pesquisar o produto na lista de estoque
                // adicionar de volta a quantidade ao produto em estoque
                c.remover(null);
                // Mostrar msg de sucesso ou erro
            }

            if (opcao == 'd') {
                c.finalizarCompra();
            }
        }
        in.close();
    }
}
