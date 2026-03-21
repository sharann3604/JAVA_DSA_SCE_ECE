package Module11;

class Stack {
    int[] arr;
    int top;
    int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    void push(int x) {
        if (top == capacity - 1) return;
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) return -1;
        return arr[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return arr[top];
    }

    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top: " + s.peek()); // 30
        System.out.println("Popped: " + s.pop()); // 30
        System.out.println("Popped: " + s.pop()); // 20
        s.push(40);
        System.out.println("Top: " + s.peek()); // 40
    }
}