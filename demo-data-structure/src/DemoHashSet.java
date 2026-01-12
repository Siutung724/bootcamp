import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    // Java Collection: List/ Set/ Queue
    // ! Set (Avoid duplicated)
    HashSet<String> names = new HashSet<>();
    names.add("Tommy"); // return true
    names.add("Jenny"); // return true
    names.add("Tommy"); // return false
    System.out.println(names.size()); // 2
    System.out.println(names); // [Jenny, Tommy]

    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(15);
    ages.add(30);
    ages.add(15);
    ages.add(45);

    // ! Avoid Duplicated element by adding one by one.
    HashSet<Integer> ageSet = new HashSet<>();
    for (Integer age : ages) {
      if (!ageSet.add(age)) { // ! Integer.eqauls() & hashCode()
        System.out.println("Duplicated element: " + age);
      } // ! performance? loop -> duplicate? break
    }
    System.out.println(ageSet);

    HashSet<Student> students = new HashSet<>();
    // John 80
    // Jenny 70
    // John 80
    students.add(new Student("John", 80)); // equals() and hashCode()
    students.add(new Student("Jenny", 70));
    students.add(new Student("John", 80));
    System.out.println(students.size()); // 2

    HashSet<Integer> age3 = new HashSet<>(ages); // constructor
    System.out.println(age3); // [45, 30, 15]

    // contains()
    if (age3.contains(45)) {
      System.out.println("Contains 45.");
    }
    // isEmpty()
    if (!age3.isEmpty()) {
      System.out.println("It is not empty");
    }
    // size()
    System.out.println(age3.size());
    // remove()
    // ! 
    age3.remove(30);

    HashSet<Integer> hs =  new HashSet<>();
    hs.add(14);
    hs.add(23);
    hs.add(49);
    hs.add(58);
    hs.add(100);
    hs.add(120);

    // ! HashSet -> No Ordering.
    System.out.println(hs); // [49, 100, 23, 120, 58, 14]

    for (Integer num : hs) {
      System.out.println(num);
    }
  }
}