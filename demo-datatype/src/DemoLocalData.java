import java.time.LocalDate;

public class DemoLocalData {
  public static void main(String[] args) {
    // 2025 12 31
    String s = "hello"; // java.lang
    LocalDate ld1 = LocalDate.of(2025, 12, 31);
    ld1 =ld1.plusDays(1);
    System.out.println(ld1); // 2026-01-01

    LocalDate afterThreeYear = ld1.plusYears(3L);
    System.out.println(ld1); // 2026-01-01
    System.out.println(afterThreeYear); // 2029-01-01

    System.out.println(ld1.minusWeeks(2L)); // 2025-12-18

    System.out.println(ld1.getDayOfMonth()); // 1
    System.out.println(ld1.getMonthValue()); // 1
    System.out.println(ld1.getMonth()); // JANUARY

    ld1 = ld1.plusDays(200L);
    System.out.println(ld1.getDayOfYear()); // 201

    // ! Comparison
    // 2023 4 28
    LocalDate joinDate = LocalDate.of(2023, 4, 28);
    // 3 months probation
    LocalDate probationEndDate = joinDate.plusMonths(3L);
    // check if 2023 8 1 passed the probation
    // isAfter() -> ">"
    // is Before() -> "<"
    LocalDate today = LocalDate.of(2023, 8, 1);
    if (today.isAfter(probationEndDate)){  // true / false
      System.out.println("Today Passed Probation.");
    }

    // Effective Date 2026 01 01
    LocalDate effectiveDate = LocalDate.of(2026, 1, 1);
    today = LocalDate.of(2026, 1, 1);
    if (today.isAfter(effectiveDate) || today.equals(effectiveDate)){
      System.out.println("it is taking effective today");
    } else {
      System.out.println("It does not take effective.");
    }

    System.out.println(ld1.isLeapYear()); // false
    System.out.println(ld1); // 2026-07-20
    System.out.println(ld1.withYear(2024)); // 2024-07-20

    System.out.println(ld1.compareTo(LocalDate.of(2026, 7, 13))); // 7, distance

    int dateDiff = ld1.compareTo(effectiveDate);
    System.out.println(dateDiff); // 6 months (because the year is same)

    if (ld1.compareTo(effectiveDate) > 0);{
    System.out.println(ld1 + " is later than" + effectiveDate);
    }
    // ! Wrong demo. We never use "==" to compare non-primtive value (>=, <=, >, <, ==)
    // Instead, we use isAfter(), isBefore(), equals()
    LocalDate ld2 = LocalDate.of(2024, 10, 31);
    LocalDate ld3 = LocalDate.of(2024, 10, 31);
    System.out.println(ld2 == ld3); // false
  }
  
}
