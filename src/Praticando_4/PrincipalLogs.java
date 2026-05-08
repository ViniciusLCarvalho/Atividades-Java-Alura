package Praticando_4;

import java.time.LocalDate;
import java.time.LocalTime;

public class PrincipalLogs {
    public static void main(String[] args) {
        String tarefa = "Enviar relatório semanal";
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        System.out.println("Tarefa: \""+tarefa+"\"");
        System.out.println("Data: "+data);
        System.out.println("Hora: "+hora);
    }
}
