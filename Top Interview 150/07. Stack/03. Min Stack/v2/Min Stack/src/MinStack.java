import java.util.Stack;

class MinStack {

    //creates instance variables
    private Stack<Integer> stack; //keeps track of all values
    private Stack<Integer> minStack; //keeps track of minimum values

    //constructor
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {

            //only adds minimum values
            if (val <= minStack.peek()) {
                minStack.push(val);
            }
        }
    }

    public void pop() {

        //checks to see if the top value matches the min stack top value, in order to pop
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */