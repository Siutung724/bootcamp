import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cat {
  private String name;

  public Cat(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Cat))
      return false;
    Cat cat = (Cat) o;
    return Objects.equals(this.name, cat.getName());
  }

  @Override
  public String toString() {
    return "Cat(" //
        + "name=" + this.name //
        + ")";
  }

  public static void main(String[] args) {
    // ArrayList of Cat
    ArrayList<Cat> cats = new ArrayList<>();
    // add, remove
    Cat c1 = new Cat("Nancy");
    cats.add(c1);
    cats.add(new Cat("Cathy"));
    //
    cats.remove(new Cat("Nancy")); // removed (after override eqauls)
    System.out.println(cats.size()); // 1
    cats.remove(c1); // not found
    System.out.println(cats.size()); // 1

    // ! Array has ordering.
    cats.add(new Cat("Peter")); // add Last
    cats.addFirst(new Cat("Jenny"));
    System.out.println(cats);

    cats.clear();
    System.out.println(cats); // []
    System.out.println(cats.size()); // 0

    // ! Loop + break
    if (cats.contains(new Cat("Peter"))) { // true
      System.out.println("contains Peter");
    } else {
      System.out.println("Peter is not here.");
    }

    // ! array.length
    if (cats.isEmpty()) { // false
      System.out.println("There is no cat..");
    } else {
      System.out.println(">= 1 cat.");
    }

    // Polymorphism
    List<Cat> catList = new ArrayList<>();
  

  }
}