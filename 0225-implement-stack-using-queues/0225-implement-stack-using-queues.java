class MyStack {
    
    static Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();        
    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
        
        int track = q.size();
        int pop = 0;

        while (track > 0) {
            if (track == 1) {
                pop = q.poll();
                break;
            }
            q.offer(q.poll());
            track--;
        }
        return pop;
    }
    
    public int top() {
        
        int track = q.size();
        int top = 0;

        while (track > 0) {
            if (track == 1) {
                top = q.peek();
            }
            q.offer(q.poll());
            track--;
        }
        return top;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}