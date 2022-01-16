package phase1;
class product{
	int productNumber;
	String productName;
	double ProductCost;
	
	int productnumber() {
		return productNumber;
	}
	String ProductName() {
		return productName;
	}
	double ProductCost() {
		return ProductCost;
	}
	

    
	
}

public class returntypes {
	
	

	public static void main(String[] args) {
		product p1=new product();
		 p1.productNumber=10;
		 p1.productName="five Star";
		 p1.ProductCost=5.5;
		 System.out.println("productnumber:"+p1.productnumber());
		 System.out.println("productname:"+p1.ProductName());
		 System.out.println("productcost:"+p1.ProductCost());
		 
		 System.out.println("------------------------------");
		 product p2=new product();
		 p2.productNumber=20;
		 p2.productName="ice cream";
		 p2.ProductCost=30.5;
		 
		 System.out.println("productnumber:"+p2.productnumber());
		 System.out.println("productname:"+p2.ProductName());
		 System.out.println("productcost:"+p2.ProductCost());

	       

	      

	}

	
	}


