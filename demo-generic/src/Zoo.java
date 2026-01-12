import java.util.List;

// ! Control the range of Type for the object.
public class Zoo<T extends Animal, U extends Worker> {
  private List<T> animals; // Tiger, Panda extends Animal
  private List<U> workers; // Keeper, Cleaner extends Worker

  // add
  // add
  

  public static void main(String[] args) {
    Zoo<Tiger, Keeper> zoo1 = new Zoo<>();
    // zoo1 can add tiger only

    Zoo<Panda, Cleaner> zoo3 = new Zoo<>();
    // zoo3 can add Panda only

    Zoo<Animal, Worker> zoo2 = new Zoo<>();
    // zoo3 can add Tiger and Panda
  }
}