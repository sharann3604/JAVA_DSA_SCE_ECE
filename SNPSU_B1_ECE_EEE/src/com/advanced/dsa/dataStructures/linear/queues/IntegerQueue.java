package com.advanced.dsa.dataStructures.linear.queues;
    public class IntegerQueue {
        private static final int max_size=5;
        private int[] arr=new int[max_size];
        private int front;
        private int rear;
        IntegerQueue(){
            front=rear=-1;//intially the queue is empty
        }
        public boolean isEmpty(){
            return (front==-1&&rear==-1);
        }
        public boolean isfull(){
            return rear==max_size-1;
        }
        public void enqueue(int data){
            if (isfull()){
                System.out.println("qeue is full add empty ");
                return;
            }
            if (isEmpty()){
                front=rear=0;//move front and rear to the zero index
            }else{
                rear++;
            }
            arr[rear]=data;
            System.out.println("Enqeue data " + " to the queue");
        }
        public void dequeue(){
            if (isEmpty()){
                System.out.println("queue is empty not able to remove");
                return;
            } else if (front==rear) {
                front=rear=-1;//Move front &rear to -1
            }else{
                front++;//Move to the next element in the queue
            }
        }
        public int getFront(){
            if(isEmpty()){
                System.out.println("empty queue.No front element");
                return -1;
            }
            return arr[front];
        }
        public int getRear(){
            if(isEmpty()){
                System.out.println("empty queue.No rear element");
                return -1;
            }
            return arr[rear];
        }
        public int size(){
            if (isEmpty()){
                return 0;
            }
            return rear-front+1;

        }
        public void display(){
            for (int i=front;i<=rear;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            IntegerQueue queue=new IntegerQueue();
            int[] arr={1,2,3,4,5,6,7,8,9,10};
            for (int x:arr){
                queue.enqueue(x);
            }
            queue.display();
            System.out.println("size "+ queue.size());
            System.out.println("Front element "+ queue.getFront());
            System.out.println("rear elememt " + queue.getRear());
        }
    }
