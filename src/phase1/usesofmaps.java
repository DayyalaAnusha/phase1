package phase1;
import java.util.*; 
public class usesofmaps {

	public static void main(String[] args) {
		

        Map<String, Integer> map = new HashMap<>();
 

        map.put("raju",10);

        map.put("laya", 30);

        map.put("vani",20);
 

         for (Map.Entry<String, Integer> e : map.entrySet())
 

         System.out.println(e.getKey() + " "+ e.getValue());
	
         Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	     ht.put(40,"rani");  
	      ht.put(50,"Roja");  
	      ht.put(60,"pavani");  
	      ht.put(70,"vasu");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());
	      }
	       Map<String, Integer> map1 = new TreeMap<>();
	       
             map1.put("vikcy",1 );

	        map1.put("payal",2);

	        map1.put("junnu", 3);


	         for (Map.Entry<String, Integer> e : map1.entrySet())
	 
	         {
	         System.out.println(e.getKey() + " "+ e.getValue());



	         }
	}}

