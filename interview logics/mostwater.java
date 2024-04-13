public class mostwater {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(containerwitmostwater(arr));
    }

    public static int containerwitmostwater(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                max = Math.max(max, Math.min(arr[i], arr[j]) * (arr[j - i]));
            }
        }
        return max;
    }
}
