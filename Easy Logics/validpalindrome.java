public class validpalindrome {

    public static void main(String[] args) {
        String word = "a man,a plan,a canal;panama";
        System.out.println(validpalindrome(word));

    }

    public static boolean validpalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i <= j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
