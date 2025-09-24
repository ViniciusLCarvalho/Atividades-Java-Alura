package BuscaAPITheMealDB;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
 * Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as 
 * classes HttpClient, HttpRequest e HttpResponse. Solicite ao usuário que insira 
 * o nome de uma receita e exiba as informações disponíveis sobre essa receita.
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
