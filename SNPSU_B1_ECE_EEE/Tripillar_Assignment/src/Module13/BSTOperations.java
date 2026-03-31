package Module13;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTOperations {

    Node root;

    // 1. Insert elements into BST
    Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    // 2. Search for a key in BST
    boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // 3. Find minimum element
    int findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    // Find maximum element
    int findMax(Node root) {
        while (root.right != null)
            root = root.right;
        return root.data;
    }

    // 4. Delete a node from BST
    Node delete(Node root, int key) {

        if (root == null)
            return root;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);

        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    // 5. Check whether tree is valid BST
    boolean isBST(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
               isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {

        BSTOperations tree = new BSTOperations();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("Search 40: " + tree.search(tree.root, 40));

        System.out.println("Minimum: " + tree.findMin(tree.root));
        System.out.println("Maximum: " + tree.findMax(tree.root));

        tree.root = tree.delete(tree.root, 20);

        System.out.println("Is Valid BST: " +
                tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}