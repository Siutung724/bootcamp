public class Cat {
  // ! Attributes
  private String name; 
  private int age; // >= 18 Adult
  // private String color;

  // Implicitly exist constructor
  // ! Constructor: The process of building the object
  public Cat() {

  }
    public boolean isAdult() {
      return this.age >= 18;
    }

  // ! instance methods ()
  public void setName(String x) {
    this.name = x; // this.name = my name
  }

  public String getName() {
    return this.name; 
  }

  // getAge, setAge

  public void setAge(int age) {
    this.age = age; // this.age = my age
  }
  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    // ! "new" -> calling Constructor "Cat()" -> create Cat Oject
    Cat c1 = new Cat(); // name, age
    c1.setName("John");
    System.out.println(c1.getName()); // John
  }
  public static void main(int[] args) {
    c1.setAge(18);
    System.out.println(c1.getAge());
  }
    Cat c10 = c1;
    c10.setName("Peter");
    System.out.println(c1.getName()); // Peter
    System.out.println(c10.getName()); // Peter

    Cat c2 = new Cat(); // name, age
    // set, get
    Cat c3 = new Cat();
    // set, get

    String s1 = new String();

    // Excel row (new data) x column (phone, email, name)
    // OOP: (c1.name, c1.age) -> simila to one row in excel
    // OOp: ()

    if (c2.getAge() >= 18) {
    }
    if (c2.isAdult()){
      
    }
  }
}
