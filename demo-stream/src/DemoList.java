import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
  public static void main(String[] args) {
    // ! Approaches to create ArrayList Object
    List<String> names4 = new ArrayList<>(List.of("John", "Peter"));

    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Peter");
    // read
    System.out.println(names.get(0)); // John
    // add
    names.add("Sally");
    // update
    names.set(1, "Steven");

    List<String> names2 = List.of("John", "Peter");
    System.out.println(names2.get(0)); // John
    // names2.add("Sally"); // ! CANNOT ADD
    // names2.set(1, "Steven"); // ! CANNOT UPDATE

    System.out.println(names2.contains("Peter"));

    List<String> names3 = Arrays.asList("John", "Peter");
    System.out.println(names3.get(0)); // John
    // names3.add("Sally"); // ! CANNOT ADD
    names3.set(1, "Steven");


    // 1. read element
    // 2. add element (Sally)
    // 3. update element (Peter -> Steven)

    // ! Stream -> create a completely new Structure to return
    // List.of() -> stream -> collect -> ArrayList()
  }
}