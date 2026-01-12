public class DemoWrapper2 {

  public static void main(String[] args) {
    // The ways to create Integer Object:
    Integer x = 3;
    Integer x2 = new Integer(3);
    Integer x3 = Integer.valueOf(3);

    // Double Object
    Double d1 = 4.5;
    Double d2 = new Double(4.5);
    Double d3 = Double.valueOf(4.5);

    // String Oject (non-Wrapper Class)
    String s1 = "Hello";
    String s2 = new String("Hello");
    String s3 = String.valueOf("Hello");

    // 
    Integer i1 = Integer.valueOf(127);
    Integer i2 = Integer.valueOf(127);
    System.out.println(i1.equals(i2)); // true
    System.out.println(i1 == i2); // true

    Integer i3 = Integer.valueOf(128);
    Integer i4 = Integer.valueOf(128);
    System.out.println(i3.equals(i4)); // true
    // ! "==" -> check if i3' address is same as i4's address
    System.out.println(i3 == i4); // false

    Integer i5 = new Integer(127); // ! "New" -> force to create new object
    Integer i6 = new Integer(127); // ! "New" -> force to create new object
    System.out.println(i5 == i6); // false


    // String
    // Pool: "abc" / String.valueOf("abc")
    // Heap: new String()
    String s4 = "abc"; // Literal Pool: Store same string value once
    String s5 = "abc"; // Literal Pool: Store same string value once
    System.out.println(s4.equals(s5)); // true
    System.out.println(s4 == s5); // true

    String s6 = new String("abc"); // heap memory
    System.out.println(s4 == s6); // false

    String s7 = String.valueOf("abc");
    System.out.println(s4 == s7); // true

    // s4.replace("bc", "xy"); // Produced a String Object in heap, but you did not write it down its address
    String s10 = s4.replace("bc", "xy"); // write operation?
    System.out.println(s4); // abc
    System.out.println(s10); // axy

    // s10.charAt(0); // useless

    String studentName = "Peter";
    if ("Peter".equals(studentName)){ // You don't need to use new String("Peter")
      System.out.println("He is Peter.");
    }

    System.out.println(Integer.MAX_VALUE); // 2147483647
  }
  
}
