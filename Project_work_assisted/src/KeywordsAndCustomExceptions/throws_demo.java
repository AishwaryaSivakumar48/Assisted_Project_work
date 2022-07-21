package KeywordsAndCustomExceptions;

public class throws_demo{  
	   void mtd1() throws ArithmeticException{  
		throw new ArithmeticException("Invalid"); 
	   }  
	   void mtd2() throws ArithmeticException{  
		mtd1();  
	   }  
	   void mtd3(){  
		try{  
		   mtd2();  
		}
		catch(ArithmeticException e){
		   System.out.println("ArithmeticException carried out");
		}  
	   }  
	   public static void main(String args[]){  
		   throws_demo obj=new throws_demo();  
		obj.mtd3();  
		System.out.println("Program Terminated");  
	   }  
	}