public class removeduplicatesfromsorted {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3 };
        System.out.println(duplicatenumber(nums));
    }

    public static int duplicatenumber(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {

            } else {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
