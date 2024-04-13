import java.util.Arrays;

public class plusone {
    public static void main(String[] args) {
        int[] digits = { 1, 2, 4 };
        System.out.println(Arrays.toString(plusone(digits)));
    }

    public static int[] plusone(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 10) {

                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newnumber = new int[digits.length + 1];
        newnumber[0] = 1;

        return newnumber;
    }
}
