package CriaArquivo;

import java.io.FileWriter;
import java.io.IOException;

public class NovoArquivo {
    public static void main(String[] args) throws IOException{
        String mensagem = "Conteúdo a ser gravado no arquivo.";

        FileWriter writer = new FileWriter("arquivo.txt");
        writer.write(mensagem);
        writer.close();
    }
}
