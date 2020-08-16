
public class exe2 {
  
	public static void main(String[] args) {
		
		int[] A = new int[5];
		int[] B = new int[5];
		int[] C = new int[5];
	int soma = 0 ;
	 
	for(int i=0; i<A.length; i++){
		A[i]= i;
	}
	 
	for(int i=0; i<B.length; i++){
		B[i]= i;
	}
	
	for(int i=0; i<C.length; i++){
		C[i] = ( A[i] + B[i]);
		System.out.println("soma :"+C[i]);
	}
	
	
}
}
