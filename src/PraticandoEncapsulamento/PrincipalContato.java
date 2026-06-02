package PraticandoEncapsulamento;

import java.util.ArrayList;
import java.util.List;

public class PrincipalContato {
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("João Silva", "(11) 99999-0000"));
        contatos.add(new Contato("Luan Santos", "(21) 98888-0000"));
        contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));

        int i = 1;
        for (Contato contato : contatos) {
        System.out.printf("%d. %s - %s\n", i++, contato.getNome(), contato.getTelefone());
        }
    }
}
