import java.util.Scanner;

public class exe3 {
  public static void main(String[] args) {
	 
	  int[] A = new int[5];
	  int idade = 0;
	  int cont = 0;
	  Scanner entrada = new Scanner(System.in);
	 	    
	  for(int i=0; i < A.length; i++){
		  System.out.println("informe a idade :");
		  A[i] = entrada.nextInt();
			idade = A[i];		
		  }
	  
	  for(int i=0; i < A.length; i++){
		  if(A[i] > 35){
		 cont = cont +  1;	
		  }	
		 
		}
	  System.out.println("a quantidade de idades maior que 35 :"+cont);  
}
}
