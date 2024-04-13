public class insertionsort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 5, 9, 6 };
        for (int i = 1; i < arr.length; i++) { // why we are taking 1 in this statement we need to
            // insert the value index of 1 is 3 and the i-1 is 6 index
            int temp = arr[i];
            int j = i - 1;
            if (j >= 0 && arr[j] > temp) { // j=1; 1>=0 is true && 1 is arr[j]> temp is 3
                arr[j + 1] = arr[j]; //
                j--;
            }
            arr[j + 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
