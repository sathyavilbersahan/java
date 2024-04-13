import java.util.Arrays;

public class secondsmallestelement {
    public static void main(String[] args) {
        int[] num = { 12, 11, 5, 1, 37, 72, 31, 44 };
        Arrays.sort(num);
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            max = num[1];

        }
        System.out.println(max);
    }

}
