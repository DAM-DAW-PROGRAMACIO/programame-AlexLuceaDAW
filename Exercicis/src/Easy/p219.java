package Easy;

import java.util.Scanner;

public class p219 {

	public static void main(String[] args) throws Exception{
		
	Scanner sc = new Scanner(System.in);
		
	
		
		int casos = sc.nextInt();
		
		for(int j = 0; j<casos; j++){
			
			int nDecimos = sc.nextInt();
			
			int numDecimos[]= new int[nDecimos];
			int contador = 0;
		
			for(int i=0; i<nDecimos; i++) {
				
				numDecimos[i]= sc.nextInt(); 
			}
			for(int num: numDecimos) {
				if(num%2==0)
					contador++;
			}
			
			System.out.println(contador);
			
		}
		sc.close();
	}

}
