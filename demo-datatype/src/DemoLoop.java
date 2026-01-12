public class DemoLoop {
  public static void main(String[]args){
    int x =3;
    x *= 3;
    x *= 3;
    System.out.println(x);

    // for (initialization: critria to continue; modifier)
    x = 3;
    for (int i = 0; i < 4; i++){
      x *= 3;
    }
    System.out.println(x); //243

    // Step 1: i = 0
    // Step 2: i < 4 7 yes
    // Step 3: x *= 3
    // Step 4: i++, i -> 1
    // Step 5: i < 4 7 yes
    // Step 6: x *= 3

    // Step 7: 
    // Step 8: 
    // Step 9: 

    // Step 10: 
    // Step 11: 
    // Step 12: 

    // Step 13: 
    // Step 14: 

    // print 50 hello
    for (int i = 0; i < 50; i++){ // 0 -49
     System.out.println("hello");
    }

    // 0 - 100
    // print even numbers
    // for loop + if
    for (int i = 0; i <= 100; i++){ // 0 -100
      if (i % 2 == 0){
      System.out.println(i);
      }
  }
    // 0 - 20
    // print odd numbers and the number > 5
    for (int i = 0; i <= 20; i++){
      if (i > 5 && i % 2 == 1) {
        System.out.println("odd numbers and the number > 5.");
      }
    }
      // Leap year
      // divided by 100, not a leap year, unless divided by 400 (i.e. 2000 is a leap year)
      // i.e. 2100 is not a leap year, 2004 is a leap year

      int year = 2100;
      boolean isLeapYear = false;
      if (year % 4 == 0) {
            // If divisible by 100 → not a leap year, UNLESS also divisible by 400
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;   // e.g., 2000, 2400
                }
                // else: divisible by 100 but not 400 → NOT leap (e.g., 2100, 1900)
            } else {
                isLeapYear = true;       // e.g., 2004, 2024
            }
}
        System.out.println(isLeapYear);
        
        isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        System.out.println(isLeapYear);

          // sum up 1 - 100
          int total = 0;
          for (int i = 0; i <= 100; i++){
            total += i;
    }
        System.out.println(total); // 5050


        // the number of value between 1 - 100, which is divided by 6
        int count = 0;
        for (int i = 1; i <= 100; i++){
         if (i % 6 == 0) {
          count++;
      }
      }
      System.out.println("the number of values between 1 - 100 divided by 6" + count);
      // System.out.println(i); error

      // convert 1 - 100 to char values, then concat them together
      String result = "";
      for (int i = 1; i <= 100; i++){
        result += (char) i; // String + any type of value -> String
      }
      System.out.println(result);
  }
}