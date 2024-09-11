class Solution {
    public int majorityElement(int[] nums) {
        return m(0, nums.length - 1, nums);
    }

    public int m(int left, int right, int[] nums) {
        if (left == right) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;
        int a = m(left, mid, nums);
        int b = m(mid + 1, right, nums);

        int countA = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == a) {
                countA++;
            }
        }
        return countA > (right - left + 1) / 2 ? a : b;
    }
}