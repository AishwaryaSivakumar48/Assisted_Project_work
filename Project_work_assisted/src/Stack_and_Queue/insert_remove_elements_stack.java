package Stack_and_Queue;

public class insert_remove_elements_stack {

	  private int arr[];
	  private int top;
	  private int capacity;
	  insert_remove_elements_stack(int size) {
	    arr = new int[size];
	    capacity = size;
	    top = -1;
	  }

	  public void push(int x) {
	    if (isFull()) {
	      System.out.println("Stack OverFlow");
	      System.exit(1);
	    }
	    System.out.println("\npushing " + x);
	    arr[++top] = x;
	  }

	  // pop elements from top of stack
	  public int pop() {

	   
		  System.out.println("\npopping " );
	    if (isEmpty()) {
	      System.out.println("STACK EMPTY");
	      
	      System.exit(1);
	    }

	    // pop element from top of stack
	    return arr[top--];
	  }

	  // return size of the stack
	  public int getSize() {
	    return top + 1;
	  }

	  // check if the stack is empty
	  public Boolean isEmpty() {
	    return top == -1;
	  }

	  // check if the stack is full
	  public Boolean isFull() {
	    return top == capacity - 1;
	  }

	  // display elements of stack
	  public void printStack() {
	    for (int i = 0; i <= top; i++) {
	      System.out.print(arr[i] + " ");
	    }
	  }

	  public static void main(String[] args) {
		  insert_remove_elements_stack stack = new insert_remove_elements_stack(6);

	    stack.push(10);
	    stack.push(20);
	    stack.push(30);

	    System.out.print("Stack: ");
	    stack.printStack();

	    // remove element from stack
	    stack.pop();
	    stack.pop();
	    stack.push(40);
	    stack.push(50);
	    
	    System.out.println("\nAfter popping out");
	    stack.printStack();

	  }
	}
