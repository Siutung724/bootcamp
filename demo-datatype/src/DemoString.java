public class DemoString {
  public static void main(String[]args){
    // "Hello" -> String value
    // s -> String variable
    String s = "Hello";

    // 'hello' -> not java
    // 'h' -> cannot assign char value into String variable
    // String s2 = 'h';

    String s2 = "Vincent Lau";

    // + operator
    s2 = s2 + "!!!";
    System.out.println(s2);

    // String? String?
    // Sring is not a primtive. It is a Class.

    int len = s.length();
    System.out.println(len); // 5

    s = "goodbye";
    System.out.println(s.length()); // 7

    // 2. charAt(), index starts with 0 (0 means the first position)
    char firstChar = s.charAt(0);
    System.out.println(firstChar); // g

    // last char?
    // index: 0 -> length -1 (0 - 6)
    char lastChar = s.charAt(s.length() -1);
    System.out.println(lastChar); // e

    // s.charAt(-1); // error, index (0 -> positive value)
    // s.charAt(s.length()); // error

    // 3. equals
    boolean isGoodBye = s.equals("goodbye");
    System.out.println(isGoodBye); // true

    // Java is case sensitive
    System.out.println(s.equals("Goodbye")); // false
    System.out.println(s.equals("goodbye ")); // false
    System.out.println(s.equalsIgnoreCase("GoodBye")); // true

    // 4. contains
    System.out.println(s.contains("oo")); // true
    System.out.println(s.contains("ooo")); // false
    System.out.println(s.contains("o")); // true
    System.out.println(s.contains("oo ")); // false
    System.out.println(s.contains("ood")); // true

    // 5. isEmpty
    // Empty String is a String value ("")
    String emptyString = "";
    System.out.println(s.isEmpty()); // false
    System.out.println(emptyString.isEmpty()); // true

    // 6. isBlank()
    System.out.println(s.isBlank()); // false
    System.out.println(emptyString.isBlank()); // true
    System.out.println(spaceString.isBlank()); // true

    // 7. replace "oo" by "xx"
    String newString = s.replace("oo", "xx");
    System.out.println(newString); // gxxdbye

    System.out.println(s.replace('g', 'v')); // voodbye

    // 8. startsWith() -> check prefix
    System.out.println(s.startsWith("go")); // true
    System.out.println(s.startsWith("oo")); // false

    // 9. endsWith()
    System.out.println(s.endsWith("ye")); // true
    System.out.println(s.endsWith("aye")); // false

    // 10. indexOf()
    System.out.println(s.indexOf('d')); // 3
    System.out.println(s.indexOf('o')); // 1, the first 'o'
    System.out.println(s.indexOf('x')); // -1, not found

    System.out.println(s.indexOf("oo")); // 1
    System.out.println(s.indexOf("ood")); // 1
    System.out.println(s.indexOf("ooo")); // -1

    System.out.println(s.lastIndexOf("o")); // 2, the last 'o'

    // 11. concat() -> + operation
    System.out.println(s.concat("!!!"));
   
    // 12. substring
    System.out.println(s.substring(3)); // dbye, index 3
    System.out.println(s.substring(2, 5)); // odb, 2 -> the third char, 5 -> 5 -1 -> 4, thr fifth char

    // 13. toLowerCase(), toUpperCase()
    System.out.println(s.toUpperCase()); // GOODBYE
    System.out.println("BootCAMP".toLowerCase()); // bootcamp

    // 14. trim()
    System.out.println(" Java Python. ".trim()); // "Java Python", removed leading and tailing spaces

    // ! Chain Method
    System.out.println(" Java Python. ".trim(); length()); 
  }
}
