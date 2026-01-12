import java.util.Arrays;

public class DemoArray2 {
  public static void main(String[] args) {
    // array -> for loop
    String name1 = "John";
    String name2 = "Cathy";
    String name3 = "Jenny";

    String [] students = new String[3];
    students[0] = name1; // ! students[0] is an address, pointing to object
    students[1] = name2;
    students[2] = name3;

    name1 = "Leo"; // ! change the address, point to "Leo"
    System.out.println(students[0]); // John
    System.out.println(students[1]); // Cathy
    System.out.println(students[3]); // Jenny

    
    // Algrorithm
    // 1. swap
    int a = 10;
    int b = 20;
    int c = a;
    a = b;
    b = c;
    System.out.println("a=" + a);
    System.out.println("b=" + b);

    // 2. Max / Min
    int[] scores = new int[] {23, 8, 97, 56};
    int max = scores [0];
    int min = scores [0];
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] > max) {
        max = scores [i]; 
      }
      if (scores[i] > min) {
        min = scores [i]; 
      }
    }
    System.out.println("max=" + max + ", min=" + min);

    // 3. Move the Max value to tail
      scores = new int[] {23, 100, 8, 97, 56};
      int backup = -1;
      for (int i = 0; i < scores.length - 1; i++){
        if (scores[i] > scores[i + 1]){
          backup = scores[i];
          scores[i] = scores[i + 1];
          scores[i + 1] = backup;
        }
      }
    System.out.println(scores[scores.length - 1]); // 100

    // 4. Algrorithm Bubble Sort
    // ! x, x, x, x, 100
    // ! x, x, x, 97, 100
    // ! x, x, 56, 97, 100
    // ! x, 23, 56, 97, 100
    // 8, 23, 56, 97, 100

    // 外層：跑幾輪
        for (int i = 0; i < scores.length - 1; i++) {
    // 內層：兩個兩個比
        for (int j = 0; j < scores.length - 1 - i; j++) {
       if (scores[j] > scores[j + 1]){
        backup = scores[j];
        scores[j] = scores[j + 1];
        scores[j + 1] = backup;
       }
      }
    }
    System.out.println(Arrays.toString(scores));  // (8, 23, 56, 97, 100)
  }
}





