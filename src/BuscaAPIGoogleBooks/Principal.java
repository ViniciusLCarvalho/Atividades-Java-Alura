package BuscaAPIGoogleBooks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
 * Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para
 * fazer uma consulta à API do Google Books. Solicite ao usuário que insira o título de um 
 * livro, e exiba as informações disponíveis sobre o livro retornado pela API.
 */

public class Principal {
    public static void main(String[] args) throws IOException {
        String chave = null;

        InputStream fis = new FileInputStream("apiKey.txt");
        Reader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            if(linha.startsWith("")) // adicionar a chave no arquivo apiKey.txt
                chave = linha.split("=")[1];
                break;
        }
        br.close();
    }
}
