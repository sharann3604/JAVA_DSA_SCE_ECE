package com.advanced.dsa.dataStructures.linear.stacks;
import java.util.Stack;
        public class PostFixEvaluation {
        public static void main(String[] args) {
            String s1="23*54*+9-";
            System.out.println(evaluate(s1));
            String s2="45+23*+";
            System.out.println(evaluate(s2));
        }
        public static int evaluate(String exp){
            Stack<Integer> stack= new Stack<>();
            for (char c:exp.toCharArray()){
                if(Character.isDigit(c)){
                    stack.push(c-'0');//Store the integer value
                }else{
                    int b=stack.pop();
                    int a=stack.pop();
                    switch(c){
                        case '+':
                            stack.push(a+b);
                            break;
                        case '-':
                            stack.push(a-b);
                            break;
                        case '*':
                            stack.push(a*b);
                            break;
                        case '/':
                            stack.push(a/b);
                            break;
                    }
                }
            }
            return stack.pop();
        }


    }
