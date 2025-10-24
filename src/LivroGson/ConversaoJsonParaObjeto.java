package LivroGson;

import com.google.gson.Gson;

public class ConversaoJsonParaObjeto {
    public static void main(String[] args) {
        String json = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";
        
        Gson gson = new Gson();
        Livro livro = gson.fromJson(json, Livro.class);
        
        System.out.println("Objeto Livro: "+livro);
    }
}
