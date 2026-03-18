package com.advanced.dsa.dataStructures.nonLinear.bst;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class BinarySearchTree {
    public static void inOrder(TreeNode root){
        if (root!=null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static TreeNode insert(TreeNode root, int key){
        if (root==null){
            //the new node will become the root node
            return new TreeNode(key);
        }
        if (key < root.data){
            root.left=insert(root.left,key);
        } else if (key > root.data) {
            root.right=insert(root.right,key);
        }
        return root;
    }
    public static TreeNode search(TreeNode root, int key){
        if (root==null || key==root.data){
            return root;
        }
        if (root.data<key){
            return search(root.right,key);
        }
        return search(root.left,key);
    }
    public static void main(String[] args) {
        TreeNode root =null;
        root=insert(root,50);
        inOrder(root);
        System.out.println();
        int[] arr={60,20,30,10,58,100};
        for (int i=0;i<arr.length;i++){
            root = insert(root,arr[i]);
        }
        inOrder(root);
        System.out.println();
        int key1=50;
        int key2=99;
        TreeNode res1= search(root,key1);
        TreeNode res2= search(root,key2);
        System.out.println(res1!=null? "Present" : "Not Present");
        System.out.println(res2!=null? "Present" : "Not Present");
    }
}
