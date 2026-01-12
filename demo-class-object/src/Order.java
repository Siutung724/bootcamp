public class Order {
  private int id;
  private Item[] items;

  // ! give up empty constructor
  public Order(int id) {
    this.id = id;
    this.items = new Item(0);
  }

  public void add(Item newItem){
    Item[] newItems = new Item[this,items.length + 1];
    for (int i = 0; i < this.items.length; i++){
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = newItem;
    this.items = newItems;
  }

  public int getId() {
    return this.id;

  }
  public static void main(String[] args) {
    Order o1 = new Order(1);
    Order o2 = new Order(2);
    Customer c1 = new Customer();
    c1.add(o1);
    c1.add(o2);
    System.out.println(c1.getOrder(1).getId());
  }

  public long amount() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'amount'");
  }
}
