package Easy;

import java.util.Scanner;

public class p607 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		for(int i = 0; i<casos; i++) {
			int vegades = sc.nextInt();
			int contador=0; 
			
			if(vegades==1) {
				contador = 0;
			}
			else if(vegades==2)
				contador = 1;
			
			else if(vegades%Math.sqrt(vegades) !=0)
				contador = (int)Math.sqrt(vegades) + 1;
			else if(vegades%Math.sqrt(vegades) ==0)
				contador=(int)Math.sqrt(vegades);
			

			System.out.println(contador);
		}
		
		sc.close();
	}

}
