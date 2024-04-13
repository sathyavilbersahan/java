public class smallestarray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 9, 5, 1 };
        System.out.println(smallestarray(arr));
    }

    public static int smallestarray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;
    }
}
