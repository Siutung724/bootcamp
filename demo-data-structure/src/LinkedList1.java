public class LinkedList1 {
  private Node head;

  public LinkedList1() {

  }

  public boolean add(String name) { //
    Node newNode = new Node(name);
    if (this.head == null) {
      this.head = newNode;
      return true;
    }
    Node tempHead = head;
    while (tempHead.next() != null) {
      tempHead = tempHead.next();
    }
    tempHead.setNext(newNode);
    return true;
  }

  public int size() {
    int count = 0;
    Node tempHead = this.head;
    while (tempHead != null) {
      count++;
      tempHead = tempHead.next();
    }
    return count;
  }

  public boolean isEmpty() {
    return this.head == null;
  }

  public boolean contains(String name) {
    Node tempHead = this.head;
    while (tempHead != null) {
      if (tempHead.getName().equals(name)) {
        return true;
      }
      tempHead = tempHead.next();
    }
    return false;
  }

  // Remove First
  public String remove(String target) {
    if (this.head == null)
      return null; // 1
    Node tempHead = this.head;
    if (tempHead.getName().equals(target)) {
      this.head = tempHead.next();
      return target; // 2
    }
    while (tempHead.next() != null) {
      if (tempHead.next().getName().equals(target)) {
        Node nextNode = tempHead.next();
        tempHead.setNext(tempHead.next().next());
        return nextNode.getName(); // 3
      }
      tempHead = tempHead.next();
    }
    return null; // 4
  }

  public static void main(String[] args) {
    LinkedList1 lt1 = new LinkedList1();
    lt1.add("John");
    lt1.add("Sally");
    lt1.add("Leo");
    System.out.println(lt1.size()); // 3
    System.out.println(lt1.contains("Sally")); // true
    System.out.println(lt1.contains("Steven")); // false
    System.out.println(lt1.isEmpty()); // false

    System.out.println(lt1.remove("John"));
     System.out.println(lt1.size()); // 2

    System.out.println(lt1.remove("Sally")); // Sally
    System.out.println(lt1.size()); // 2
    System.out.println(lt1.remove("Leo")); // Leo
    System.out.println(lt1.size()); // 0

    System.out.println(lt1.remove("Oscar")); // null
    System.out.println(lt1.size()); // 0

    System.out.println(lt1.remove("John")); // null
    System.out.println(lt1.size()); // 0
  }
}