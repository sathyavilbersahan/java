import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int[] num = { 23, 54, 6, 34, 21, 2, 67 };
        Arrays.sort(num);
        System.out.println("the sorted elements of a array are");
        for (int i = 0; i < num.length; i++)
            System.out.println(num[i]);
    }
}