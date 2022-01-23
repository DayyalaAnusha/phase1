package lab1;
import java.util.Scanner;
public class Exercise5 {
 public static void main (String[]args) {
	 Scanner input =new Scanner(System.in);
	 System.out.println("Input :");
	 int num =input.nextInt();
	 int sum =0;
	 while(num>0) {
		 int mod =num%10;
		 sum = sum +(int)Math.pow(mod,  3);
		 num = num/10;
	 }
	 System.out.println("Output: Sum of Digits Cube ="  +sum);
}
}