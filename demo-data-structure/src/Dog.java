// Dog[], Leader.java -> Dog[] dogs
public class Dog {
  private Dog dog; // next
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  public void setNext(Dog nextDog) {
    this.dog = nextDog;
  }
  public Dog getNext() {
    return this.dog;
  }
  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    Dog d1 = new Dog ("Peter");
    d1.setNext(new Dog("Sally"));
    d1.getNext().setNext(new Dog("Tommy"));

    System.out.println(d1.getNext().getNext().getName()); // Tommy

    // FInd the last Dog (LinkedList -> while)
    Dog head = d1;
    while (head != null) {
      System.out.println("dog=" + head.getName());
      head = head.getNext();
    }
  }
}
