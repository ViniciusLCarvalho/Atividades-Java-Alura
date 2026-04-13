package Praticando;

public class Principal {
    public static void main(String[] args) {
        var x = "************************************************************************";
        DadosPessoais dp = new DadosPessoais("Vinícius", 28, 1.69, true);
        Estoque e = new Estoque("Trigo", 19.5, "Cereal");
        Boletim b = new Boletim(7.5, 8.0, 9.0);
        Conversor c = new Conversor(20);

        System.out.println("Nome: "+dp.nome()+"\n"
        +"Idade: "+dp.idade()+"\n"
        +"Altura: "+dp.altura()+"\n"
        +"É estudante: "+dp.isEstudante());  
        System.out.println(x);
        System.out.println("Olá, "+dp.nome()+"!");
        System.out.println("A quantidade de "+e.Produto()+" em estoque é de "+(int)e.quantidade()+" kg.");
        System.out.println(x);
        System.out.println("A média das notas é: "+b.calculaMédia());
        System.out.println(x);
        System.out.println("A temperatura em graus Fahrenheit é: "+c.conversor());

    }
}
