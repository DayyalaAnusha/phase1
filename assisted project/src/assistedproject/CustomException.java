package assistedproject;
public class CustomException
{
	static void performance(int salary)throws PerformanceException
	{
	if (salary<2200)
		throw new PerformanceException("you need to work hard");
	else if(salary>2200 && salary<6000)
		throw new PerformanceException("your salary is some how good");
	else if(salary>5200 && salary<10000)
		throw new PerformanceException("your salary is very good");
	else
		System.out.println("invalidamount");
}
public static void main(String[] args) {
	try {
		performance(5300);
	}
	catch(Exception e)
	{
		System.out.println("Exception occured:"+e.getMessage());
	}
	finally
	{
		System.out.println("finally block executed");
	}
}

}
class PerformanceException  extends Exception{
PerformanceException(String e){
	super(e);
}


}
