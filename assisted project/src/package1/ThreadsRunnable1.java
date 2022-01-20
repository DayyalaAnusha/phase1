package package1;

public class ThreadsRunnable1  implements Runnable
{  
	
	public  void run()
	{  
		System.out.println("thread is running...");  
	}  
	  
	public static void main(String args[])
	{  
	
		ThreadsRunnable1 m1=new ThreadsRunnable1();       
		Thread t1 = new Thread(m1);                     
		t1.start();                                     
	}  
}  
