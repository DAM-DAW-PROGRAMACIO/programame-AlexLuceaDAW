package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class p684 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int numFila = 0;
		int celesFila;
		
		int celesTotals = 1;
		int num = sc.nextInt();	
		
		int contador = 1;
		if(num == 1) {
			numFila = 0;
		}else {
			
		
			while(true) {
				
				int celesFiles = 6* contador;
				celesTotals += celesFiles;
				
				if(!(celesTotals<num)) {
					numFila = contador;
					break;
				}else {
					contador++;
				}
				
			}
			
			for
		
		}
		System.out.println(numFila);
		
		/*for(int i = 0; i< numFila; i++) {
		
		
		
		for(int j = 0;  j < celesFiles; j++) {
			
			if(num == celesTotals -celesFiles) {
				
			}
		}*/
			
					
		
		//}
	}

}
