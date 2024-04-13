import java.util.Arrays;

class Anagram {
    public static void main(String[] args) {
        String var1 = "grab";
        String var2 = "barg";
        char[] temp1 = var1.toCharArray();
        char[] temp2 = var2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        for (int i = 0; i < var1.length(); i++) {
            for (int j = 0; j < var2.length(); j++) {
                if (Arrays.equals(temp1, temp2) == true) {
                    System.out.println("both the strings are anagram");
                }
            }
            System.out.println("both the strings are anagram");
        }
    }
}
