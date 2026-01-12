import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread {
  // ! int -> non Thread-safe
  // ! Primitive, ArrayList, LinkedList, HashSet, HashMap, Array, Wrapper Class
  private int x;


  // ! AtomicInteger is one of Thread-safe solution
  // private AtomicInteger x = new AtomicInteger(0);
  private final Object lock = new Object();

  public int getX() {
    return this.x;
  }

  // ! synchronized method supports multi-threading
  // public synchronized void addOne() {
  public void addOne() {
    System.out.println("before=" + this.x); // read 2ms
    synchronized (lock) {
      this.x++; // read and write 1ms
      int score = this.x * 10 / 3;
    }
    // this.x.getAndIncrement();
    
    // store score
    System.out.println("after=" + x); // read 2ms
  }

  public static void main(String[] args) {
    // main thread (worker 0)

    DemoThread box = new DemoThread();
    // System.out.println(box.getX()); // 0

    // Task
    // anonymous class -> define and create the object at Runtime
    Runnable addOneTask = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100_000; i++) {
          box.addOne();
        }
      }
    };

    Thread t1 = new Thread(addOneTask); // worker 1
    Thread t2 = new Thread(addOneTask); // worker 2

    // ! main thread tell t1 to start work
    try {
      t1.start(); // start() -> task.run()
      t2.start(); // start() -> task.run()
      // ! Concept: No one knows which threads is faster for execution
      // ! Concept: Thread-safe
      t1.join(); // main thread wait for thread t1 come back. (x become 100_000 now)
      t2.join(); // main thread wait for thread t2 come back.
    } catch (InterruptedException e) {

    }

    // ! Java by default, main thread won't wait for other threads come back
    System.out.println(box.getX()); // < 200000
  }
}