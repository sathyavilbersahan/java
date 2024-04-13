public class rotatearraybyk {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i]; // int = temp (2,3,4)should be printed
        }
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i]; // in this case arr[i-k] has data of(5,6,7,8,9);
        }
        for (int i = 0; i < k; i++) {
            arr[arr.length - k + i] = temp[i]; // (2,3,4) will print because of -k values(2,3,4)will go back +i values
            // will come front
            System.out.println(temp[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}