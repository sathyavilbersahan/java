public class mooresmajorityvoting {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 3, 4, 4, 4, 4, 4 };
        System.out.println(majorityvoting(arr));
    }

    public static int majorityvoting(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                max = arr[i];
            }
            if (max == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        return max;
    }

}
