import java.util.Random;
import java.util.Scanner;

public class DemoBingo2 {
  public static void main(String[] args) {
    

     // Version 2: Support User A & User B, show the winner.
     // "User A, please input a number between x and y:"
     // "User B wins!"

      Scanner scanner = new Scanner(System.in) {
       int userInput = -1;
       int min = 1;
       int max = 100;
       int round = 0;
       String user = ""; 
      while (userInput != bingo) {
        if (++round % 2 == 1) {
          user = "User A";
        } else {
          user = "User B";
        }
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
    
        // ! round % 2 == 1
        // ! -> true -> return "User A"
        // ! -> false -> return "User B"
        String winner = round % 2 == 1 ? "User A" : "User B"; //
        System.out.println(winner + "wins."); //
  }
}
