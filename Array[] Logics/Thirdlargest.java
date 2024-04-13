import java.util.Arrays;

public class Thirdlargest {
    public static void main(String[] args) {
        int[] num = { 2, 7, 9, 4, 6 };
        Arrays.sort(num);
        System.out.println(thirdlargest(num, 5));
    }

    public static int thirdlargest(int[] num, int temp) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++)
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
        }
        return num[temp - 3];
    }
}
