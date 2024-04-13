public class checksubsequence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] sub = { 2, 4, 6 };
        System.out.println(issubsequence(arr, sub));
    }

    public static boolean issubsequence(int[] arr, int[] sub) {
        int array = 0;
        int sequence = 0;
        while (array < arr.length && sequence < sub.length) {
            if (arr[array] == sub[sequence]) {
                sequence++;
            }
            array++;
        }
        return sequence == sub.length;
    }
}
