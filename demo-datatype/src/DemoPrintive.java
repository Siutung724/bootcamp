public class DemoPrintive {
  public static void main(String[]args){
    // integer

    // from right to left (put value 3 into a box x)
    // ! Declaration (declare the type of x)
    //! Assignment (assign value 3 into x)
    int x = 3;
    System.out.println(x);//3

    // ! Re-assignment
    // replace the box value by 100
    x = 100;
    System.out.println(x);//100

    x = -200;
    System.out.println(x);//-200

    // Number with decinal
    double y = 3.14159;
    double z = 3.0;

    // ! Assign 10 (int) into double box, convert 10 to 10.0
    double a = 10; // still ok for integer

    System.out.println(y); //3.14159
    System.out.println(z); //3.0
    System.out.println(a); //10.0

    // ! Cannot assign decinal number into box
    // int k = 10.5;

    // Char (charactar) 
    char h = 'e';
    System.out.println(h); //e

    // reassign value k
    h = 'k';
    // ! sysout + Enter (VSCode)

    h ='你';
    System.out.println(h); // 你

    // boolean
    boolean isElderly = true;
    boolean isMarried = false;
    boolean isAdult = true;

    System.out.println(isElderly); //true
    System.out.println("isMarried=" + isMarried); //false
    System.out.println(isAdult); //true

    // 整數 (int, byte, short, long)

    // Range; -128 to 127
    byte b1 = 127;
    // byte b2 = 128; // out range
    // byte b3 = -129; // out range

    // ! 32767 is an int value
    // ! There is not byte value and short value in Java
    // Range; -32678 to 32767
    short s1 = 32767;
    // Short s2 = 32768;
    Short s3 = -32768; //ok

    // ! In real lift, by default we use int for integer.
    int i1 = 2_100_000_000;
    // int i2 = 2_200_000_000;

    // long -> 2^63
    // Assign int value into long value
    long l1 = 1270;
    // Assign long value onto int box (not ok)
    // int i7 = 1270L;
    long l8 = 555L;

    // Decinal Number (float, double)
    // 3.5 (double value) -> float box (unsafe)
    // float f1 = 3.5;

    double d1 = 3.5;
    // float f1 = d1; // unsafe


    // ! 3.5f is a float value

     
      
       
        
    // ! 3.5 is a double value
    // ! 3.5d is a double value
    // Assign float value into float box
    float f2 = 3.5f;
    // Assign float value into double box
    double 


  }
}





