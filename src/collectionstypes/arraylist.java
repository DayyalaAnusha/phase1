package collectionstypes;
import java.util.*; 
public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); 
		list.add("Ravi");  
		list.add("pavani");  
		list.add("rani");  
		list.add("raju");  
		  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		

	}


