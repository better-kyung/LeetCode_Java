class Solution {
    public int trap(int[] height) {
        int answer = 0; //빗물양
        int left = 0; //왼쪽 포인터
        int right = height.length - 1; //오른쪽 포인터
        int leftMax = height[left]; //왼쪽 포인터 값
        int rightMax = height[right]; //오른쪽 포인터 값

        //포인터를 이동하다보면 height 의 가장 큰 값에서 만날 것이므로
        while (left < right) {
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);

            //
            if (leftMax <= rightMax) {
                answer += leftMax - height[left]; //
                left += 1; //포인터 이동
            } else {
                answer += rightMax - height[right];
                right -= 1;
            }
        }

        return answer;
    }
}