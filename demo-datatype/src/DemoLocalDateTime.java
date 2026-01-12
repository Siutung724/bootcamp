import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DemoLocalDateTime {
  public static void main(String[] args) {
    LocalDateTime currentTime = LocalDateTime.of(2025, 12, 31, 23, 59, 59);
    System.out.println(currentTime); // 2025-12-31T23:59:59

    System.out.println(currentTime.plusMinutes(32));
    System.out.println(currentTime.minusDays(2));

    // Re-format
    System.out.println(currentTime.format(DateTimeFormatter.ofPattern("dd MM HH:mm"))); // 31 12 23:59
    System.out.println(currentTime.format(DateTimeFormatter.ofPattern("dd MM hh:mm"))); // 31 12 11:59
    System.out.println(currentTime.format(DateTimeFormatter.ofPattern("dd MM hh:mm:ss a"))); // 31 12 11:59:59 a

    // Time Zone
    ZoneId newYork = ZoneId.of("America/New_York");
    ZonedDateTime newYorkLocalDateTime = ZonedDateTime.of(currentTime, newYork);
    System.out.println(newYorkLocalDateTime);

    // newYorkTime (ZonedDateTime) -> LocalDateTime
    ZoneId hongKong = ZoneId.of("Asia/Hong_Kong");

    LocalDateTime hongkongLocalDateTime = 
      newYorkZonedTime.withZoneSameInstant(hongKong). toLocalDateTime();
      System.out.println(hongkongLocalDateTime);

      System.out.println(LocalDateTime.now()); // current time
      System.out.println(LocalDate.now()); // current time

      // Epoch Second -> the total second since 1970 1 1 00:00:00
      System.out.println(LocalDateTime.now().toEpochSecond(ZoneOffset.ofHours(8))); // ! UTC+8

      System.out.println(LocalDateTime.now().getNano());
      System.out.println(LocalDateTime.now().truncatedTo(ChronoUnit.MICROS)); // 
  }
  
}
