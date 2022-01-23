package lab1;
import java.util.Scanner;

	public class Exersice11 {
		
		public static void main(String[]args) {
			Scanner scn =new Scanner (System.in);
			int no = scn.nextInt();
			int cur =no%10;
			no=no/10;
			boolean state = true;
			while(no !=0) {
				if(cur<no%10) {
					state = false;		
					}
		cur =no%10;
		no =no/10;
			}
			System.out.println(state);
		}
		
	}
		
