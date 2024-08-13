class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = left + 1;

        while (left < right) {
            // System.out.println("left: " + left + " right: " + right);
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else {
                if (right < nums.length - 1) {
                    right++;
                } else {
                    left++;
                    right = left + 1;
                }
            }
        }
        return new int[]{left, right};
    }
}