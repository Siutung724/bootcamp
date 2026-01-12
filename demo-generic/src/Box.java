import java.math.BigDecimal;
import java.util.List;

// Line 4 to Line 22 -> object (The T describe the same thing)
// Static Method (Line 25) has NO relationship with Box<T>
public class Box<T> {
  private T value;

  public Box() {

  }

  public Box(T value) {
    this.value = value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public static <T extends Shape> double totalArea2(List<T> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    // ! We confirmed the type of T is <T extends Shape>
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }

  // ! When do we confirm the T?
  public static void main(String[] args) {
    // ! Compile Time -> confirm T
    Box<String> stringBox = new Box<>();
    // stringBox.setValue(1);
    stringBox.setValue("John");
    System.out.println(stringBox.getValue().charAt(0)); // J

    Box<Integer> integerBox = new Box<>();
    integerBox.setValue(100);
    System.out.println(integerBox.getValue().doubleValue()); // 100.0

    // ! compile time -> didn't confirm the type
    Box<Object> magicBox = new Box<>();
    magicBox.setValue(100);
    magicBox.setValue("John");
  }
}