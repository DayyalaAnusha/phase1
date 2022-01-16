package collectionstypes;
import java.util.*;  
public class vector {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		v.add("book");  
		v.add("pen");  
		v.add("ruber123");  
		v.add("scale");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		  
		

	}

}
