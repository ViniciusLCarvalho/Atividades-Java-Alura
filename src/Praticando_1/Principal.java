package Praticando_1;

public class Principal {
    public static void main(String[] args) {
        var x = "************************************************************************";
        DadosPessoais dp = new DadosPessoais("Vinícius", 28, 1.69, true);
        Estoque e = new Estoque("Trigo", 19.5, "Cereal");
        Boletim b = new Boletim(7.5, 8.0, 9.0);
        Conversor c = new Conversor(20);
        Livro l = new Livro("O pequeno principe", "Antonie de Saint-Exupery", 96, 39.90, 'F');
        Planos p = new Planos(150.0);
        Numeros n = new Numeros(7);
        Moeda m = new Moeda(451.50, 5.25);

        System.out.println("Nome: "+dp.nome()+"\n"
        +"Idade: "+dp.idade()+"\n"
        +"Altura: "+dp.altura()+"\n"
        +"É estudante: "+dp.isEstudante());  
        System.out.println(x);
        System.out.println("A quantidade de "+e.Produto()+" em estoque é de "+(int)e.quantidade()+" kg.");
        System.out.println(x);
        System.out.println("A média das notas é: "+b.calculaMédia());
        System.out.println(x);
        System.out.println("A temperatura em graus Fahrenheit é: "+c.conversor());
        System.out.println(x);
        System.out.println("Livro cadastrado: \"" + l.titulo() + "\", de " + l.autor() + ". Ele possui " + l.paginas() + " páginas, custa R$" + l.preco() + " e pertence à categoria " + l.cadastraLivro() + ".");
        System.out.println(x);
        System.out.println("Categoria do produto: "+p.categorizaPlanos());
        System.out.println(x);
        System.out.println("O valor é "+n.parOuImpar());
        System.out.println(x);
        System.out.println("O valor em dolares é: "+m.converteCambio());
    }
}
