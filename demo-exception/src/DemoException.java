public class DemoException {
  public static void main(String[] args) {
    // Java
    // 1. Class and Object (return)
    // 2. Exception Object (throw)

    // 1. ArrayIndexOutOfBounds
    int[] arr = new int[] {3, 4};
    // System.out.println(arr[-1]); // ! Runtime Error
    // System.out.println(arr[2]); // ! Runtime Error
    // System.out.println(arr[arr.length]); // ! Runtime Error

    // 2. StringIndexOutOfBounds
    String s = "hello";
    // System.out.println(s.charAt(-1)); // ! Runtime Error
    // System.out.println(s.charAt(s.length())); // ! Runtime Error

    // 3. NullPointerException
    String input = null;
    // System.out.println(firstChar(input)); // ! Runtime Error

    //
    fullName("John", "Wong"); // method caller -> return "John Wong"


    // 4. IllegalArgumentException
    String lastName = null;
    // recovery
    try {
      System.out.println("check point 1");
      fullName("John", lastName); // ! method caller -> return exception object
      System.out.println("check point 2"); // skipped...
    } catch (IllegalArgumentException e) { // ! e -> Exception Object Reference
      // recovery action....
      System.out
          .println("Recover fullName Exception. message=" + e.getMessage());
    }


    // 5. NumberFormatException
    try {
      Integer userInput = Integer.valueOf("100"); // OK
      userInput = Integer.valueOf("100hello"); // NumberFormatException
    } catch (NumberFormatException e) {
      System.out.println("Recovery Action for NumberFormatException.");
    }

    // 6. ArithmeticException
    int count = 0;
    int totalAmount = 12300;
    try {
      double averageAmount = totalAmount / count;
      // ! divided by 0.0 -> No Exception
      System.out.println("Average Amount=" + averageAmount);
    } catch (ArithmeticException e) {
      System.out.println("Count cannot be 0.");
    }

    System.out.println("End of Program...");
  }

  public static String fullName(String firstName, String lastName) {
    if (firstName == null || lastName == null) {
      throw new IllegalArgumentException(
          "I am going to die, this is my last message. firstName and lastName should not be null.");
    }
    return firstName + " " + lastName;
  }

  public static char firstChar(String s) {
    // if (s == null)
    // return ' ';
    return s.charAt(0);
  }

  public static int sum(int x, int y) {
    return x + y;
  }
}