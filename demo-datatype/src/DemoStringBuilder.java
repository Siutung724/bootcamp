import java.math.BigDecimal;

public class DemoStringBuilder {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder(); // "" empty string
    sb.append("hello"); // concat()
    System.out.println(sb); //hello
    sb.append("!!!"); // concat()
    System.out.println(sb); // hello!!!

    String s = "hello";
    String s2 = s.concat("!!!");
    System.out.println(s2); // hello!!!
    System.out.println(s); // hello

    //
    String x = "";


    // Other Methods
    System.out.println(sb2.length());
    System.out.println(sb2.charAt(0));
    System.out.println(sb2.isEmpty());
    System.out.println(sb2.indexOf("a"));
    System.out.println(sb2.substring(0, 3));

    // !!!! reversed
    String input = "hello";
    StringBuilder sb4 = new StringBuilder(input);
    sb4.reverse();
    System.out.println(sb4); // olleh


    // !!!! deleteCharAt
    String sb3 = new StringBuilder(input);
    sb3.deleteCharAt(3);
    System.out.println(sb3); // helo


    double d1 = 0.2;
    double result = BigDecimal.valueOf(d1).multiply(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result);

  }
  
}
