public class JavaQuest2 {
public static void main(String[] args) {
    
    // add condition to print "a is between 0 and 8"
    // how about a > 9?
    int a = 10;
    if (a == 9) {
      System.out.println("a is equals to 9");
    } 
    else if (a >= 0 && a <= 8) {  // ← 這裡！a 在 0 到 8 之間（包含 0 和 8）
      System.out.println("a is between 0 and 8");
    } 
    else if (a > 9) {             // ← 這裡！a 大於 9
      System.out.println("a > 9");
    }

    // Take a character and check whether it is:
    // 1. Vowel (a, e, i, o, u – both lowercase and uppercase)
    // 2. Consonant
    // 3. Not an alphabet
    char ch = 'i';
    char lowerCh = Character.toLowerCase(ch);
    char upperCh = Character.toUpperCase(ch);
    if (Character.isLetter(ch)){
      if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u'){
        System.out.println(ch + " is a Vowel");
      }
      if (upperCh == 'a' || upperCh == 'e' || upperCh == 'i' || upperCh == 'o' || upperCh == 'u'){
        System.out.println(ch + " is a Vowel"); // i is a Vowel
      } else {
        System.out.println(ch + " is a consonant"); // i is a consonant
      }
      } else {
        System.out.println(ch + " is a alphabet"); 
      }

    // Take salary and years of experience, then calculate bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus
    // Also, if salary > 100000, reduce bonus by half
    int exp = 12;
    int salary = 110_000;
      


    }

}

