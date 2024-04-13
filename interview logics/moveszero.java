public class moveszero {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 4, 5 };
        System.out.println("the values are " + moveszeros(arr));
    }

    public static int moveszeros(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[temp] == 0) {
                int n = arr[i];
                arr[i] = arr[temp];
                arr[temp] = n;

            }

            if (arr[temp] != 0) {
                temp++;
            }
        }
        return temp;
    }
}
