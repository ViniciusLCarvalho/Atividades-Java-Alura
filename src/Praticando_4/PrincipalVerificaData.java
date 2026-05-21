package Praticando_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrincipalVerificaData {
    public static void main(String[] args) {
        DateTimeFormatter fData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataEvento = LocalDate.of(2025, 03, 10);
        LocalDate dataHoje = LocalDate.now();

        System.out.println("Data do evento: "+dataEvento.format(fData));
        System.out.println("Data atual: "+dataHoje.format(fData));
        
        if (dataEvento.isBefore(dataHoje)) {
            System.out.println("O evento já ocorreu.");
        } else {
            System.out.println("O evento ainda está por vir.");
        }
    }
}
