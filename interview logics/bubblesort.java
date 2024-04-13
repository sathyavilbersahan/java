public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 9, 4 };
        bubblesort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static int bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr.length - 1;
    }
}
