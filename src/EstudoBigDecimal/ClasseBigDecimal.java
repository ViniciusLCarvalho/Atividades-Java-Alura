package EstudoBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClasseBigDecimal {
    public static void main(String[] args) {
        // formas de declarar
        BigDecimal a = new BigDecimal("10.5");
        BigDecimal b = new BigDecimal("5.0");
        BigDecimal c = new BigDecimal("15.7");
        BigDecimal d = BigDecimal.valueOf(10.5);

        // operações matemáticas
        BigDecimal w = a.add(new BigDecimal("10"));
        BigDecimal x = b.multiply(new BigDecimal("15.3"));
        BigDecimal y = c.divide(new BigDecimal("7"), RoundingMode.HALF_UP);
        BigDecimal z = b.subtract(new BigDecimal("9.1"));

        System.out.println("w = "+w);
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
        System.out.println("=================");
        // Comparação
        System.out.println((a.compareTo(d) == 0)?"igual":"n/a");
        System.out.println((x.compareTo(b) > 0)?"Maior":"n/a");
        System.out.println((a.compareTo(x) < 0)?"Menor":"n/a");

    }
}
