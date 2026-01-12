public class DemoOperator {
  public static void main(String[]args){
    // + 1, -1
    int x = 3;
    x = x + 1;
    x += 1;
    x++;
    ++x;
    System.out.println(x); // 7

    int y = 8;
    y = y - 1;
    y -= 1;
    y--;
    --y;
    System.out.println(y); // 4

    // + 2
    int a = 9;
    a = a + 2;
    a += 2;
    System.out.println(a); // 13

    a *= 2;
    System.out.println(a); // 26
    a /= 2;
    System.out.println(a); // 13

    // The different between x++ and ++x
    int j = 11;
    j++;
    System.out.println(++j * 8); // 12 * 8 (** first, then * 8)
    System.out.println(j); // 12

    int k = 11;
    j++;
    System.out.println(k++ * 8); // 11 * 8 (* 8 first, then ++)
    System.out.println(j); // 12

    int h = 14;
    System.out.println(h++ * 2 * ++h); // 448
    // Step 1: 14 x 2
    // Step 2: h become 15
    // Step 3: 28 x 16 (15 + 1)


    // Operator !
    int age = 66;
    boolean isElderly = age > 65;
    if (isElderly == true){

     if (isElderly){

      // Check if it is not an elderly
     if (isElderly){
    }
    int t = 100;
    boolean result = t > 99;
    System.out.println(result); // true

    // true / false
    int e = 5;
    System.out.println(e > 3 && e < 10); // && AND
    System.err.println(e > 3 ll e > 20); // 

    //
    System.out.println(true );



  }
  
}
