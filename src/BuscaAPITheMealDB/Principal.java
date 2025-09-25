package BuscaAPITheMealDB;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/* 
 * Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as 
 * classes HttpClient, HttpRequest e HttpResponse. Solicite ao usuário que insira 
 * o nome de uma receita e exiba as informações disponíveis sobre essa receita.
 */

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        /* 
        *** Não é necessária uma chave de API ***

        String chave = null;

        InputStream fis = new FileInputStream("apiKey.txt");
        Reader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            if(linha.startsWith("")) {
                chave = linha.split("=")[1];
                break;
            }
            linha = br.readLine();
        }
        br.close(); */
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome de uma receita para busca:");
        var receita = URLEncoder.encode(in.nextLine(), StandardCharsets.UTF_8);

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
