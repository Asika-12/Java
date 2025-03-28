class BinarySearchTree {
    
    // Node class represents each node in the BST
    static class Node {
        int value;
        Node left, right;
        
        // Constructor to create a new node
        Node(int item) {
            value = item;
            left = right = null;
        }
    }

    // Root node of the BST
    private Node root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new value into the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive insert function
    private Node insertRec(Node root, int value) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(value);
            return root;
        }

        // Otherwise, recur down the tree
        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);

        // return the (unchanged) node pointer
        return root;
    }

    // Method to perform inorder traversal of the BST
    public void inorder() {
        inorderRec(root);
    }

    // Recursive inorder traversal function
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    // Method to search for a value in the BST
    public boolean search(int value) {
        return searchRec(root, value);
    }

    // Recursive search function
    private boolean searchRec(Node root, int value) {
        // Base cases: root is null or value is present at the root
        if (root == null)
            return false;
        if (root.value == value)
            return true;

        // Value is greater than root's value
        if (value > root.value)
            return searchRec(root.right, value);

        // Value is smaller than root's value
        return searchRec(root.left, value);
    }

    // Method to find the minimum value node
    public int minValue() {
        return minValueRec(root);
    }

    // Recursive function to find the minimum value node
    private int minValueRec(Node root) {
        Node current = root;
        // loop down to find the leftmost leaf
        while (current.left != null)
            current = current.left;
        return current.value;
    }

    // Method to delete a value from the BST
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    // Recursive function to delete a node
    private Node deleteRec(Node root, int value) {
        // Base case: If the tree is empty
        if (root == null)
            return root;

        // Otherwise, recur down the tree
        if (value < root.value)
            root.left = deleteRec(root.left, value);
        else if (value > root.value)
            root.right = deleteRec(root.right, value);
        else {
            // node with one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder successor (smallest in the right subtree)
            root.value = minValueRec(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }

    // Main method to test the BST
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traversal of the BST:");
        bst.inorder(); // Expected output: 20 30 40 50 60 70 80

        System.out.println("\n\nSearch for 40 in BST: " + bst.search(40)); // Expected: true
        System.out.println("Search for 90 in BST: " + bst.search(90)); // Expected: false

        System.out.println("\nMinimum value in the BST: " + bst.minValue()); // Expected: 20

        bst.delete(20);
        System.out.println("\nInorder traversal after deleting 20:");
        bst.inorder(); // Expected output: 30 40 50 60 70 80
    }
}
