import java.util.List;
import java.util.Optional;

public class DemoOptional2 {
  
  private static List<String> fruitDatabase =
      List.of("apple", "banana", "kiwi", "watermelon", "orange");

  // searchFruit -> return Optional
  public static Optional<String> findFirstFruit(char targetChar) {
    return fruitDatabase.stream() //
        .filter(e -> e.contains(String.valueOf(targetChar))) //
        .findFirst(); // ! return Optional Object
  }

  public static void main(String[] args) {
    // Usage
    findFirstFruit('n').ifPresent(e -> {
      System.out.println(e); // banana
    });

    
  }
}