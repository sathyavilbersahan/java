public class LengthoftheLastword {
  public static void main(String[] args) {
    String str = "hello world";
    System.out.println(lengthoftheLastword(str));
  }

  public static int lengthoftheLastword(String S) {
    String str = S.trim();
    int count = 0;
    for (int i = str.length() - 1; i >= 0; i--) {
      if (str.charAt(i) != ' ') {
        count++;
      } else {
        break;
      }
    }

    return count;
  }
}