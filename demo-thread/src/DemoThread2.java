import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoThread2 {
  public static void main(String[] args) {
    // ! ArrayList is not Thread-safe, means that all of its methods are not thread-safe
    // List<Integer> integers = new ArrayList<>();
    List<Integer> integers = new ArrayList<>(); // ! Vector is a synchronized version of ArrayList

    // task loop i 0 - 99999, add i into ArrayList
    Runnable addIntegers = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100_000; i++) {
          // ! add() is not thread-safe
          integers.add(i);
        }
      }
    };

    long before = System.currentTimeMillis();
    Thread t1 = new Thread(addIntegers);
    Thread t2 = new Thread(addIntegers);
    try {
      t1.start(); 
      t2.start();
      t1.join();
      t2.join();
    } catch (InterruptedException e) {

    }
    long after = System.currentTimeMillis();

    System.out.println(integers.size());
    System.out.println("time used=" + (after - before)); // 13 ms
    // < 200_000

  }
}