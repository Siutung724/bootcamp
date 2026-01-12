import java.util.Arrays;

public class DemoArray3 {
  //Exercise
  public static void main(String[] args) {
    // 10, 25, 3, 48, 57
    // print all numbers
    int [] numbers = {10, 25, 3, 48, 57};
    System.out.println("normal for loop:");
    for (int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }
  
    // 23, 44, 67, 88, 91, 12
    // loop -> print all even numbers
    int [] numbers = {23, 44, 67, 88, 91, 12};
    System.out.println("all even number for loop");
    for (int i = 0; i < numbers.length; i++){
      if (numbers[i] % 2 == 0){
      System.out.println(numbers[i]);
    }
}
    // Find the median, 34, 78, 12, 89, 45, 99, 23
    int [] numbers = {34, 78, 12, 89, 45, 99, 23};
    Arrays.sort(numbers);
    for (int n = numbers){
      System.out.println(n + "");
    }
    System.out.println();
   
    // prices 99.9, 13.8, 9.9, 1200.0
    // quantities 3, 10, 12, 20
    // amount (amount = prices + quantity)

    //
    String [] usernames = new String [] ("johnwong", "stevenchan", "jennyng");
    String [] passwords = new String [] ("abcd1234", "ijk789", "xyz436");

    String usernameInput = "stevenchan";
    String passwordInput = "ijk789";

    // 1. Username is NOT Found.
    // 2. Password is wrong. (Scenario: Username is found.)
    // 3. Login success.

    int userIdx = -1;
    for (int i = 0; i < usernames.length; i++) {
      if (usernameInput.equals(usernames[i])) {
        userIdx = i;
        break;
      }
    }
    if (userIdx == -1) {
      System.out.println("User is NOT Found.");
    } else {
      if (passwordInput.equals(passwords[userIdx])) {
        System.out.println("Login success.");
      } else {
        System.out.println("Password is wrong.");
      }
    }

    // ages 16, 66, 18, 37
    // genders 'M', 'F', 'M', 'F'
    // smokers false, true, true, false
    int[] ages = new int[] {16, 66, 18, 37};
    char[] genders = new char[] {'M', 'F', 'M', 'F'};
    boolean[] smokers = new boolean[] {false, true, true, false};

    // baseFee = 100
    // 1. Smoker -> +20% fee
    // 2. age > 60 -> +30% fee
    // 3. genders female -> +5% fee

    // calculate fees
    int percentage = 0;
    double baseFee = 100.0;
    double[] fees = new double[ages.length];
    for (int i = 0; i < fees.length; i++) {
      percentage = 0;
      if (smokers[i]) {
        percentage += 20;
      }
      if (ages[i] > 60) {
        percentage += 30;
      }
      if (genders[i] == 'F') {
        percentage += 5;
      }
      fees[i] = baseFee * (1 + percentage / 100.0);
    }
    System.out.println("Fees=" + Arrays.toString(fees));




    // toCharArray()
    String staff = "John";
    char[] chs = staff.toCharArray();
    System.out.println(Arrays.toString(chs)); // [J, o, h, n]

    int b = 7;
    b = 7;
    System.out.println(b); // 7

    // lowercase letter
    char[] characters = new char[] {'a', 'z', 'b', 'z', 'z', 'z', 'a', 'c', 'b', 'a'};

    // which letter has the max count.
    // Step 1: new int[26], count each letter
    int[] counts = new int[26];
    for (int i = 0; i < characters.length; i++) {
      counts[characters[i] - 'a']++;
    }
    System.out.println(Arrays.toString(counts));
    
    // Step 2: find max.
    int max = counts[0];
    int targetPos = 0;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > max) {
        max = counts[i];
        targetPos = i;
      }
    }
    System.out.println((char) (targetPos + 'a')); // z
  }
}
  private static int counts(int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'counts'");
  }

}