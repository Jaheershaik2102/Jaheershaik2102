import java.util.Stack;

class MyQueue {
    Stack < Integer > input = new Stack < > ();
    Stack < Integer > output = new Stack < > ();
    
    public MyQueue() {

    }

    public void push(int x) {
        while (input.empty() == false) {
            output.push(input.pop());
        }
        
        System.out.println("The element pushed is " + x);
        input.push(x);
        
        while (output.empty() == false) {
            input.push(output.pop());
        }

    }

    public int pop() {
        if (input.empty()) {
            System.out.println("Stack is empty");
            throw new IllegalStateException("Queue is empty");
        }
        int val = input.pop();
        return val;

    }

    public int peek() {
        if (input.empty()) {
            System.out.println("Stack is empty");
            throw new IllegalStateException("Queue is empty");
        }
        return input.peek();
    }

    public boolean empty() {
        return input.empty();
    }

    int size() {
        return input.size();
    }
}