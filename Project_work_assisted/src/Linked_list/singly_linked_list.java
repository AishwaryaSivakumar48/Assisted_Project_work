package Linked_list;

public class singly_linked_list {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {

		Node newNode = new Node(data);

		if (head == null) {

			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;
			// newNode will become new tail of the list
			tail = newNode;
		}
	}

	// deleteFromStart() will delete a node from the beginning of the list
	public void deleteFromStart() {

		// Checks if the list is empty
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			// Checks whether the list contains only one node
			// If not, the head will point to next node in the list and tail will point to
			// the new head.
			if (head != tail) {
				head = head.next;
			}
			// If the list contains only one node
			// then, it will remove it and both head and tail will point to null
			else {
				head = tail = null;
			}
		}
	}

	// display() will display all the nodes present in the list
	public void display() {
		// Node current will point to head
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (current != null) {

			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		singly_linked_list sList = new singly_linked_list();

		sList.addNode(1);
		sList.addNode(2);
		sList.addNode(3);
		sList.addNode(4);

		System.out.println("Original List: ");
		sList.display();

		while (sList.head != null) {
			sList.deleteFromStart();

			System.out.println("Updated List: ");
			sList.display();
		}
	}
}
