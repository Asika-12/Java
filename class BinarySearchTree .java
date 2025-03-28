class BinarySearchTree {
	static class Node {
		int data;
		Node left,right;
	public Node(int item) {
		data = item;
		left = right =null;
	}
}
Node root;
Public BinarySearchTree() {
	root = null;
}
public Node insert(Node root,int key) {
	if (root==null) {
		root = new Node(key);
		return root;
	}
if(key<root.data) {
	root.left =insert(root.left,key);
} else if(key>root.data) {
	root right =insert(root.right,key);
}
	return root;
}
public Boolean search(Node root,int key) {
if(root == null) {
	return false;
}
if(root.data == key){
 return true;
}
if(key>root.data) {
	return search(root.right,key);	
}
return search(root.left,key);
}
public void inorder(Node root) {
if(root! = null) {
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
	}
}
public static void m,ain(String[]args) {
	BinarySearchTree tree = new BinarySearchTree();
	tree.root = tree.insert(tree.root,50);
	tree.root = tree.insert(tree.root,30);
	tree.root = tree.insert(tree.root,20);
	tree.root = tree.insert(tree.root,40);
	tree.root = tree.insert(tree.root,70);
	tree.root = tree.insert(tree.root,60);
	tree.root = tree.insert(tree.root,80);
System.out.print("Inorde traversal of the BST:");
tree.inorder(tree.root);
System.out.println();
int KeyToSearch=40;
System.out.println("Searching for node with key:" + KeyToSearch);
if(tree.search(tree.root,KeyToSearch)) {
	System.out.println("Node with key"+keyToSearch +"found");
} else {
	System.out.println("Node with Key"+LeyToSearch+ "found");
} else {
System.out.println("Node with key"+KeyToSearch+"notfound");
KeyToSearch=90;
System.out.println("Searching for node with key:"+KeyToSearch);
if(treesearch(tree root,KeyToSearch)) {
	System.out.println("nodes with key"+ keyToSearch)+found");
} else {
	System.out.println("Node with key"+keyToSearch+"Not found");
}
}
}

	
	




















	