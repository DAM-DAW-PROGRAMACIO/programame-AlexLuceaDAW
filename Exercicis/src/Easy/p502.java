package Easy;

import java.util.Scanner;

public class p502 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			
				int casos = sc.nextInt();
				int contador = 1; 
				
				String linia[] = sc.nextLine().split(" ");
				int tamanys [] = new int[casos];
				
				for(int i=0; i <linia.length; i++) {
					tamanys[i] = Integer.parseInt(linia[i]);
				}
				
				for(int i = 0; i< tamanys.length-1; i++) {
					if(tamanys[i]<tamanys[i+1])
						contador++;
				}
				
				int tamany = sc.nextInt();
					int tamany2 = sc.nextInt();
					
					if(tamany < tamany2)
						contador++;
			
			linia=sc.nextLine();
		}
		sc.close();
	}

}
