public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        System.out.println(removeelement(nums, val));
        // this type only remove and count the element in this process there are 5
        // elements when we remove the number 2
    }

    public static int removeelement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }

        }
        return count;
    }
}
