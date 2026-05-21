package PraticandoVariaveis;

public record Livro(String titulo, String autor, int paginas, double preco, char categoria) {

    public DescricaoCategoria cadastraLivro(){

        switch (this.categoria) {
            case 'F':
                return DescricaoCategoria.FICCAO;
            case 'N':
                return DescricaoCategoria.N_FICCAO;
            case 'T':
                return DescricaoCategoria.TECNOLOGIA;
            case 'H':
                return DescricaoCategoria.HISTORIA;
            default:
                return DescricaoCategoria.INVALIDA;
        }
    }
}