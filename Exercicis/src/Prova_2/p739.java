package Prova_2;

import java.util.Scanner;

public class p739 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for(int i=0; i<casos; i++) {
			
			int paretAncho = sc.nextInt();
			int paretAlto = sc.nextInt();
			int a1,a2;
			int b1,b2;
			int resposta;
			
			a1 = Math.max(paretAncho, paretAlto);
			a2 = Math.min(paretAncho, paretAlto);
			
			int azulejoAncho = sc.nextInt();
			int azulejoAlto = sc.nextInt();
			
			b1 = Math.max(azulejoAncho, azulejoAlto);
			b2 = Math.min(azulejoAncho, azulejoAlto);
			
			
			int paretA1 = (int)Math.ceil(1.0*a1/b1);
			
			int azulA1 = (int)Math.ceil(1.0*a2/b2);
			
			int paretA2 =  (int)Math.ceil(1.0*a1/b2);
			
			int azulA2 = (int)Math.ceil(1.0*a2/b1);
			
			resposta = paretA2*azulA2;
			
			if(paretA1*azulA1 > paretA2*azulA2) {
				resposta = paretA2*azulA2;
			}else if(paretA1*azulA1< paretA2*azulA2){
				resposta = paretA1*azulA1;
			}
			
			System.out.println(resposta);
			
		}
		sc.close();
	}

}
