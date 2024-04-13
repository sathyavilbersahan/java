public class sumofzeros {
    public static void main(String[] args) {
        int[] arr = { -2, 3, 1, -1, -3, 2 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    System.out.println(arr[i] + " +" + arr[j] + "=0");
                }
            }
        }
    }
}
