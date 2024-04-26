import java.util.ArrayList;
import java.util.Stack;

class MinStack {
    private ArrayList<Integer> stack;
    private ArrayList<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if (minStack.isEmpty() || val <= minStack.get(minStack.size() - 1)) {
            minStack.add(val);
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            int removedValue = stack.remove(stack.size() - 1);
            if (removedValue == minStack.get(minStack.size() - 1)) {
                minStack.remove(minStack.size() - 1);
            }
        }
    }
    
    public int top() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        throw new RuntimeException("Stack is empty");
    }
    
    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.get(minStack.size() - 1);
        }
        throw new RuntimeException("Stack is empty");
    }
}
