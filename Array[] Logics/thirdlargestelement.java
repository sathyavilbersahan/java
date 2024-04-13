import java.util.Arrays;

public class thirdlargestelement {
    public static void main(String[] args) {
        int[] num = { 1, 2, 5, 4, 5, 6 };
        System.out.println(largestelement(num, 5));
    }

    public static int largestelement(int[] num, int temp) {
        Arrays.sort(num);
        return num[temp - 3];
    }
}
