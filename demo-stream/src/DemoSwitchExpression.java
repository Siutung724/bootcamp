public class DemoSwitchExpression {
  // switch
  // 1. break actively
  // 2. No range checking

  // Switch Expression (Lambda)
  public static void main(String[] args) {
    Weekday today = Weekday.WED;

    switch (today) {
      case MON -> System.out.println("Today is MON");
      // case MON -> System.out.println("Today is MON");
      case TUE -> System.out.println("Today is TUE");
      case WED -> System.out.println("Today is WED");
      case THU -> System.out.println("Today is THU");
      case FRI -> System.out.println("Today is FRI");
      default -> System.out.println("hello");
    };

    String result = switch (today) {
      case MON -> {
        // ....
        yield "Monday";
      }
      case TUE -> "Tuesday";
      case WED, THU -> "Wednesday and Thursday";
      case FRI -> "Friday";
      default -> "DEFAULT";
    };
  }

  public static enum Weekday {
    MON, TUE, WED, THU, FRI,;
  }
}