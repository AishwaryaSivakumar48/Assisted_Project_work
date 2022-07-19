class Default_A_Specifier{
	void display()
	{
		System.out.println("Default Access specifer executed");
	}
}
class Private_A_Specifier{
	private void display1()
	{
		System.out.println("Private Access specifer executed");
	}
}
class Public_A_Specifier{
	public void display2() {
		System.out.println("Public Access Specifier executed");
	}
}
class Protected_A_Specifier extends Default_A_Specifier{
	protected void display3() {
		System.out.println("Protected access specifier ");
	}
}
public class Access_Modifiers {

	public static void main(String[] args) {
		
		Default_A_Specifier obj = new Default_A_Specifier();
		obj.display();
		Protected_A_Specifier obj1=new Protected_A_Specifier();
		obj1.display3();
		Public_A_Specifier obj2=new Public_A_Specifier();
		obj2.display2();
		
		

	}

}
