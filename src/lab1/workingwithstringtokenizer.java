package lab1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class workingwithstringtokenizer {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the all integer number : ");
		                        String num=input.nextLine();
		                        StringTokenizer token=new StringTokenizer(num);
		                        int num1=0,sum=0;
		                        System.out.println("enter the number : ");
		                        while(token.hasMoreTokens())
		                        {
		                                    String s=token.nextToken();
		                                    num1=Integer.parseInt(s);
		                                    System.out.print(num1+" ");
		                                    sum=sum+num1;
		                        }
		                        System.out.println();
		                        System.out.println("Sum is : "+sum);
		            }
		

	}


