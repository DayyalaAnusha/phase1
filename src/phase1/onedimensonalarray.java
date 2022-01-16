package phase1;

public class onedimensonalarray {

	public static void main(String[] args) {
		int[ ] num = new int[6];
		 num[0] = 20;
		 num[1] = 60;
		 num[2] = 20;
		 num[3] = 40;
		 num[4] = 6;
		 num[5] = 55;
		 
		Float avg = 0.0f;
		int sum = 0;
		
         for(int i = 0; i < 6; i++)
		     sum  = sum + num[i];
		     avg = (float)sum/6;
		  System.out.println("Sum of six numbers: " +sum);
		  System.out.println("Average of six numbers: " +avg);


	}

}
