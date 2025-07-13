class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> min; 
    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }
    public void push(int val) {
        stack.push(val);
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            if (removed == min.peek()) {
                min.pop();
            }
        }
    }
    
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        if (!min.isEmpty()) {
            return min.peek();
        }
        return -1;
    }
    }
