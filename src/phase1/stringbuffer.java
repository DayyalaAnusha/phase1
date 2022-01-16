package phase1;

public class stringbuffer {

	public static void main(String[] args) {
		String s="ravi";
		StringBuffer s1=new StringBuffer(s);
        s1.append(" reddy");
        s1.replace(0,5,"raju ");
        System.out.println(s1);
       
        
	}

}
