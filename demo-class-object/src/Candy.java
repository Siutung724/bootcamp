public class Candy {
  private String color; // "RED", "YELLOW", "BLUE"

  // ! Private constructor
  private Candy(String color) {
    this.color = color;
  }

  public static Candy ofRed() {
    return new Candy("RED");
  }

  public static Candy ofBlue() {
    return new Candy("RED");
  }

  public static Candy ofYellow() {
    return new Candy("YELLOW");
  }

}