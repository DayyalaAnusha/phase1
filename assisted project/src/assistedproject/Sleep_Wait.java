package assistedproject;
class Customer{  
	 int amount=20000;  
	   
	 	synchronized void withdraw(int amount){  
	 	System.out.println("going to withdraw...");  
	 	  
	 		if(this.amount<amount)
	 		{  
	 		System.out.println("Less balance; waiting for deposit...");  		
	 		try{
	 			wait();
	 		   }
	 		catch(Exception e){}  
	 		}  
	 		this.amount-=amount;  
	 		System.out.println("withdraw completed...the lefft over amount is"+ this.amount);  
	 	}  
	   
	 	synchronized void deposit(int amount){  
	 		System.out.println("going to deposit...");  
	 		this.amount+=amount;  
	 		
	 		System.out.println("deposit completed... " + this.amount);  
	 		notify();  //unlocking of thread
	 	}  
	 }  
	   

public class Sleep_Wait extends Thread
{
	 public void run(){  
		  for(int i=1;i<5;i++){  
		    try{
		    		Thread.sleep(3000);  // 2000 miliseconds = 2 secs
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
		  }  
		 }  


		
		 public static void main(String args[]){  
		  Sleep_Wait t1=new  Sleep_Wait ();  
		  t1.setName("Java");
		  t1.setPriority(MAX_PRIORITY); 
		  
		  Sleep_Wait  t2=new  Sleep_Wait ();  
		  t2.setName("Python");
		  
		  Sleep_Wait  t3=new  Sleep_Wait (); 
		  t3.setName("Oracle");
		  
		  Sleep_Wait t4=new  Sleep_Wait (); 
		  t4.setName("C++");
		   
		  t1.start();  
		  t2.start();  
		  t3.start();
		  t4.start();
		  
		  System.out.println(t1.getState());
		  System.out.println(t3.getState());
		  System.out.println(t2.getState());
		  
		   
		  final Customer c=new Customer();  	
			 		
			 		new Thread(){                 // anonymous class
			 		  public void run()
			 		  {
			 			c.withdraw(6000);
			 		  }  
			 		}.start(); 
			 		new Thread(){                 // anonymous class
			 			  public void run()
			 			  {
			 				c.withdraw(5000);
			 			  }  
			 			}.start(); 
			 		new Thread(){                 // anonymous class
			 				  public void run()
			 				  {
			 					c.withdraw(20000);
			 				  }  
			 				}.start(); 
			 		
			 		new Thread(){  
			 		  public void run()
			 		   {
			 			 c.deposit(30000);
			 		   }  
			 		}.start();    
			 	}
			 
		 }  
