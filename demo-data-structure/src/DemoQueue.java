import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    // PriorityQueue -> Queue
    // ArrayDeque -> Deque
    // LinkedList -> Deque
    // ArrayDeque

    // ! We have only one object ArrayDeque
    // ! But we have 4 different object references
    ArrayDeque<String> names = new ArrayDeque<>();
    Collection<String> namesCollection = names; // ! hiding
    Queue<String> namesQueue = names; // ! hiding
    Deque<String> namesDeque = names;

    // What are the difference?
    namesDeque.poll();
    namesDeque.push("John");
    namesDeque.add("John");
    namesDeque.pollLast();
    namesDeque.pollFirst();

    namesQueue.poll();
    namesQueue.add("Sally");
    // namesQueue.push("John");
    // namesQueue.pollLast();
    // namesQueue.pollFirst();

    namesCollection.add("Leo");
    // namesCollection.poll();
    // namesCollection.push("John");
    // namesCollection.pollLast();
    // namesCollection.pollFirst();

    // Queue
    Queue<Student> studentQueue = new LinkedList<>(); // ! 90% scenario -> LinkedList for Queue
    studentQueue.add(new Student("Leo", 50)); // add to tail (addLast)
    studentQueue.add(new Student("Sally", 10));
    studentQueue.add(new Student("Peter", 99));

    // ! look up the first element
    System.out.println(studentQueue.peek().getName()); // Leo
    System.out.println(studentQueue.peek().getName()); // Leo

    Student queueHead = studentQueue.poll(); // remove first
    System.out.println(queueHead.getName()); // Leo

    System.out.println(studentQueue.peek().getName()); // Sally

    // poll() -> pick the head
    // add() -> add to tail

    // Queue<String>
    // "apple", "orange", "kiwi", "banana"

    Queue<String> fruitQueue = new LinkedList<>();
    fruitQueue.add("apple");
    fruitQueue.add("orange");
    fruitQueue.add("kiwi");
    fruitQueue.add("banana");

    System.out.println(fruitQueue.contains("orange")); // true
    System.out.println(fruitQueue.remove("kiwi")); // loop
    System.out.println(fruitQueue.size()); // 4
    System.out.println(fruitQueue); // [apple, orange, banana]

    // ! Queue Loop -> Consume (First IN First OUT)
    while(!fruitQueue.isEmpty()) {
      String fruit = fruitQueue.poll();
      // do something for the fruit...
      System.out.println(fruit);
    }

    // fruitQueue.get(2);

  }
}