import java.util.ArrayList;

public class DemoArrayList {
  public static void main(String[] args) {
    // ! Array Disadvantages:
    // 1. Fixed Length
    int[] arr = new int[3];

    // ! Data Structure -> array and linkedlist (memory)
    // ! High level Structure -> ArrayList
    ArrayList<String> names = new ArrayList<>(); // Constructor "ArrayList<>()"
    names.add("John"); // Theory: loop
    names.add("Steve"); // Theory: loop
    names.add(new String("Mary")); // Theory: loop
    names.add("Leo"); // Theory: loop
    names.add(new String("Mary")); // Theory: loop

    System.out.println(names); // ArrayList.toString()

    ArrayList<Integer> scores = new ArrayList<>();
    scores.add(83);
    scores.add(25);
    scores.add(100);
    System.out.println(scores);

    // 2. remove() (equals, remove the first element)
    names.remove(new String("Mary")); // remove() -> String.eqauls()
    System.out.println(names);

    names.remove(1); // array index

    // Class (name + score)
    // John 83
    // Steve 25
    // Mary 100
    Student s1 = new Student("John", 83);
    ArrayList<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(new Student("Steve", 25));
    students.add(new Student("Mary", 100));

    // 
    s1.setScore(90);
    System.out.println(students.get(0).getScore()); // 90

  }
}