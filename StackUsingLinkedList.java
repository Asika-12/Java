class StackNode {
	int data;
	StackNode next;
	StackNode(int data) {
		this.data=data;
		this.next=null;
	}
}
class Stack {
	private StackNode top;
	public Stack() {
		this.top = null;
	}
	public void push(int data) {
		Stack Node newNode = new StackNode(data);
	if(top==null) {
		top=newNode;
	} else {
		newNode.next=top;
		top=newNode;
}
	System.out.println(data+"pushed to stack");
	}
public int pop() {
	if(isEmpty()) {
	System.out.println("Stack underflow");
		return-1;
	}
	int poppedData = top.Data;
	top=top.next;
	return poppedData;
}
public int peek() {
	if(isEmpty()) {
	System.out.println("Stack is empty");
		return-1;
	}
	return top.data;
}
public boolean isEmpty() {
	return top == null;
}
}
public void display() {
	if(isEmpty()){
	System.out.println("Stack is Empty");
		return-1;
	}
	StackNode.current=top;
	System.out.print("Stack element:");
	while(current!=null)
	{
	System.out.print(current.data+" ");
		current=current.next;
	}
	System.out.println();
	}
	}
public class StackUsingLinkedList {
	public static void main(String[]args){
		Stack stack=new Stack();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.display();
			System.out.print("Top element is:"+stack.peek());
			System.out.println("Top element is:"+Stack.peek());
			System.out.println(Stack.pop()+"popped from stack");
			Stack.display();
	}
}


	




 