package EstudoDoMap;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Declaração
        Map<Integer, String> pessoas = new HashMap<>();
        Map<String, User> users = new HashMap<>();

        // incluir conjuntos de chaves-valor
        users.put("joao@email.com", new User("João", 22));
        users.put("maria@email.com", new User("Maria", 32));
        users.put("juca@email.com", new User("Juca", 18));
        users.put("leo@email.com", new User("Leo", 40));

        pessoas.put(123, "João");
        pessoas.put(456, "Maria");
        pessoas.put(789, "Carlos");
        // Substituis o valor na chave 789 de Carlos -> Marcos
        pessoas.put(789, "Marcos");
        // Substitui com metodo próprio na chave 789 Marcos -> Carlos
        pessoas.replace(789, "Carlos");

        // Busca o valor da chave 123
        System.out.println(pessoas.get(123));

        System.out.println(users.get("maria@email.com"));

        // Verifica se uma chave existe
        System.out.println((pessoas.containsKey(2))?"Existe":"Não existe");
        System.out.println((pessoas.containsKey(123))?"Existe":"Não existe");

        System.out.println((users.containsKey("joao@email.com"))?"Existe":"Não existe");
        
        // Verifica se um valor existe
        System.out.println((pessoas.containsValue("Maria"))?"Existe":"Não existe");
        System.out.println((pessoas.containsValue("Carlos"))?"Existe":"Não existe");

        System.out.println((users.containsValue(new User("Leo", 40)))?"Existe":"Não existe");
    
        // Percorre um Map por...
        // Chaves
        for (Integer chave : pessoas.keySet()) {
            System.out.println(chave);
        }

        for (String keyString : users.keySet()) {
            System.out.println(keyString);
        }

        // usando lambda com um Consumer de Key
        users.keySet().forEach((k -> System.out.println(k)));

        // Valores
        for (String valor : pessoas.values()) {
            System.out.println(valor);
        }

        for (User valUser : users.values()) {
            System.out.println(valUser);
        }

        // usando lambda com um Consumer Valor
        users.values().forEach((v -> System.out.println(v)));

        
        // Par chave-valor
        for (Map.Entry<Integer, String> entry : pessoas.entrySet()) {
            System.out.println(entry.getKey() +" -> "+ entry.getValue());
        }
        
        // Usando lambda com um BiConsumer key, valor
        users.forEach((k, v) -> System.out.printf("key  %s | valor %s \n", k, v));

        // Remove um elemento
        pessoas.remove(789);

        // Retorna o tamanho do Map
        pessoas.size();
    }
}
