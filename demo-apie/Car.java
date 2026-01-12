// ! Coding Pattern: singleton
public class Car {
  // memory -> ONE Car Object
  public static final Car INSTANCE = new Car("Model Y");

  private String model;
  // ! if you want the model cannot be modified, "final" String

  private Car(String model) {
    this.model = model;
  }

  public void setModel(String model) {
    this.model = model;
  } 

  public String getModel() {
    return this.model;
  }

  public static void main(String[] args) {
    Car c1 = Car.INSTANCE;
    System.out.println(c1.getModel()); // Model Y
    c1.setModel("Model 3");
    System.out.println(c1.getModel()); // Model 3
  }
  
}