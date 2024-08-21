class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            map.put(temperatures[i], i);

            while (!stack.isEmpty()) {
                if (temperatures[stack.peek()] < temperatures[i]) {
//                    arr[map.get(stack.peek())] = map.get(temperatures[i]) - map.get(stack.pop());
                    int last = stack.pop();
                    arr[last] = i - last;
                } else {
                    break;
                }
            }
//            stack.push(temperatures[i]);
            stack.push(i);
        }

        return arr;

    }
}