package phase1;

import java.util.Scanner;

public class stringasinputfromstringarray {

	public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   int number;
	   System.out.println("how many members are there in your home");
	   number=input.nextInt();
	   input.skip(System.lineSeparator());
	   String[] names=new String[number];
	   for(int i=0;i<number;i++) {
		   System.out.println("enter the names of family members"+(i+1));
		   names[i]=input.nextLine();
		   
	   }
	   System.out.println("your family members:");
	   for(int i=0;i<number;i++) {
		   System.out.println(names[i]);
	   
	}

}
}