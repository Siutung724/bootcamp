public class DemoMath {
    // Main + Enter (VSCode)
  public static void main(String[] args) {
    // + - * / %
    // % -> The remainder of division
    int remainder = 10 % 3;
    System.out.println(remainder); //1

    remainder = 99 % 7;
    System.out.println(remainder); //1

    // int
    int a = 7;
    System.out.println(a + 9); //16
    System.out.println(a - 3); //4
    System.out.println(a + 7); //49
    System.out.println(a / 7); //1

    //Step 1: a + 10 -> 17 (int + int -> int value)
    //Step 2: Assign int value (17) into int box
    a = a + 10;
    System.out.println(a); //17

    //Step 1: int + double -> double value
    //Step 2: Assign double value into double box
    int b = 8;
    System.out.println(b + 3.5d); //11.5
    double r = b + 3.5d;

    // ! Operation between higher level type and lower level type -> Result higher level type
    long k = 3 * 100L;
    // int t = 3 * 100L; // int * long -> long, cannot assign to int box

    // ! byte -> short -> int -> long -> float -> double
    float f1 = 10L; // special case
    byte b10 = 9;
    short s10 = 9;
    // ! Special Case byte + short -> int
    // short s20 = b10 + s10;
    int s20 = b10 + s10; //ok

    int result = 10 / 3;
    System.out.println(result); // 3

    int englishScore = 87;
    int mathScore = 72;
    int historyScore = 34;

    // Step 1: (int + int + int) / int -> int (answer: 64)
    // Step 2: assign int value 64 int double box -> 64
    double averageScore = (englishScore + mathScore + historyScore) / 3.0; // ! fix -> divide by 3.0
    System.out.println(averageScore); // 64.3333333

    int count = 0;
    //System.out.println(10/ count); // error

    // 0.1 + 0.2
    System.out.println(0.1 +0.2); // 0.30000000000000004
    double d1 = 0.1;
    double d2 = 0.2;
    double d3 = d1 + d2;
    System.out.println(d3); // 0.30000000000000004
    System.out.println(0.2 + 0.2); // 0.4

    // ! Never use double varible (變量) for Math operation (+, -, *, /)
    // ! Solution: BigDecinal (we teach later)

    // ! Overflow (no error)
    int i10 = 2_100_000_000;
    int i11 = i10 + 100_000_000;
    System.out.println(i11); // -2094967296
    // ! For primtive (int, long), it will not error after math operation even it exceed the upper/lower later.

    // ! Step 1: int + long -> long (no overflow)
    // ! Step 2: assign long value into long variable
    long l10 = i10 + 100_000_000L;
    System.out.println(l10); // 2_200_000_000


    // ! char -> int (ASCII)
    int v = 97;
    char n = 'a';

    int v2 = n;
    System.out.println(v2); //97

    // A 
    char n2 = 'A';
    int v3 = n2;
    System.out.println(v3); // 65

    long l20 = 3;
    int v4 = '你';
    System.out.println(v4); //20320

    int v5 = 20320;
    // ! Cannot assign higher level value into lower level type.
    // char c20 = v5;

    int value = 'A'; // char -> int

    long l30 = 2_200_000_000L;
    int v10 = (int) l30; // 自負盈虧
    System.out.println(v10); // -2094967296

    // 65 -> A
    int v11 = 65;
    char c80 = (char) v11;
    System.out.println(c80); //A

    int v12 = 65620;
    char c81 = (char) v12;
    System.out.println(c81); // T (65620 - 65535)

  }

  

}