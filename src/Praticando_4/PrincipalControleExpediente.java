package Praticando_4;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PrincipalControleExpediente {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        DateTimeFormatter horaF = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Digite o horário de entrada: ");
        LocalTime entrada = LocalTime.parse(x.next(), horaF);
        
        System.out.println("Digite a carga horária diária: ");
        int cargaHoraria = x.nextInt();
        
        System.out.println("Digite o horário de saída: ");
        LocalTime saida = LocalTime.parse(x.next(), horaF);

        x.close();

        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);

        Duration dif = Duration.between(saidaPrevista, saida);

        long horasExtras = dif.toHours();
        long minutosExtras = dif.toMinutesPart();

        System.out.println("Horário de entrada: "+entrada.format(horaF));
        System.out.println("Horário de saida previsto: "+saidaPrevista.format(horaF));
        System.out.println("Horário real de saida: "+saida.format(horaF));

        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if (horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("Saldo de horas: "+sinal+Math.abs(horasExtras)+"h "+Math.abs(minutosExtras)+"min");
        }

    }
}
