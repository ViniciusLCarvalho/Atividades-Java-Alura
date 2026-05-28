package PraticandoPOO;

public class PrincipalControleEstoque {
    public static void main(String[] args) {
        ItemEstoque i = new ItemEstoque("Camiseta", 10);
        i.vender(3);
        i.vender(8);
    }
}
