public class withoutusingreverse {
    public static void main(String[] args) {
        String var = "abcd";
        String value = "";
        for (int i = var.length() - 1; i >= 0; i--) {
            value += var.charAt(i);

        }
        System.out.println(value);
    }
}
