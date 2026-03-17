package com.advanced.dsa.dataStructures.linear.stacks;

import java.util.Stack;
public class VaildParenthnese {
        static boolean isvalidparethenses(String s){
            Stack<Character> stack =new Stack<>();
            for (char c : s.toCharArray()){
                if (c=='{'||c=='['||c=='('){
                    stack.push(c);
                }else{
                    if (stack.isEmpty()){
                        return false;
                    }
                    char top=stack.pop();
                    if (c=='}'&&top!='{')
                        return false;
                    if (c==']'&&top!='[')
                        return false;
                    if (c==')'&&top!='(')
                        return false;




                }

            }
            //the string is valid parenthnese if all the brackets are removed
            //it is in valid even if one char is present in it
            //this will happen when there are bracket mismatch
            return stack.empty();
        }

        public static void main(String[] args) {
            String s1="{[()]}";
            String s2="{[}}(}";
            String s3="{{[[";
            System.out.println(s1 + "->" + (isvalidparethenses(s1) ? "valid":"invalid"));
            System.out.println(s2 + "->" + (isvalidparethenses(s2) ? "valid":"invalid"));
            System.out.println(s3 + "->" + (isvalidparethenses(s3) ? "valid":"invalid"));
        }

    }
