interface StackADT {
    void push(int item);
    int pop();
    int peek();
    boolean isEmpty();
}

class Stack implements StackADT {
    private int maxSize = 10;
    private int[] stackArray = new int[maxSize];
    private int top = -1;

    public void push(int item) {
        if (top >= maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            stackArray[++top] = item;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class StackTest {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        System.out.println("Top element: " + s.peek());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Is stack empty? " + s.isEmpty());
    }
}
