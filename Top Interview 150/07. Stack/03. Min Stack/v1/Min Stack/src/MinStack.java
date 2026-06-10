class MinStack {

    private int[] stack;
    private int size = 0;

    private void reSize() {

        //increase stack size by dynamically allocating an array with double the size
        int[] temp = new int[stack.length * 2];

        //transferring elements to the the larger array
        for(int i = 0; i < stack.length; ++i)
            temp[i] = stack[i];

        stack = temp;
    }

    //constructor
    public MinStack() {
        this.stack = new int[10];
    }

    public void push(int value) {

        //ensures that enough space is allocated
        if(this.size == stack.length) {
            this.reSize();
        }

        stack[this.size++] = value;
    }

    public void pop() {

        //ensures that there is an element to pop
        if(this.size > 0)
            --this.size;
    }

    public int top() {
        return this.size > 0 ? stack[this.size - 1] : 0;
    }

    public int getMin() {

        int minNum = Integer.MAX_VALUE;

        //finds minimum value
        for(int i = 0; i < size; ++i)
            minNum = Math.min(minNum, stack[i]);

        return minNum;
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