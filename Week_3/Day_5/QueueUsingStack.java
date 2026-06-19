class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> helper;
    public MyQueue() {
        stack = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        while(!stack.isEmpty()){
            helper.push(stack.pop());
        }
        stack.push(x);
        while(!helper.isEmpty()){
            stack.push(helper.pop());
        }
    }
    
    public int pop() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.pop();
    }
    
    public int peek() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}
