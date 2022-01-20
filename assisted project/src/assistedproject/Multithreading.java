package assistedproject;
public class Multithreading extends Thread
{
	 
		public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getPriority()); 
		   System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  
		   System.out.println("The thread group is:" + Thread.currentThread().getName()+ " :::" + Thread.currentThread().getThreadGroup()); 
		   System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); 
		   System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive()); 
		   System.out.println("Is my thread Daemon or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isDaemon()); 
		  }  
		
		 public static void main(String args[]){  
		  
		  Multithreading m1=new Multithreading();  
		  Multithreading m2=new Multithreading();  
		  Multithreading m3=new Multithreading();
		  
		  m1.setName("Anu");
		  m2.setName("ravi");
		  m3.setName("raju");
		 
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY);  
		  m3.setPriority(Thread.NORM_PRIORITY); 
		  
		  m2.setDaemon(true); 
		  
		  m1.start();  
		  m2.start();  
		  m3.start();
		   
		 }  
		}     

