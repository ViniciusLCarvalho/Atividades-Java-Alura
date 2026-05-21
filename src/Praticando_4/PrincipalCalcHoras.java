package Praticando_4;

import java.time.Duration;
import java.time.LocalTime;

public class PrincipalCalcHoras {
    public static void main(String[] args) {
        LocalTime hhInicial, hhFinal;
        
        hhInicial = LocalTime.of(14,30,0);
        hhFinal = LocalTime.of(16, 45, 0);

        Duration d = Duration.between(hhInicial, hhFinal);

        System.out.println("Diferença de tempo "+ d.toHours() +" horas e "+d.toMinutesPart()+" minutos");
    }
}
