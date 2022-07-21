// Writing a program in Java by extending the Thread class
package Multithreading;

public class thread_demo extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("value of i : "+ i);
		}
	}
	public static void main(String[] args) {
		thread_demo obj=new thread_demo();
		obj.start();
}
}



