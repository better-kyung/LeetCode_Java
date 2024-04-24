class Solution {
    public int trap(int[] height) {
        int volume = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];

        while (left < right) { //가장 큰 지점에서 만날 때 까지
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax <= rightMax) {
                volume += leftMax - height[left];
                left += 1;
            } else {
                volume += rightMax - height[right];
                right -= 1;
            }
        }
        return volume;
    }
}