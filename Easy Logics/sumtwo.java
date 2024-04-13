public class sumtwo {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[9];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        throw new IllegalArgumentException("No two numbers add up to the target value.");
    }
}
