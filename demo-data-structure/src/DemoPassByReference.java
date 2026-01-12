import java.util.ArrayList;
import java.util.Arrays;

public class DemoPassByReference {
  public static void main(String[] args) {
    System.out.println(sum(10, 3)); // 103

    int x = 15;
    System.out.println(sum(x, 6)); // 106
    System.out.println(x); // 15

    // ! Array (Pass by reference)
    int[] arr = new int[] {-9, -100, 73};
    addOne(arr);
    System.out.println(Arrays.toString(arr));

    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Sue"));

    doubleTheCats(cats); 
    System.out.println(cats); // Sue
  }

  // ! Pass By Value: All Primitives, String, All Wrapper Classes
  // ! Pass By Reference: Array, All Other Classes

  // ! Primitive
  public static int sum(int x, int y) { // ! Pass by value (A copy of value)
    x = 100;
    return x + y;
  }

  public static void addOne(int[] arr) { // ! Pass by reference
    if (arr == null)
      return;
    for (int i = 0; i < arr.length; i++) {
      arr[i]++;
    }
  }

  // ! variable
  public static void doubleTheCats(ArrayList<Cat> cats) { // ! Pass By Reference
    ArrayList<Cat> doubleCats = new ArrayList<>();
    for (Cat cat : cats) { // lock arraylist
      doubleCats.add(cat);
      doubleCats.add(cat);
    }
    // System.out.println("double=" + doubleCats);
    cats = doubleCats; // ! Problem
  }
}