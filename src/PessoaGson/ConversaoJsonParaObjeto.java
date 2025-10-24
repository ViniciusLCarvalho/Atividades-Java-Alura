package PessoaGson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJsonParaObjeto {
    public static void main(String[] args) {
        String json ="{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println("Objeto Pessoa: "+ pessoa);
    }
}