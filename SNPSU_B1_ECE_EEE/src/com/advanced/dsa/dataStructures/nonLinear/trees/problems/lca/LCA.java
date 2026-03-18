package com.advanced.dsa.dataStructures.nonLinear.trees.problems.lca;

public class LCA {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
        }
    }
    static Node lowestCommonAncestor(Node root, int p, int q){
        if (root == null){
            return null;
        }
        if (root.data==p || root.data==q){
            return root;
        }
        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);
        if (left!=null && right!=null){
            return root;
        }
        return (left!=null ? left:right);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        Node lca = lowestCommonAncestor(root,4,5);
        System.out.println("LCA: "+ lca.data);
    }
}

