public class funloop {
    public static void main(String args[]) {
        for (int i = 1; i <= 15; i++) {
            for (int k = 14; k >= i; k++) {
                System.out.println(" ");
            }
            for (int n = 1; n <= i; n++) {
                System.out.println(n + " ");
            }
            System.out.println(" ");

        }
    }
}