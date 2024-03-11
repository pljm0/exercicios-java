import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Datas {

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.parse("2024-05-07");
        LocalDateTime d2 = LocalDateTime.parse("2024-05-07T01:30");
        Instant d3 = Instant.parse("2024-05-07T01:30:26Z");

        // ZoneId.getAvailableZoneIds();

        LocalDate r1 = LocalDate.ofInstant(d3, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d3, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d3, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d3, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d1 dia = " + d1.getDayOfMonth());
        System.out.println("d1 mes = " + d1.getMonthValue());
        System.out.println("d1 ano = " + d1.getYear());

        System.out.println("d2 hora = " + d2.getHour());
        System.out.println("d2 hora = " + d2.getMinute());

    }

}
