public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 9, 3, 1 };
        selectionsort(arr);
        System.out.println(selectionsort(arr));
    }

    public static int selectionsort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                }
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        return ;
    }
}