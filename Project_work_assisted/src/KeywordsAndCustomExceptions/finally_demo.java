package KeywordsAndCustomExceptions;

public class finally_demo {
	 public static void main(String args[]) {
	      try{  
		 int num=121/0;  
		 System.out.println(num);  
	      }  
	      catch(ArithmeticException e){
	         System.out.println("Number should not be divided by zero");
	      }  
	     
	      finally{
		 System.out.println("finally block");
	      }  
	      System.out.println("Excetued try,catch,finally");  
	   }   
		   
	}

