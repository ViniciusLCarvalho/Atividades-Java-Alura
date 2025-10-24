package ExcecaoBuscaGitHub;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Digite um nome de usuário do GITHUB para consulta: ");
        var username = x.nextLine();
        x.close();
        String endereco = "https://api.github.com/users/" + username;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            System.out.println("Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}
