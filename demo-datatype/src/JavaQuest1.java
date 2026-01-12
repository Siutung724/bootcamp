import java.math.BigDecimal;

/**
 * Expected Output:
 * 
 * I am going to add two numbers together:
 * The first one: 31
 * The second one: 42
 * The sum is 73
 * The subtraction reuslt is 11
 * The another sum result is 130
 * The variable varB is false
 * The variable varC is true
 * The variable fnumber is -130.2
 * The variable dnumber is -20.5
 * The variable remainder is 1
 * The variable result is 3
 */
// Primitive types and operators

public class JavaQuest1 {
public static void main(String[] args) {
  
  System.out.println("I am going to add two numbers together");
  int first = 31;
  // declare the second one
  int second = 42;
  int sum = first + second;
  System.out.println("The sum is " + sum); // The sum is 73

  System.out.println(BigDecimal.valueOf(second).subtract(BigDecimal.valueOf(first))); // The subtraction reuslt is 11

  int first1 = 58;
  int second1 = 72;
  int sum1 = first1 + second1;
  System.out.println("The sum is " + sum1); // The sum is130

  // The variable varB is false
  // The variable varC is true
  boolean varB = false;
  boolean varC = true;
  System.out.println(varB); // false
  System.out.println(varC); // true

   // The variable fnumber = -130.2
   // The variable dnumber = -20.5
   double fnumber = -130.2;
   double dnumber = -20.5;
   System.out.println(fnumber); // -130.2
   System.out.println(dnumber); // -20.5

   int dividend = 10;   // 被除數
   int divisor  = 3;    // 除數
        
    // The variable remainder is 1  → 餘數（用 %）
    int remainder = dividend % divisor; // 10 ÷ 3 = 餘數 1
        
    // The variable result is 3     → 商數（用 /）
    int result = dividend / divisor; // 10 ÷ 3 = 商數 3
    
    System.out.println("The variable remainder is " + remainder); // 1
    System.out.println("The variable result is " + result); // 3

}

  
}
