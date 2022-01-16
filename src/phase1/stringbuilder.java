package phase1;

public class stringbuilder {

	public static void main(String[] args) {
		 String str="rani";
	        StringBuilder str1=new StringBuilder(str);
	        str1.append( " vani");
	        str1.replace(0,5, "rani");
	        System.out.println(str1);
	}

}
