/*2.2.1  Writing a program in Java to verify the implementations of constructor types
2.2.2 Executing the program and verifying constructors
2.2.3 Pushing the code to your GitHub repositories*/

public class Constructors{  
    int id;  
    String name;  
    
    Constructors(int i,String n){  // parameterized constructor
    id = i;  
    name = n;  
    }  
    
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    
    	Constructors obj1 = new Constructors(101,"Abi");  
    	Constructors obj2 = new Constructors(102,"Aryan");  
    //calling method to display the values of object  
    obj1.display();  
    obj2.display();  
   }  
}  
