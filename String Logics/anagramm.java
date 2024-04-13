import java.util.Arrays;

public class anagramm {
    public static void main(String[] args) {
        String var1 = "grab";
        String var2 = "barg";
        char[] temp1 = var1.toCharArray();
        char[] temp2 = var2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        if (var1.length() == var2.length()) {
            if (Arrays.equals(temp1, temp2) == true) {
                System.out.println("both the strings are anagram");

            } else {
                System.out.println("both the strings are anagram");

            }

        }
    }
}
