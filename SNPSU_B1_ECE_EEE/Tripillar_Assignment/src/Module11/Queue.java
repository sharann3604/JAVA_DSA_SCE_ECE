package Module11;

class Queue {
    int[] arr;
    int front, rear, size, capacity;

    Queue(int cap) {
        capacity = cap;
        arr = new int[cap];
        front = 0;
        size = 0;
        rear = cap - 1;
    }

    void enqueue(int x) {
        if (size == capacity) return;
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    int dequeue() {
        if (size == 0) return -1;
        int x = arr[front];
        front = (front + 1) % capacity;
        size--;
        return x;
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        q.enqueue(40);

        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // 40
    }
}