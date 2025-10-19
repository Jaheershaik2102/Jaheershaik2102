
class MyStack {
    private Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        if (q.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q.remove();
    }

    public int top() {
        if (q.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
    
    public int size() {
        return q.size();
    }
}