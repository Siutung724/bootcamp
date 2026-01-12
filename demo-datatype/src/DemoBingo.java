import java.util.Random;
import java.util.Scanner;

public class DemoBingo {
  public static void main(String[] args) {
    System.out.println(new Random().nextInt(3)); // 0 - 2

    // 1-100 (random number)
    int bingo = new Random().nextInt(100) + 1; // (0 - 99) + 1 -> 1 - 100
    try (
      // random: 73
        // Version 1: One User
        // 0. Ask QUestion: Please input a number between x and y:
        // 1. compare user input (from scanner) to the random number
        // 2. if same, end game.
        // 3. if not same, update the range for selection
         // for example: 
         // Round 1: user picks 69 (new range: 70 - 100)
         // ROund 2: user picks 90 (new range: 70 - 89)
    Scanner scanner = new Scanner(System.in)) {
      int userInput = -1;
       int min = 1;
       int max = 100;
      while (userInput != bingo) {
        System.out.println("Please input a number between " + min + " and " + max + ":" );
        userInput = scanner.nextInt();
        if (userInput < min || userInput > max){
          continue; // skip the rest
        }
        if (userInput < bingo) {
        min = userInput + 1;
        } else if (userInput > bingo) {
          max = userInput - 1;
        }
     }
          System.out.println("Bingo, number=" + bingo);
       // ...
      }
    }

  }
  

