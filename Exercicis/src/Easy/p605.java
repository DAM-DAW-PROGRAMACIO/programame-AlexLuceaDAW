package Easy;

import java.util.Scanner;

public class p605 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		
		String linia = sc.nextLine();
		
		
		while(!linia.equals(".")) {
			
			int contadorV=0;
			int contadorI=0;
			
			for(int i=0; i<linia.length()-1; i++) {
				if(linia.charAt(i) == 'V')
					contadorV++;
				else if(linia.charAt(i) == 'I')
					contadorI++;
			}
			
			if(contadorI == contadorV)
				System.out.println("EMPATE");
			else if(contadorI > contadorV)
				System.out.println("INVIERNO");
			else
				System.out.println("VERANO");
			 		
			linia=sc.nextLine();
		}
		sc.close();
	}

}
