import java.util.Arrays;

public class firstmissingpositive {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, 4 };
        Arrays.sort(arr);
        System.out.println(missingnumbers(arr));
    }

    public static int missingnumbers(int[] arr) {
        int temp = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp) {
                temp++;
            }
        }
        return temp;
    }
}
