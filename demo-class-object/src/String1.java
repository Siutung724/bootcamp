public class String1 {
  private char[] chs;

  public String1(String str) {
    if (str == null) 
      this.chs = new char[0];
    else
    this.chs = str.toCharArray();
  }
  public String1(char[]chs){
    this.chs = chs;
  }
  public String1 replace(char from, char to) {
    char[] newChs = new char [this.chs.length];
    for (int i = 0; i < this.chs.length; i++){
      if (this.chs[i] != from)
        newChs[i] = this.chs[i];
      else
        newChs[i] = to;
    }
    return new String1(newChs);
  }
  


    // ! error: return this.chs.replace(0 to 3); 


  public boolean isEmpty(){
    return this.chs.length == 0;
  }

  public char charAt(int index) {
    return this.chs[index];
  }
  public boolean contains(char ch) {
    for (char c : this.chs) {
      if (c == ch)
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    String1 s = new String1("hello");

    char c = s.charAt(0); // h

    boolean result = s.contains('e'); // true
    System.out.println(result);

    String1 s2 = new String1("");
    System.out.println(s2.length()); // 0
    System.out.println(s2.isEmpty());
    System.out.println(s2.charAt(0)); // java.lang.ArrayIndexOut OfBoundsException


  }
}
