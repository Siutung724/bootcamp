import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Person implements Comparable<Person> {
  private int age;
  private Occupation occupation;

  public Person(int age) {
    this.age = age;
  }

  public Person(int age, Occupation occupation) {
    this.age = age;
    this.occupation = occupation;
  }

  public int getAge() {
    return this.age;
  }

  public Occupation getOccupation() {
    return this.occupation;
  }

  @Override
  public int compareTo(Person person) {
    return this.age > person.getAge() ? -1 : 1;
  }

  @Override
  public String toString() {
    return "Person(" //
      + "occupation=" + this.occupation //
      + ",age=" + this.age //
      + ")";
  }

  public static enum Occupation {
    CLERK, PROMGRAMMER, POLICEMAN,;
  }

  public static void main(String[] args) {
    // sort from oldest to youngest
    List<Person> persons = new LinkedList<>();
    persons.add(new Person(80));
    persons.add(new Person(23));
    persons.add(new Person(90));
    persons.add(new Person(50));
    Collections.sort(persons);
    System.out.println(persons); // [Person(age=90), Person(age=80), Person(age=50), Person(age=23)]

    PriorityQueue<Person> personQueue = new PriorityQueue<>(persons);
    System.out.println(personQueue.poll()); // 90  compareTo() -> sorting
    System.out.println(personQueue.poll()); // 80
    personQueue.add(new Person(89));
    System.out.println(personQueue.poll()); // 89
    System.out.println(personQueue.poll()); // 50
    System.out.println(personQueue.poll()); // 23

    // ! 
    PriorityQueue<Person> personQueue2 = new PriorityQueue<>(new SortedByRule1());
    personQueue2.add(new Person(50, Person.Occupation.POLICEMAN));
    personQueue2.add(new Person(30, Person.Occupation.PROMGRAMMER));
    personQueue2.add(new Person(40, Person.Occupation.POLICEMAN));
    personQueue2.add(new Person(25, Person.Occupation.CLERK));
    personQueue2.add(new Person(35, Person.Occupation.PROMGRAMMER));
    personQueue2.add(new Person(45, Person.Occupation.POLICEMAN));
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());

  }
}