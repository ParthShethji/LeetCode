class MyStack {

    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
    int size = q.size();
    while (size > 1) {  // Keep only the last element
        q.offer(q.poll());
        size--;
    }
    return q.poll(); // Return the last element

    }
    
    public int top() {
    int size = q.size();
        while (size > 1) {
            q.offer(q.poll());
            size--;
        }
        int ans = q.peek(); // Get last element
        q.offer(q.poll()); // Put it back
        return ans;

    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */