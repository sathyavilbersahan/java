public class Largestarray {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 4, 9, 3, 1 };
        System.out.println(largestarray(arr, 0));
    }

    public static int largestarray(int[] arr, int max) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }
}
