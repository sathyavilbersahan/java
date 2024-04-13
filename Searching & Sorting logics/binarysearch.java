public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int key = 30;
        System.out.println(isbinary(arr, key));
    }

    public static int isbinary(int[] arr, int key) {
        int leftnum = 0;
        int rightnum = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (leftnum <= rightnum) {
                int mid = (leftnum + rightnum) / 2;
                if (arr[mid] == key) {
                    return mid;
                } else if (arr[mid] < key) {
                    leftnum = mid - 1;
                } else {
                    rightnum = mid + 1;
                }
            }
        }
        return 0;
    }
}
