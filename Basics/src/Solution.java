
public class Solution {

    //int arr[] = new int[3];
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == target - nums[j]) {
                    return new int[]{i, j};

                }

            }
        }

        return null;

    }

    public static void main(String[] args) {

        int[] nums = {2, 2};
        int target = 4;

        Solution sc = new Solution();
        sc.twoSum(nums, target);

    }
}
