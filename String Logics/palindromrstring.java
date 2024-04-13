public class palindromrstring {
    public static void main(String[] args) {
        String var = "kayak";
        char[] temp = var.toCharArray();
        boolean flag = true;
        for (int i = 0; i < var.length() / 2; i++) {
            if (var.charAt(i) != var.charAt(var.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("is palindrome");
        } else {
            System.out.println("is not palindrome");
        }
    }
}