package PraticandoDataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrincipalDataLembrete {
    public static void main(String[] args) {
        DateTimeFormatter dataF = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataVenc = LocalDate.of(2025, 3, 30);
        int antecedencia = 5;
        LocalDate dataLembrete = dataVenc.minusDays(antecedencia);

        System.out.println("Data do lembrete: "+dataLembrete.format(dataF));

    }
}
