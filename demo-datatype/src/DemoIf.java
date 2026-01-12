public class DemoIf {
  public static void main(String[]args){
    int x = 10;
    if (x % 2 == 1){
      System.out.println("this is an odd number.");
    } else {
      System.out.println("this is an even number."); 
    }

    if (x > 0){
      System.out.println("this is a positive number");
    }

    if (x < 0){
      System.out.println("this is a negetive number");
    }

    // if x > 3 and even number, money + 10
    // otherwise, money + 5
    int money = 0;
    if (x > 3 && x % 2 == 0){
      money += 10;
    } else {
      money += 5;
    }
      System.out.println(money); // 10


      // Exampe 1
      // Char gender = 'M';
      boolean isFemale = false;
      boolean isMale = true;
      boolean isSmoker = true;
      int age = 66;
      System.out.println(isMale); // true


      int precentage = 0;
      if (age >= 40){
        if (isFemale)
          precentage += 20;
        }
     if (age >= 70){
          precentage += 40;
        }
      if (isSmoker){
        if (isFemale){
          precentage += 5;
        } else {
      precentage += 50;

      }
      
    }
    System.out.println(precentage); // 50
    double basePremium = 100.0;
    double premium = basePremium * (1 + precentage / 100.0);
    System.out.println(premium); //150.0

      // premium base $100
      // if female, above 40, 20% more premium
      // if male, smoker, 50% more premium
      // if female, smoker, 5% more premium
      // female / male, age >= 70, 40% premium
      

    // ! Male age69 smoker -> 50%
    // ! Male age70 smoker -> 90%
    // ! Male age69 non-smoker -> 0
    // ! Male age70 non-smoker -> 40%
    // ! Female age39 smoker -> 5%
    // ! Female age45 smoker -> 25%
    // ! Female age75 smoker -> 65%
    // ! Female age39 non-smoker -> 0%
    // ! Female age45 non-smoker -> 20%
    // ! Female age75 non-smoker -> 60%

    // Example 2
    // else if

    // u divided by 3 -> money +3
    // u divided by 4 -> money +4
    // u divided by 5 -> money +5
    money = 100;
    int u = 135;

    if (u % 3 == 0) {
            money += 3;
        } 
        else if (u % 4 == 0) {
            money += 4;
        } 
        else if (u % 5 == 0) {
            money += 5;
        }

        System.out.println("Final money: " + money);


        // Example 3
        int score = 75;
        char grade ='F';
        // >= 90 -> Grade A
        // >= 80 and < 90 -> Grade B
        // >= 70 and < 80 -> Grade C
        // otherwise Grade F

        if (score >= 90) {
            grade = 'A';
        } 
        else if (score >= 80) {
            grade = 'B';
        } 
        else if (score >= 70) {
            grade = 'C';
        } 
        System.out.println(grade);

        // String method
        String name = "John";
        if ("John".equals(name))
        System.out.println("He is John");

        // CharAt
        if (name.charAt(0) == 'J'){
          System.out.println("name starts with J");
        }
        if (name.startsWith("J")){
          System.out.println("Name start with J.");
        }
        if (name.contains("J")){
          System.out.println("The name contains J.");
        }
        if (name.length() >= 3){
          System.out.println("The name is too long.");
        }

        // 2. switch
        // grade A -> 100
        // grade B -> 50
        // grade C -> 20
        // otherwise -> No money received
        money = 0;
        grade = 'B';
        switch(grade) {
          case 'A':
            money += 100;
            break;
            case 'B':
            money += 50;
            break;
            case 'C':
            money += 20;
            break;
          default: // else
        }
        System.out.println(money); // 50

        switch (name){
          case "John":
          System.out.println("He is John");
          break;
           case "Steven":
          System.out.println("He is Steven");
          break;
          default:
           break;
        }

        int pow = 3;
        int base = 2;
        switch (pow - 1) {
          case 3:
          base *= base;
          case 2:
          base *= base;
          case 1:
          base *= base;
          break;
          default:
        }
    }
}


