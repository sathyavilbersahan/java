import java.util.Arrays;
import java.util.Collections;

public class descendinorder {
    public static void main(String[] args) {

        Integer num[] = { 3, 5, 7, 9, 4 };
        Arrays.sort(num, Collections.reverseOrder());
        for (int i = num.length; i >= 0; i++) {
            System.out.println(num + " ");
        }
    }
}
