package com.advanced.dsa.dataStructures.linear.stacks;

public class StringStacks {
        private static  final int MAX_SIZE=10;
        private String[] arr = new String[MAX_SIZE];
        private int top=-1;//intially the stack is empty
        public boolean isEmpty(){
            return top == -1;
        }
        public boolean isfull(){
            return MAX_SIZE==-1;
        }
        public void push(String data){
            if (isfull()){
                System.out.println("stack overflow. cant push its tight ");
                return;
            }
            arr[++top]=data;//increment the top and add the elemnts at the index
            System.out.println("the string " + data + "was push to the stack");
        }
        public String pop() {
            if (isEmpty()){
                System.out.println("Stack underflow cant remove anything its tight");
                return null;//
            }
            String popped=arr[top--];
            return popped;

        }
        public void display(){
            if (isEmpty()){
                System.out.println("stack underflow cant display");
                return;
            }
            System.out.println("the Stack elemnts from top to bottom:");
            for(int i=top;i>=0;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
        public String peek(){
            if (isEmpty()){
                System.out.println("stack underflow no top");
                return null;
            }
            return arr[top];
        }
        public int size(){
            //no elemnts,single elemnts,mutiple elemnts
            return top+1;//one formula for all case
        }

        public static void main(String[] args) {
            StringStacks stacks=new StringStacks();
            //stack pop
            stacks.push("xyz");
            stacks.push("abc");
            stacks.push("efg");
            stacks.push("akbr");
            System.out.println(stacks.peek());
            String popped=stacks.pop();
            System.out.println("popped " + popped);
            System.out.println("size "+ stacks.size());
        }
    }

