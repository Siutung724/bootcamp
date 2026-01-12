public class DemoObject {
  public static void main(String[] args) {
    // Object.class (Memory -> Java Object)

    // String.class ("John" -> "John")
    // String.class author override equals()

    String s = "hello";
    System.out.println(s.equals("hello")); // true

    Dog d1 = new Dog("Kenny", 1);
    Dog d2 = new Dog("Kenny", 1);
    System.out.println(d1.equals(d2)); // false (before override)
    // ! All Java Objects implicitly extends Object.class
    
    // toString(), equals(), hashCode()
    // ! before override (Java Object in Memory)
    System.out.println(d1.toString()); // Dog@4e25154f
    System.out.println(d1.hashCode()); // 1311053135
    System.out.println(d1.hashCode() == d2.hashCode()); // false (before override)

    // ! after override
    System.out.println(d1.equals(d2)); // true (after override)
    System.out.println(d1.hashCode() == d2.hashCode()); // true

    System.out.println(d1); // Dog(Animal(name=Kenny,age=1))
  }
}