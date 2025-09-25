package BuscaAPICoinGecko;

import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
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
 *  Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse 
 *  para fazer uma consulta à API CoinGecko e exiba a cotação atual de uma criptomoeda 
 *  escolhida pelo usuário.
 */

public class Principal {
    public static void main(String[] args)  throws IOException, InterruptedException {
        String chave = null;
        Scanner in = new Scanner(System.in);

        InputStream fis = new FileInputStream("apiKey.txt");
        Reader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            if(linha.startsWith("APIKEYCOINGECKO=")){
                chave = linha.split("=")[1];
                break;
            }
            linha = br.readLine();
        }
        br.close();

        System.out.println("Digite uma moeda digital para buscar");
        var id = URLEncoder.encode(in.nextLine(), StandardCharsets.UTF_8);
        
        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids="+ id +"&vs_currencies=usd&x-cg-demo-api-key=" + chave;
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
