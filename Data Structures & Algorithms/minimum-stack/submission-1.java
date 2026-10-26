class MinStack {
    private int min;
    private Deque<Integer> minStack;
    private Deque<Integer> track;

    public MinStack() {
        this.minStack = new ArrayDeque<>();
        this.track = new ArrayDeque<>();
        this.min = 0;
    }
    
    public void push(int val) {
        minStack.push(val);
        if (track.isEmpty() || val <= track.peek()) {
            track.push(val);
        }
    }
    
    public void pop() {
        if (track.peek().equals(minStack.peek())) {
            track.pop();
        }
        minStack.pop();
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        return track.peek();
    }
}
