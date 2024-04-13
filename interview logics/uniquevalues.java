
public class uniquevalues {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 3, 1, };
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    temp = arr[i];
                }
            }
        }
        System.out.println("the occurence of the unique values are " + temp);
    }
}