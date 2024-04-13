public class forloop {
    public static void main(String[] args) {
        int i = 2;
        int j = 4;
        for (int n = 2; n <= 3; n++) {
            i = i * n;
        }
        System.out.println(i * j);

        for (int k = 3; k >= 5; k++) {
            j = j * k;
        }
        System.out.println(j);

    }
}