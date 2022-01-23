package lab1;

public class postivestring {
	   public static boolean isAlpha(String s)
	    {
	        if (s == null) {
	            return false;
	        }
	 
	        for (int i = 0; i < s.length(); i++)
	        {
	            char c = s.charAt(i);
	            if (!(c >= 'A' && c <= 'N') && !(c >= 'a' && c <= 'n')&&!(c>='U'&&c<='u')) {
	                return false;
	            }
	        }
	        return true;
	    }
	public static void main(String[] args) {
		  String s = "Anu";
	        System.out.println("IsAlpha: " + isAlpha(s));

	}

}
