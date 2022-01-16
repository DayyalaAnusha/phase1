package phase1;
 class persons{
	 String names;
	 persons(String persons){
		 persons=persons;
		 System.out.println(persons+":its a human");
	 }
 }

public class parameterizedconstructor {

	public static void main(String[] args) {
		persons p1=new persons("haritha");
		persons p2=new persons("kavitha");
		

	}

}
