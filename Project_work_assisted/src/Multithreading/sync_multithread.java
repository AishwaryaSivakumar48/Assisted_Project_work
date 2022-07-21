package Multithreading;

class Sender 
{ 
  public void msg(String message)
  { 
    System.out.println(" Sending "  + message);
    try
    { 
      Thread.sleep(2000); 
    } 
    catch (Exception e) 
    { 
      System.out.println("Thread interruption occured"); 
    } 
    System.out.println("Sent :" +message);
  }
} 

class SendUsingThreads extends Thread 
{ 
  private String message; 
  Sender sender; 
  
  SendUsingThreads(String msg, Sender object)
  { 
    message = msg;
    sender = object; 
  } 
  public void run() 
  { 
    
    synchronized(sender) 
    { 
      // synchronizing the send object 
      sender.msg(message);
    } 
  } 
} 

public class sync_multithread
{ 
  public static void main(String args[]) 
  { 
    Sender sender = new Sender(); 
    SendUsingThreads sender1 = new SendUsingThreads("Hello",sender);
SendUsingThreads sender2 =  new SendUsingThreads("Experimenting Synchronization",sender);
SendUsingThreads sender3 =  new SendUsingThreads("Synchronization demonstrated succesfully",sender);
 
    sender1.start(); 
    sender2.start(); 
    sender3.start();
    // wait for threads to end 
    try
    { 
      sender1.join(); 
      sender2.join(); 
      sender3.join();
    } 
    catch(Exception e) 
    { 
      System.out.println("Interrupted"); 
    } 
  } 
} 



