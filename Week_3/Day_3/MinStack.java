class MinStack {
    Deque<int[]> queue;

    public MinStack() {
        queue = new ArrayDeque<>();
    }
    
    public void push(int val) {
        int min = queue.isEmpty() ? val : Math.min(queue.peek()[1], val);
        queue.push(new int[] {val, min});
    }
    
    public void pop() {
        queue.pop();
    }
    
    public int top() {
        return queue.peek()[0];
    }
    
    public int getMin() {
        return queue.peek()[1];
    }
}
