public class Person extends Human {
  private static final Superman leader;
  public static final int SUPERMAN_FLY_SPEED;

  public Person(String name) {
    super(name);
  }

  // ! Static Block
  static {
    System.out.println("Person Static Block...");
    SUPERMAN_FLY_SPEED = 100;
    leader = new Superman("Ben");
  }

  public static void main(String[] args) {
    new Person("Oscar");
    new Superman("Tim");
    // System.out.println(Person.SUPERMAN_FLY_SPEED); // 100
    // System.out.println(Person.leader.getName()); // Ben
  }
}