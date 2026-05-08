package Praticando_4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PrincipalDataFormatada {
    public static void main(String[] args) {
        DateTimeFormatter fdata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fhora = DateTimeFormatter.ofPattern("HH:mm");

        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        System.out.println("Data: "+data.format(fdata));
        System.out.println("Hora: "+hora.format(fhora));

    }
}
