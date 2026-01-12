class OrderId {
  public OrderId(String id) {
  }
}

public class Order2 {
  private OrderId[] orderIds;

  public Order2() {
    this.orderIds = new OrderId[0];
  }
  public void add(OrderId newOrderId) {
    OrderId[] newOrderIds = new OrderId[this.orderIds.length + 1];
    for (int i = 0; i < this.orderIds.length; i++){
      newOrderIds[i] = this.orderIds[i];
    }
    newOrderIds[newOrderIds.length - 1] = newOrderId;
    this.orderIds = newOrderIds;
  }

public static void main(String[] args) {
    Order2 order = new Order2();           // 創造一本訂單簿
    
    order.add(new OrderId("A001"));
    order.add(new OrderId("B002"));
    order.add(new OrderId("C003"));
    
    // 印出所有訂單
    for (OrderId id : order.orderIds) {
        System.out.println(id);
    }
}
}
