package PraticandoPOO;

public record Livros(String titulo, String autor, int paginas) {
    void exibir(){
        System.out.printf("\"%s\" de %s com %d páginas%n", this.titulo, this.autor, this.paginas);
    }
}
