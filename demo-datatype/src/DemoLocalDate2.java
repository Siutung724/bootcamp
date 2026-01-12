import java.time.LocalDate;

public class DemoLocalDate2 {
  public static void main(String[] args) {
    // 2024-10-01
    // 2023-01-31
    // 2025-06-30
    // array stores the dates, count the number of dated later than 2024

    // Find the max date from the above array
    LocalDate[]dates = new LocalDate[] {LocalDate.of(2024, 10, 31),
      LocalDate.of(2023, 01, 31), LocalDate.of(2025, 06, 30)};
      int count = 0;
      for (int i = 0; i < dates.length; i++){
        if (dates[i].getYear() >= 2024) {
          count++;
        }
      }
      System.out.println("the number of dates later than 2024=" + count);
      
  }
  
}
