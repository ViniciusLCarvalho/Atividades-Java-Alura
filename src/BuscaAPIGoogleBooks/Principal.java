package BuscaAPIGoogleBooks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/* 
 * Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para
 * fazer uma consulta à API do Google Books. Solicite ao usuário que insira o título de um 
 * livro, e exiba as informações disponíveis sobre o livro retornado pela API.
 */

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        String chave = null;
        Scanner in = new Scanner(System.in);

        InputStream fis = new FileInputStream("apiKey.txt");
        Reader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            if(linha.startsWith("APIKEYGOOGLEBOOKS=")){
                chave = linha.split("=")[1];
                break;
            }
            linha = br.readLine();
        }
        br.close();

        System.out.println("Digite o nome de um livro para buscar:");
        var titulo = URLEncoder.encode(in.nextLine(), StandardCharsets.UTF_8);

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + titulo + "&key=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        in.close();
        
        System.out.println(response.body());
    }
}
