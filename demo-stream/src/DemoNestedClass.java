// ! Outer Class
public class DemoNestedClass {
  private int x;

  // public int sum() {
  //   return this.x + y;
  // }

  public void setX(int x) {
    this.x = x;
  }
  
  // ! Nested Static class
  public static class Fruit2 {

  }

  // ! Inner Class
  public class Fruit {
    private int y;
    
    public Fruit(int y) {
      this.y = y;
    }

    public int sum() {
      return this.y + x;
    }
  }

  public static void main(String[] args) {
    Fruit2 fruit2 = new DemoNestedClass.Fruit2();

    DemoNestedClass d1 = new DemoNestedClass();
    d1.setX(10);
    Fruit fruit = d1.new Fruit(10);
    Fruit fruit3 = d1.new Fruit(5);
    Fruit fruit4 = d1.new Fruit(3);
    System.out.println(fruit.sum()); // 20
    System.out.println(fruit3.sum()); // 15
    System.out.println(fruit4.sum()); // 13
    d1.setX(20);
    System.out.println(fruit.sum()); // 30
    System.out.println(fruit3.sum()); // 25
    System.out.println(fruit4.sum()); // 23

    
  }
}