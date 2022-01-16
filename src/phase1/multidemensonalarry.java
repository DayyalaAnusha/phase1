package phase1;

public class multidemensonalarry {

	public static void main(String[] args) {
		
		int Array[][]= new int[4][2]; 
    	int i, j, k = 0; 
		for(i=0; i<4; i++) 
		for(j=0; j<2; j++){ 
		Array[i][j] = k; 
		k++; 
		} 
		for(i=0; i<4; i++){ 
			for(j=0; j<2; j++){
				System.out.print(Array[i][j] + " ");
			}
		System.out.println(); 
		
	}

	}
}
  