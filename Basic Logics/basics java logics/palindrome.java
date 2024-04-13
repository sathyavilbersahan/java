public class palindrome {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(ispalindrome(num));

    }

    public static boolean ispalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        if (rev == temp) {
            return true;
        }
        return false;
    }
}
