package phase1;
class outer{
	int a=12;
	public void show() {
		System.out.println(a);
	
		
	}
	class inner{
		public void display() {
			System.out.println("something");
			
		}
  }
	}

public class innerclass {

	public static void main(String[] args) {
		outer obj=new outer();
		obj.show();
		outer.inner obj1=obj.new inner();
		obj1.display();
		
	         
	           
		
		}	

	}
