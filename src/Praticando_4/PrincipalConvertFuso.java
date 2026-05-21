package Praticando_4;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class PrincipalConvertFuso {
    public static void main(String[] args) {
        DateTimeFormatter horaF = DateTimeFormatter.ofPattern("HH:mm");
        ZonedDateTime horaSistema = ZonedDateTime.now();
        ZonedDateTime horaSydney = horaSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        System.out.println("Horário atual no sistema: "+horaSistema.format(horaF));
        System.out.println("Horário atual em Sydney: "+horaSydney.format(horaF));
        System.out.println("Horário atual em Tokyo: "+horaSistema.withZoneSameInstant(ZoneId.of("Asia/Tokyo")).format(horaF));

    }
}
