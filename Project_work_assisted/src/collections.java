import java.util.ArrayList;

public class collections {

	public static void main(String[] args) {
		
	   ArrayList<Integer>arrlist=new ArrayList<Integer>();
	   arrlist.add(3);
	   arrlist.add(15);
	   arrlist.add(29);
	   arrlist.add(90);
	   arrlist.add(1);
	   arrlist.add(56);
	   
	   if(arrlist.contains(56)) {
		   System.out.println("found in the list");
	   }
	   else {
		   System.out.println(" not found in the list");
	   }

		
	}

}
