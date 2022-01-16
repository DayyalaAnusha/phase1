package phase1;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
public class regularexpression {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);  
	        while (true) {    
	            System.out.println("Enter  the expression pattern:");  
	            Pattern pattern = Pattern.compile(sc.nextLine());    
	            System.out.println("Enter the text:");  
	            Matcher matcher = pattern.matcher(sc.nextLine());    
	            boolean find = false;    
	            while (matcher.find()) {    
	                System.out.println("java learning");    
	                find = true;    
	            }    
	            if(!find){    
	                System.out.println("No match found.");    
	            }    
	        }    
	}

}
