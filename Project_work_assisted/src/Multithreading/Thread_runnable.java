package Multithreading;

class Thread_runnable implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++)
		System.out.println("The value of i :"+ i);
	}
	
	public static void main(String[] args) {
		Thread_runnable obj=new Thread_runnable();
		Thread t=new Thread(obj);
		t.start();

	}

}

