package Terrassa2023;

import java.util.Scanner;

public class pC {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		for(int i = 0; i<casos; i++) {
			String resultat;
			Long num = sc.nextLong();
			
			if(num != 5) {
				Long primerNum = num/10;
				Long numFinal = primerNum*(primerNum+1);
				
				resultat = numFinal + "25";
			}else
				resultat="25";
			
			System.out.println(resultat); 
			
		}
		sc.close();
	}

}
