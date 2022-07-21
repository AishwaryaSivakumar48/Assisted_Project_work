package KeywordsAndCustomExceptions;

class CustomExp extends Exception {
	   String message;
	   CustomExp(String str) {
	      message = str;
	   }
	   public String toString() {
	      return ("Custom Exception Occurred : " + message);
	   }
	}
public class custom_exceptions {
	public static void main(String args[]) {
	      try {
	         throw new CustomExp("Custom Exception");
	      } catch(CustomExp e) {
	         System.out.println(e);
	      }
}
}

	