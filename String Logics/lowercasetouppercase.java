public class lowercasetouppercase {
    public static void main(String[] args) {
        String var = "sathya";
        char[] ch = var.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 0) {
                ch[i] = (char) (ch[i] - 32); // ASCII value
            }
        }
        System.out.println(ch);
    }
}
