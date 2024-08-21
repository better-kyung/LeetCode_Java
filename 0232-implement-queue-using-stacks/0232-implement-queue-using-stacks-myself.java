class MyQueue {

    Deque<Integer> input = new ArrayDeque<>();
    Deque<Integer> output = new ArrayDeque<>();

    public MyQueue() {

    }

    public void push(int x) {
        input.add(x);
        while (!input.isEmpty()) {
            output.add(input.pop());
        }
    }

    public int pop() {
        return output.pop();
    }

    public int peek() {
        return output.peek();
    }

    public boolean empty() {
        return output.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */