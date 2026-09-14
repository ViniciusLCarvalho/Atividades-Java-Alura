package EstudoApiStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiStream {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> nomes = List.of("Vinicius", "Julyane", "Adriana", "Ricardo", "Paulo", "Regina");
        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put(nomes.get(0), numeros.get(8));
        pessoas.put(nomes.get(1), numeros.get(7));
        pessoas.put(nomes.get(2), numeros.get(6));
        pessoas.put(nomes.get(3), numeros.get(5));
        pessoas.put(nomes.get(4), numeros.get(4));
        pessoas.put(nomes.get(5), numeros.get(3));

        pessoas.forEach((k, v) -> System.out.printf("%s | %d \n", k, v));

        numeros.stream()
                .filter(numero -> numero % 2 == 0) // Mantenha o número se essa condição for verdadeira
                .forEach(System.out::println); // Para cada valor recebido, chame System.out.println()

        numeros.stream()
                .filter(numero -> numero % 2 == 0) // filtra {2,4,6,8}
                .map(numero -> numero * 10) // multiplica os numeros filtrados por 10
                .forEach(System.out::println); // Para cada valor recebido, chame System.out.println()

        // guarda o resultado da stream na lista tamanhos
        List<Integer> tamanhos = nomes.stream()
                .map(nome -> nome.length()) // Pegue o tamanho de cada nome
                .toList(); // guarde na lista

        System.out.println("sorted():");
        tamanhos.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("distinct():");
        tamanhos.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("sorted() distinct():");
        tamanhos.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);

        System.out.println("limit(2):");
        tamanhos.stream()
                .limit(2)
                .forEach(System.out::println);
    }
}
