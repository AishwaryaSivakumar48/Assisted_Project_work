
public class Type_Casting {

	public static void main(String[] args) {
System.out.println("Implicit Type Casting");
		
		char a= 'G';
		
		int x= a;
		System.out.println("value of G as int:"+x);
		
		float y = x;
		System.out.println("value of G as float:"+y);
		
		long l = (long)y;
		System.out.println("value of G as long:"+l);
		
		double z = l;
		System.out.println("value of G as double:"+z);
		
		System.out.println('\n');
		
		System.out.println("Explicit Type Casting");
		
		double d= 84.6;
		int doubleToint=(int)d;
		System.out.println("Double to Int :"+ d + " -> " + doubleToint);
		
		int i = 100;
		char intTochar=(char)i;
		System.out.println("Int to Char :"+ i + " -> " + intTochar);

	}

}
