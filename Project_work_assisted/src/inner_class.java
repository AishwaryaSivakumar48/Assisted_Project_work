
public class inner_class {

private String msg="Executing the inner Classes concept";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner obj=new Inner();  
  obj.msg();  
 }  

 
public static void main(String[] args) {
	inner_class  obj=new inner_class ();  
	obj.display();  
	}
}
