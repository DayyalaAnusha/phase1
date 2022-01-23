package lab1;
public class Exercise9 {
	void result(int N)
	{    
		int sum = 0;
	    // iterate from 0 to N
	    for (int num = 0; num < N; num++)
	    {    
	        // pipe operator is used for OR Condition
	        if (num % 3 == 0 || num % 5 == 0)
	        {
	        	sum = sum + num;
	        }
	    }
	    System.out.println(sum);
	}

}