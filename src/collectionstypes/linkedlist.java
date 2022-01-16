package collectionstypes;
import java.util.*; 
public class linkedlist {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("shobha");  
		al.add("laya");  
		al.add("mouni");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 

	}

	}
}
