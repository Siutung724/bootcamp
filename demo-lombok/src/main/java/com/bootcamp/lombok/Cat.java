package com.bootcamp.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Cat {
  private String name;
  private int age;

  // constructor
  // getter, setter
  // toString, equals, hashCode

  public static void main(String[] args) {
    Cat c1 = new Cat();
    System.out.println(c1.getName() == null); // true
    System.out.println(c1.getAge() == 0); // true

    Cat c2 = new Cat("John", 3);
    System.out.println(c2.getName().equals("John")); // true
    System.out.println(c2.getAge() == 3); // true

    c2.setAge(4);
    System.out.println(c2.getAge() == 4); // true
    c2.setName("Peter");
    System.out.println(c2.getName().equals("Peter")); // true

    Cat c3 = new Cat("Peter", 4);
    System.out.println(c2.equals(c3)); // true
    System.out.println(c2.hashCode() == c3.hashCode()); // true

    System.out.println(c3);
    System.out.println(c2);
  }
}