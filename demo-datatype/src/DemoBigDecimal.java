import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // 0.2 + 0.1
    System.out.println(0.2 + 0.1); // 0.30000000000000004
    BigDecimal bd1 = BigDecimal.valueOf(0.2);
    BigDecimal bd2 = BigDecimal.valueOf(0.1);
    BigDecimal result = bd1.add(bd2);

    System.out.println(result); // 0.3
    System.out.println(result.doubleValue()); // 0.3
    System.out.println(result.longValue()); // 0

    // 0.3 -0.1
    System.out.println(0.3 - 0.1); // 0.19999999999999998
    // subtract()
    System.out.println(BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1))); // 0.2

    // 0.1 = 0.2
    System.out.println(0.1 * 0.2); // 0.020000000000000004
    // Multiply()
    System.out.println(BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2))); // 0.02

    // 0.25123 * 0.15
    double x = 0.25123;
    double y = 0.15;
    System.out.println(BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y))); // 0.0376845

    System.out.println(BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y))
    .setScale(2, RoundingMode.HALF_UP).doubleValue()); // 0.04

    System.out.println(BigDecimal.valueOf(0.5).multiply(BigDecimal.valueOf(0.5))
    .setScale(2, RoundingMode.HALF_DOWN).doubleValue()); // 0.2 (0.25 -> 0.2)

    // chain method: 0.2 * 0.1 - 0.4 + 3.5

    double r = (BigDecimal.valueOf(0.2)
    .multiply(BigDecimal.valueOf(0.1)))
    .subtract(BigDecimal.valueOf(0.4))
    .add(BigDecimal.valueOf(3.5))
    .doubleValue();
    System.out.println(r); // 3.12

    // Divide
    // / Zero
    // non-terminted decimal places (i.e. 3.33333)
    System.out.println(BigDecimal.valueOf(9).divide(BigDecimal.valueOf(3)).doubleValue()); // 3.0
    System.out.println(BigDecimal.valueOf(9).divide(BigDecimal.valueOf(2)).doubleValue()); // 4.5

    // ! Non-terminating Decimal Expansion
    // System.out.println(BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3)).doubleValue()); //java/lang.ArithmeticException
    System.out.println(BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP).doubleValue()); // 3.33

    // ! / zero
    //java/lang.ArithmeticException
    int count = 0;
    int totalScore = 234;
    double averageScore = 0;
    if (count == 0){
      averageScore = 0;
  } else {
    averageScore = BigDecimal.valueOf(totalScore) //
    .divide(BigDecimal.valueOf(count), 2, RoundingMode.HALF_UP) //
    .doubleValue(); //
  }
    System.out.println(averageScore);

    // ! double x double -> floating point issue.
    // ! int x double -> floating point issue.
    int quantity = 3;
    double price = 99.9;
    System.out.println(quantity * price);  // 299.70000000000005

    // Solution:
    System.out.println(BigDecimal.valueOf(quantity).multiply(BigDecimal.valueOf(price)).doubleValue()); // 299.7
  }
  }
  

