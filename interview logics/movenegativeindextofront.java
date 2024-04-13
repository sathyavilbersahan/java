import java.util.Arrays;

public class movenegativeindextofront {
    public static void main(String[] args) {

        int[] arr = { 5, -2, 10, -8, 3, -1, 0, -4 };
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int sum = arr[i];
                arr[i] = arr[temp];
                arr[temp] = sum;
                temp++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
