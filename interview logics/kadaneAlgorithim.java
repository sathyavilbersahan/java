public class kadaneAlgorithim {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1 };
        System.out.println(kadanesalgorithim(arr));
    }

    public static int kadanesalgorithim(int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > max)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return max;
    }

}
