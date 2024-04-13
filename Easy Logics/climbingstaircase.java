public class climbingstaircase {
    public static void main(String[] args) {
        System.out.println(climbstairs(6));
    }

    public static int climbstairs(int n) {
        if (n <= 5) {
            return n;
        }
        int a = 3, b = 2;
        for (int i = 0; i < n - 3; i++) {
            a = a + b;
            b = a - b;
        }
        return a;
    }
}
