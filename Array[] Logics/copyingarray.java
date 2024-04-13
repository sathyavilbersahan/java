public class copyingarray {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4 };
        int[] duplicate = num;
        System.out.println("Original Array is:");

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("Duplicate Array is");
        for (int i = 0; i < duplicate.length; i++) {
            System.out.println(duplicate[i]);
        }
    }
}