package SerializaTitulo;

import com.google.gson.annotations.SerializedName;

public class Titulo {
    @SerializedName("title")
    private String nome;

    @SerializedName("year")
    private int ano;

    public Titulo(String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

}
