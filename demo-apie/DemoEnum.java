public class DemoEnum {
  
  public static void main(String[] args) {
    Ball b1 = Ball.ofRed();
    Ball b2 = Ball.ofRed();

    // ! Use "==" to check enum value
    if (b1.getColor() == Color.RED) {
      System.out.println("Ball b1 is RED.");
    }

    System.out.println(b1.equals(b2)); // false
  }
}