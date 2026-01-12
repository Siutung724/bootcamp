import java.util.HashMap;
import java.util.LinkedList;

public class DemoTypeInference {
  // ! CANNOT
  // private var name = "John";

  public static void main(String[] args) {
    String name = "John";
    // name = 123;

    var email = "john@gmail.com";
    System.out.println(email instanceof String); // true
    // email = 123;

    var integers = new LinkedList<Integer>();
    integers.add(100);

    var fruitMap = new HashMap<String, String>();
    fruitMap.put("abc", "apple");

    var dog = new Dog();
    
    // ! CANNOT
    // var result = sum(10, 3);

    for (var n : integers) {
      System.out.println(n);
    }
  }

  // ! CANNOT
  // public static int sum(var x, var y) {
  // return x + y;
  // }

  // ! CANNOT
  // public static var sum(int x, int y) {
  // return x + y;
  // }

}