import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height, weight
  private double height;
  private double weight;

  // bmi = weight / height^2 (Weight (kg) / Height (m)²)

    // Healthy BMI range: 18.5 kg/m2 - 25 kg/m2
    // Healthy weight for the height: 59.9 kg - 81 kg
    // BMI Prime: 0.8
    // Ponderal Index: 11.1 kg/m3

      public String bodyIndex() {
    double bmi = this.bmi();
    if (bmi < 18.5) {
      return "Under Weight";
    } else if (bmi < 25.0) {
      return "Normal Weight";
    } else if (bmi < 30.0) {
      return "Over Weight";
    } else if (bmi < 35.0) {
      return "Obese Type I";
    } else if (bmi < 40.0) {
      return "Obese Type II";
    } else {
      return "Obese Type III";
    }
  }
    public double bmi() {
      return BigDecimal.valueOf(this.weight) //
      .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)) //
        RoundingMode.HALF_UP)
      .doubleValue();
    }
  
  public Person() {
  }
  // ! Void -> No return
    public void setHeight(double h) {
      this.height = h;
    }
    public double getHeight() {
      return this.height;
    }
    public void setWeight(double w) {
      this.weight = w;
    }
    public double getWeight() {
      return this.weight;
    }
  

  public static void main(String[] args) {
    Person p1 = new Person(); // height, weight
    p1.setHeight(1.73);
    p1.setWeight(60);
    System.out.println(p1.getHeight()); // 1.73
    System.out.println(p1.getWeight()); // 60.0

    Person[] persons = new Person[2];
    persons[0] = new Person();
    persons[1] = p1;

    System.out.println(persons[0].getHeight()); // 0.0
    System.out.println(persons[1].getHeight()); // 1.73
    System.out.println(p1.getHeight()); // 1.73

    persons[1] = p2.setWeight[60];
    persons[1] = p2.setHeight[1.73];
    System.out.println(p2.getWeight()); / 60

    }

    }
  }
  