package phase1;
class person{
	public void display() {


	}
}
public class anonymousinnerclass {
       static person obj=new person() {
    	   public void display() {
    		System.out.println("hi,how are you");  
    	   }
       
       };
	public static void main(String[] args) {
		obj.display();

	}

        
}
