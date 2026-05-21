package Praticando_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrincipalAjusteDeData {
    public static void main(String[] args) {
        DateTimeFormatter fData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataCompra = LocalDate.now();
        LocalDate datavencimento = dataCompra.plusMonths(1);

        System.out.println("Nova data de vencimento: "+datavencimento.format(fData));
    }
}
