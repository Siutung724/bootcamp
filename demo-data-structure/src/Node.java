public class Node {
  private Node next;
  private String name;

  public Node(String name) {
    this.name = name;
  }

  // setNext
  public void setNext(Node next) {
    this.next = next;
  }

  // getter
  public Node next() {
    return this.next;
  }

  public String getName() {
    return this.name;
  }

}