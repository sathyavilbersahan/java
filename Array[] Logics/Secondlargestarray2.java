import java.util.Arrays;

public class Secondlargestarray2 {
    public static void main(String[] args) {
        int[] num = { 6, 3, 4, 7, 8, 9 };
        Arrays.sort(num);
        System.out.println(secondlargestnumber(num, 0));
    }

    public static int secondlargestnumber(int[] num, int temp) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num[temp - 2];
    }
}
