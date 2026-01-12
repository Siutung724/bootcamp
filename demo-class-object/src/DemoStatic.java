public class DemoStatic {
  // 1. static variable
  // 2. static final variable (cannot be modified)
  // 3. instance variable (object variable)
  // 4. final variable
  
  private static final String DEFAULT_NAME = "John";
  
  private static final int SECONDS_IN_MINUTE = 60;
  private static idCounter = 0;
  private final String name;

  public DemoStatic() {
    this.name = DEFAULT_NAME;
  }

  // ! Input parameters -> produce output -> static method
  public static int sum(int x, int y){
    return x + y;
  }

  // ! Input parameters -> cannot produce output -> must be instance method
  public String getName(String s) {
    return this.name + s;
  }

  public static void main(String[] args) {
    DemoStatic d1 = new DemoStatic();
    System.out.println(d1.getName("!!!")); // John
  }
}