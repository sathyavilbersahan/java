public class frequency {
    public static void main(String[] args) {
        String var = "hello world";
        int[] frequency = new int[256]; // ASCII value
        for (int i = 0; i < var.length(); i++) {
            char ch = var.charAt(i);
            frequency[ch]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + " " + frequency[i]);
            }
        }
    }
}
