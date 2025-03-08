package Easy;

import java.util.Scanner;

public class p344 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		for(int i =0; i < casos; i++) {
			
			int cables = sc.nextInt();
			int contadorH = 0;
			int contadorM = 0;
			String resposta;
			for(int j =0; j<cables; j++) {
				String cable = sc.next();
				
				if(cable.charAt(0) == 'H' || cable.charAt(1) == 'H')
					contadorH++;
				if(cable.charAt(0) == 'M' || cable.charAt(1) == 'M')
					contadorM++;
					
			}
			
			if(contadorH == contadorM)
				resposta = "POSIBLE";
			else
				resposta = "IMPOSIBLE";
			
			System.out.println(resposta);
			
		}
		sc.close();
	}

}
