
package Stack_and_Queue;
import java.util.Queue;
import java.util.LinkedList;



public class insert_remove_element_queue {

	public static void main(String[] args) {
		Queue<String> StudentsQueue = new LinkedList<>();
		                StudentsQueue.add("Karan");
		                StudentsQueue.add("Pavi");
		                StudentsQueue.add("Divya");
		                StudentsQueue.add("Gautam");
		                StudentsQueue.add("Nive");
		System.out.println("Queue is : " + StudentsQueue);
		        		System.out.println("Head of Students : " + StudentsQueue.peek());
		        		StudentsQueue.remove();
		        		System.out.println("After removing Head of students : " + StudentsQueue);
		        		System.out.println("Size of Queue : " + StudentsQueue.size());
		    	}
}
