import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] num = { 1, 4, 8, 4, 7, 3, 2, 7, }; // data
        Arrays.sort(num); // we use Arrays.sort method to sort tne array in ascending order
        for (int i = 0; i < num.length; i++) { /// loops
            System.out.println(num[i]); /// print statement
        }
    }
}
