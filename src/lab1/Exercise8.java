package lab1;
public class Exercise8 {

	public static int getSecondSmallest (int[]a, int total) {
	int temp;  
	for (int i = 0; i < total; i++)   
	        {  
	            for (int j = i + 1; j < total; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        }  
	       return a[1]; 
	} 
public static void main(String[] args) {
	int a[]={1,2,3,4,5};  
	int b[]={44,66,67,78,33,22};  
	System.out.println("Second smallest: "+getSecondSmallest(a,5));  
	System.out.println("Second smallest: "+getSecondSmallest(b,6));
}
}
