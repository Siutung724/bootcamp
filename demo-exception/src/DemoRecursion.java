public class DemoRecursion {

  public static void main(String[] args) {
    // 5 + 4 + 3 + 2 + 1
    int sum = 0;
    for (int i = 5; i >= 1; i--) {
      sum += i;
    }
    System.out.println(sum); // 15

    System.out.println(sum(5)); // 15

    System.out.println(rSum(5)); // 15

    // 100 + 98 + 96 + 94 + ... + 2
    System.out.println(rSum2(10)); // 30
    System.out.println(solve(11)); // 30

    // 3 * 6 * 9 * 12 ... * n, given n divided by 3
    System.out.println(rSum3(9)); // 162
  }

  // ! Recursion (Call itself)
  public static int rSum(int n) {
    // base criteria
    if (n <= 1)
      return 1;
    return n + rSum(n - 1); // 2 + rSum(2 - 1)
  }
  // ! Step 1: 5 + rSum(5 - 1)
  // ! Step 2: 4 + rSum(4 - 1)
  // ! Step 3: 3 + rSum(3 - 1)
  // ! Step 4: 2 + rSum(2 - 1)
  // ! Step 5: return 1

  // n = 11
  // 10 + 8 + 6 + 4 + 2
  public static int solve(int n) {
    if (n % 2 == 1)
      n--;
    return rSum2(n);
  }

  public static int rSum2(int n) {
    if (n <= 2)
      return 2;
    return n + rSum2(n - 2);
  }

  public static int rSum3(int n) {
    if (n <= 3)
      return 3;
    return n * rSum3(n - 3);
  }

  // Given n >= 1
  // n + (n - 1) + (n - 2) ... + 1
  public static int sum(int n) {
    if (n <= 0)
      return -1;
    int sum = 0;
    for (int i = n; i >= 1; i--) {
      sum += i;
    }
    return sum;
  }
}