public class bubblesort {
    public static void main(String[] args) {
        int[] num = { 2, 7, 9, 5, 6, 4 };
        bubblesort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static int bubblesort(int[] num) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        return n - 1;
    }
}
