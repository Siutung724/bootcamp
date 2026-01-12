public class Item {
  private double price;
  private double quantity;


  public Item(double price, double quantity){
    this.price = price;
    this.quantity = quantity;
  }

  public double getPrice(){
    return this.price;
  }
  public double getQuantity(){
    return this.quantity;
  }

  public static void main(String[] args) {
    // 99.9 x 2
    Item rice = new Item(99.9, 2);
    // 10.5 x 6
    Item icecream = new Item(10.5, 6);
    // order1.amount()
    Order o1 = new Order(1);
    o1.add(rice);
    o1.add(icecream);

    // c1.getOrderAmount(1)

  }
  
}
