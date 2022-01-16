package collectionstypes;
import java.util.*; 
public class hashset {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("raju");  
		set.add("Roja");  
		set.add("rani");   
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  

	}

	}
}
