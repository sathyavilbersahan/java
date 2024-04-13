public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 1 };
        selectionsort(arr);
        for (int i : arr)
            System.out.println((i));
    }

    public static int selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }

        }
        return 0;
    }
}
