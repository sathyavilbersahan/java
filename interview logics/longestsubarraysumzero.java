public class longestsubarraysumzero {
    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(longestsubarray(arr));
    }

    public static int longestsubarray(int[] arr) {
        int sub = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sub = sub + arr[j];
                if (sub == 0) {
                    if (max < j - i + 1)
                        max = j - i + 1;
                }
            }
        }
        return max;
    }
}
