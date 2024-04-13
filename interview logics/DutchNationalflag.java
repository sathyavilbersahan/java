public class DutchNationalflag {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 1, 2, 0, 0, 2, 1, 0, 1, 2 };
        int n = arr.length;
        sortarray(arr, n);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
    }

    public static int sortarray(int[] arr, int n) {
        int i = 0, count0 = 0, count1 = 0, count2 = 0;
        while (i < n) {
            if (arr[i] == 0) {
                count0 = count0 + 1;
            }
            if (arr[i] == 1) {
                count1 = count1 + 1;
            }
            if (arr[i] == 2) {
                count2 = count2 + 1;
            }
            i = i + 1;
        }
        i = 0;
        while (count0 > 0) {
            arr[i++] = 0;
            count0--;
        }
        while (count1 > 0) {
            arr[i++] = 1;
            count1--;
        }
        while (count2 > 0) {
            arr[i++] = 2;
            count2--;
        }
        return 0;
    }
}
