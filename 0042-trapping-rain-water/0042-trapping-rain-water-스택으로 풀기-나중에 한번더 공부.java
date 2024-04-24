class Solution {
    public int trap(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>();
        int volume = 0;

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) { //스택이 비어있지 않고, 변곡점을 만나면
                Integer top = stack.pop(); //스택에서 꺼낸다

                if (stack.isEmpty()) {
                    break;
                }

                //스택의 마지막 위치까지를 거리로 계산
                int distance = i - stack.peek() - 1;
                //현재 높이 또는 스택의 마지막 위치 높이 중 낮은 값에 방금 꺼낸 높이의 차를 물 높이로
                int water = Math.min(height[i], height[stack.peek()]) - height[top];

                volume += distance * water;
            }

            stack.push(i);
        }
        return volume;
    }
}