package Easy;

import java.util.Scanner;

public class p518 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		
		String linia = sc.nextLine();

		while(!linia.equals("0.00")) {
			
			String arrayLinia[] = linia.split("\\.");
			String resposta;
		
			int mes = Integer.parseInt(arrayLinia[0]);
			int dia = Integer.parseInt(arrayLinia[1]);
			
			if(mes==1 || mes==3|| mes==5|| mes==7|| mes==8|| mes==10|| mes==12) {
				if(dia>31 || dia<1)
					resposta="NO";
				else
					resposta="SI";
				
			}else if(mes==4 || mes==6|| mes==9|| mes==11) {
				if (dia>30 || dia<1)
					resposta="NO";
				else
					resposta="SI";
			}else if(mes==2) {
				if (dia>28 || dia<1) 
					resposta="NO";
				else 
					resposta="SI";
			}else
				resposta="NO";		
			
			System.out.println(resposta);
			linia = sc.nextLine();
			}
			sc.close();	
	
		
	}

}
