package PraticandoDataHora;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class PrincipalFusoHorario {
    public static void main(String[] args) {
        DateTimeFormatter horaF = DateTimeFormatter.ofPattern("HH:mm:ss");
        ZonedDateTime horaJapao = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Horário atual em Tóquio: "+horaJapao.format(horaF));
    }
}
