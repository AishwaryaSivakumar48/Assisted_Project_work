
interface Interface1  
{  
public default void display()   
   {  
	System.out.println("the display() method of Interface1 ");  
  }  
}  
interface Interface2  
{  
public default void display()   
   {   
	System.out.println("the display() method of Interface2 ");  
   }  
}  
public class diamond_problem implements Interface1, Interface2  
   {  
public void display()   
  {  
	Interface1.super.display();  
	Interface2.super.display();  
  }  
public static void main(String args[])   
  {  
	diamond_problem obj = new diamond_problem();  
	obj.display();  
  }  
}  