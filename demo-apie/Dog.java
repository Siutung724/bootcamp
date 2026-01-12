// ! Child Class
// 1. Child Class Constructor always calling parent constructor

import java.util.Objects;

public class Dog extends Animal {

  // Constructor (name, age)
  public Dog() {
    // super(); // calling parent empty constructor
  }

  public Dog(String name, int age) {
    // super(); // calling parent empty constructor
    super(name, age); // calling another constructor
  }

  // ! implicitly inherit parent's all instance methods
  @Override // ! check if the parent has this method
  public String getName() {
    System.out.println("Dog getName...");
    // ! super
    return super.getName();
  }

  // sound()
  // eat()
  @Override
  public void eat() {
    System.out.println("Dog is eating ..");
  }

  // this vs o
  @Override
  public boolean equals(Object o) {
    // Step 1:
    if (o == this) // same java object in memory
      return true;
    // Step 2:
    if (!(o instanceof Dog))
      return false;
    Dog dog = (Dog) o; // no risk after instanceOf
    return dog.getName().equals(super.getName())
        && dog.getAge() == super.getAge();
  }

  @Override
  public int hashCode() {
    // ! generate an int value based on given value(s)
    return Objects.hash(super.getName(), super.getAge());
  }

  @Override
  public String toString() {
    return "Dog(" //
      + super.toString() //
      + ")";
  }

  public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.setName("John");
    d1.setAge(4);
    System.out.println(d1.getName()); // John

    // Cat
    Cat c1 = new Cat();
    c1.setAge(3);
    c1.setHair("RED");
    c1.setName("Jenny");
    System.out.println(c1.getName());
    System.out.println(c1.getAge());
    System.out.println(c1.getHair());

    // Dog
    Dog d2 = new Dog();
    d2.setName("Peter");
    d2.setAge(7);
    System.out.println(d1.getName()); // John
    System.out.println(d2.getName()); // Peter
    d2.eat(); // Dog is eating ..
    c1.eat(); // Animal eat ...

    // new Animal();
    Dog d3 = new Dog("Steven", 2);
    System.out.println(d3.getName()); // Steven

  }
}