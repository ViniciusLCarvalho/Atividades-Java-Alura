package ListaTitulo;

public class Titulo implements Comparable<Titulo> {
    public String nome;

    public Titulo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo t) {
        return this.nome.compareTo(t.nome);
    }
}
