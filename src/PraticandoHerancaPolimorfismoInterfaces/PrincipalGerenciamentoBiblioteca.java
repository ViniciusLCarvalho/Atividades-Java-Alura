package PraticandoHerancaPolimorfismoInterfaces;

public class PrincipalGerenciamentoBiblioteca {
    public static void main(String[] args) {
        Livro l = new Livro("O Hobbit", "1937", "J.R.R. Tolkien");
        Revista r = new Revista("National Geographic", "2023", 245);
        Ebook e = new Ebook("Clean code", "2008", "PDF");

        l.exibir();
        r.exibir();
        e.exibir();
    }
}
