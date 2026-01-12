// ! Parent Class: Class or Abstract Class
// 1. Human has no abstract method
public class Superman extends Human implements Flyable {
  // ! compile time confirmed the object can fly.

  // abstract fly()
  static {
    System.out.println("Superman Static Block...");
  }

  public Superman(String name) {
    super(name);
    System.out.println("Superman Constructor...");
  }

  // compile time OK
  @Override
  public void fly() {
    System.out.println(Person.SUPERMAN_FLY_SPEED);
  }

  // @Override
  // public void run() {

  // }

  public static void main(String[] args) {
    // ! JVM -> static block execution -> main()
    new Superman("Ken").run();
    new Superman("Steven").run();
  }

}