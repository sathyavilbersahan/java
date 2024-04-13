public class reversethenumber {
  public static void main(String[] args) {
    System.out.println(reverse(123));
  }

  static int reverse(int nums) {
    int rev = 0;
    if (nums != 0) {
      int digit = nums % 10;
      if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
        return 0;
      }
      rev = (rev * 10) + digit;
      nums = nums / 10;

    }
    return rev;
  }
}
