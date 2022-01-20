package package1;
interface Drawable{  
	int salary = 100;
	void draw();  		
	void show();
}  

interface Shape{
	int salary = 200;
	void shape();  	
	void show();
}

interface Demo extends Shape{	
}
	
	public class Interfaces20 implements Shape, Drawable{
		
		int salary = 900;
		
		public void show(){
			System.out.println("inside show()");
		}

		@Override
		public void draw() {
			
			System.out.println("inside draw");
		}

		@Override
		public void shape() {
			
			System.out.println("inside shape");	
		}
		
		public static void main(String args[]){
			Interfaces20 obj = new Interfaces20();
			obj.shape();
			obj.show();
			obj.draw();
			
			Shape d = new Interfaces20();
			System.out.println(d.salary);
			
			System.out.println("salary  "+ obj.salary);		
		}
	}


