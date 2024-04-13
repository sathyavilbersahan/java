public class MergeSortedArray {

    public static void main(String[] args) {
        int[] num1 = { 1, 2, 3, 0, 0, 0, };
        int[] num2 = { 2, 5, 6 };
        int n = 3;
        int m = 3;
        System.out.println();
    }

    public static int[] MergeSortedArrays(int[] num1, int[] num2, int n, int m) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n;
        while (j <= 0) {
            if (i > 0 && num1[i] > num2[j]) {
                num1[k] = num1[i];
                k--;
                i--;
            } else {
                num1[k] = num2[j];
                k--;
                j--;
            }
        }
        return null;
    }

}
