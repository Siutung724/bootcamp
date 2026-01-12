public class DemoLoop2 {
  public static void main(String[] args) {
    // print 3 hello 
    for (int i = 0; i < 3; i++){
     System.out.println("hello");
    }

    // print 1 - 10
    for (int i = 1; i <= 10; i++){ 
     System.out.println(i);
    }

    // name = "Mary, print every character of the name"
    String name = "Mary";
    for (int i = 0; i < name.length(); i++){ 
      System.out.println(name.charAt(i));
    }

    // principal = 1000.0, interest 3% per year, calculate the total amount after 3 years
    double principal = 1000.0;
    double rate = 3.0;
    int years = 3;

    for (double i = 0; i <= 1000; i++);

    // 1-29, sum up all odd numbers and sum up all even numbers seperately. Find the product of them
    int count = 0;
    for (int i = 0; i <= 29; i++);{
      if (i % 2 == 0){
        count++;
      }
    }
    for (int i = 1; i <= 29; i++);{
      if (i % 2 == 0){
        count++;
      }
    }

    // result -> "1/2/3/4/5"
    String result = "";
    for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                result = result + i;        // first number, no slash before
            } else {
                result = result + "/" + i;  // add slash + number
            }
        }
        System.out.println("Result: \"" + result + "\"");


    // given a string "llello", count the number of 'l'
    String str = "llelle";
    char target = 'l';

      for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("String: \"" + str + "\"");
        System.out.println("Number of '" + target + "' : " + count);


    // "Hello", count the number of capitial letter (upper case letter)
    String str = "Hello";
    int count = 0;

    for (int i = 0; i < str.length(); i++);{
    char ch = str.charAt(i);
    if (Character.isUpperCase(ch));{
      count++;
        System.out.println("String: \"" + str + "\"");
        System.out.println("Number of capital letters: " + count);
}
}
    // print 1 4 9 16 25 ... 100
    for (int i = 1; i <= 10; i++) {
            System.out.println(i * i);
        }


    // given a string "apple", count the number of character a, e, i, o, u
        String word = "apple";
        int vowelCount = 0;

        // Check every letter in the word
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            // Check if the letter is a, e, i, o, or u (small letters only)
            if (letter == 'a' || letter == 'e' || letter == 'i' || 
                letter == 'o' || letter == 'u') {
                vowelCount++;   // found one vowel → add 1
            }
        }
        System.out.println("Word: " + word);
        System.out.println("Number of vowels (a,e,i,o,u): " + vowelCount);
    }


    // given a string "hello", print "hello", "hell", "hel", "he", "h"
        String word = "hello";{

        // Start from full word and remove one letter from the end each time
        for (int i = word.length(); i > 0; i--) {
            System.out.println(word.substring(0, i));
        }
      }


    // Given Password = "abcd@1234XYZ"
    // Check if the password is valid. Result is boolean.
    // 1. Length >= 12
    // 2. With at least one capitial letter
    // 3. With at least one special character @#$!.
        {
        String password = "abcd@1234XYZ";

        boolean isValid = true;  // assume it's valid first

        // Rule 1: Length must be >= 12
        if (password.length() < 12) {
            isValid = false;
        }
      }
        // Rule 2: Must have at least one capital letter (A-Z)
        {
        boolean hasCapital = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                hasCapital = true;
                break;  // found one, no need to check more
            }
        }
        if (!hasCapital) {
            isValid = false;
        }
      }

        // Rule 3: Must have at least one special character from @ # $ ! .
        boolean hasSpecial = false;
        String specialChars = "@#$.!";{
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (specialChars.indexOf(c) != -1) {
                hasSpecial = true;
                break;
            }
        }
        if (!hasSpecial) {
            isValid = false;
        }
}
        // Final result
        System.out.println("Password: " + password);
        System.out.println("Is valid? " + isValid);
    }


    // Given a string s1 = "abc5uk20fs", move all numbers to another string.
    // s1 = "a,bc5u!k20fs" -> s2 = 520
    {
        String s1 = "abc5uk20fs";
        String s2 = "";  // This will hold only the numbers

        // Check every character in s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            // If the character is a digit (0 to 9), add it to s2
            if (ch >= '0' && ch <= '9') {
                s2 = s2 + ch;  // or s2 += ch;
            }
        }
        System.out.println("Original string: " + s1);
        System.out.println("Only numbers   : " + s2);
    }
  

    // Encrypt Password. "abcd" -> Algorithm: ASCII + 3 -> "defg"
{
        String password = "abcd";
        String encrypted = "";  // This will store the encrypted password

        // Go through each character in the password
        for (int i = 0; i < password.length(); i++) {
            char originalChar = password.charAt(i);     // get one letter
            char encryptedChar = (char)(originalChar + 3); // +3 in ASCII
            encrypted = encrypted + encryptedChar;      // add to result
        }

        System.out.println("Original  : " + password);
        System.out.println("Encrypted : " + encrypted);
    }
}
 String s10 = "HELLOXWORLD";
    // Find the index of 'X', -1 if not Found.
    // i.e. Use loop, not indexOf()

    // check if the number is prime
    int number = 47; // true


    // outer loop
    for (int i = 0; i < 3; i++) {
      // inner loop
      for (int j = 0; j < 3; j++) {
        System.out.println("i=" + i + ", j=" + j);
      }
    }

    // *
    // **
    // ***
    // ****
    int k = 4;

    for (int i = 1; i <= k; i++) {           // i 從 1 開始，到 4
    for (int j = 1; j <= i; j++) {       // 這一行只印 i 顆星星！
        System.out.print("*");           // 印星星（不換行）
    }
    System.out.println();                // 這一行印完後換行
}
      }
    

  }

  

