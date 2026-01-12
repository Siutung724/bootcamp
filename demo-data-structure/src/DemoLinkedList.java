import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class DemoLinkedList {
  public static void main(String[] args) {

    // Java LinkedList: Double LinkedList

    LinkedList<String> names = new LinkedList<>();
    names.add("John");
    names.add("Sally");
    names.add("Leo");

    System.out.println(names.size());
    names.remove("John");
    System.out.println(names); // [Sally, Leo]
    System.out.println(names.contains("Sally"));
    System.out.println(names.isEmpty());
    System.out.println(names.size());

    // ! Java: ArrayList LinkedList
    // add, remove, size, isEmpty, contains

    // get(index)
    System.out.println(names.get(1)); // Leo
    // ! ArrayList.get() -> performance good -> O(1)
    // ! LinkedList.get() -> performance not good -> O(n)

    // Polymorphism
    String[] rawEmails = new String[] {"abc@gmail.com", "def@gmail.com"};
    List<String> emails = new LinkedList<>();
    for (String e : rawEmails) {
      emails.add(e);
    }

    emails = new LinkedList<>();
    emails.add("tom@gmail.com");

    emails = new Vector<>();
    emails = new Stack<>();

    // Polymorphism
    Set<Integer> integers = new HashSet<>();
    integers.add(45);
    integers.add(90);
    integers.add(45);
    System.out.println(integers.size()); // 2



  }
}