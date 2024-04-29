class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            //현재 온도가 스택에 있는 온도보다 높다면 꺼내서 결과를 업데이트한다.
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int last = stack.pop();
                //결과 업데이트
                result[last] = i - last;
            }
            //현재 인덱스를 스택에 삽입
            stack.push(i);
        }
        return result;
    }
}