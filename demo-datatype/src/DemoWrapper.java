public class DemoWrapper {

  public static void main(String[] args) {
    // Wrapper Class
    // 8 Primtive -> 8 Wrapper Classes

    // x is a variable
    int x = 3;

    // Box (Object)
    // x2 is an objects
    Integer x2 = 3;
    
    // Same: + operation
    x = x + 3;
    x2 = x2 + 3;

    // Difference
    // range of x: -2.1b -> 2.1b
    // ! range of x2: -2.1b -> 2.1b and NULL
    x2 = null;
    // x2 = x2 + 3; // java.lang NullPointerException

    // 
    byte b1 = 4;
    Byte b2 = 4;

    //
    short s1 = 5;
    Short s2 = 5;

    //
    long l1 = 6L;
    // ! Java does not allow multi conversion
    // long 12 = 6; // 6 (int) -> (long) -> (long)
    Long l2 = 6L; // 6 (long) -> long

    //
    float f1 = 9.5f;
    Float f2 = 9.5f;

    //
    double d1 = 5.5;
    Double d2 = 5.5;

    //
    char c1 = 'c';
    Character c2 = 'c'; // auto-box

    System.out.println(c1 + 2); // 101
    System.out.println(c2 + 2); // 101

    //
    boolean b11 = true;
    Boolean b12 = true; // auto-box

    // auto-box
    int x10 = 10;
    Integer x20 = x10; // auto-box
    
    // ! Never use >, <, >=, <=, == for Wrapper Class
    System.out.println(x20.equals(10)); // true
    System.out.println(x20.compareTo(10)); // 0
    System.out.println(x20.compareTo(8)); // 1
    System.out.println(x20.compareTo(12)); // -1
    
    // ! Works, but don't use it.
    System.out.println(x20 > 8); // true
    System.out.println(x20 > 12); // false
    
    // ! OK to use +, -, *, / for Integer

    if (x20.compareTo(6) > 0) {
      System.out.println("x20 > 6.");
    }

    int x30 = x20; // un-box (auto)
    System.out.println(x30); / 10
  }
  
}
