package collectionstypes;
import java.util.*; 
public class linkedhashset {

	public static void main(String[] args) {
	
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("123");  
		set.add("roja");  
		set.add("vani");  
		set.add("chinna");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		  
		
	}

}
