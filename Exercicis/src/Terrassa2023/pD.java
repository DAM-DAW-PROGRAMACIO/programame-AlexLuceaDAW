package Terrassa2023;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class pD {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		String paraula = sc.nextLine();
		
		
		while(!sc.hasNext(".")) {
			
			int contador=0;
			String resultat;
			String prova = sc.nextLine();
			LinkedHashSet<Character> jaja = new LinkedHashSet<>();
			
			for(char intent : prova.toCharArray()) {
				jaja.add(intent);
			}
			
			for(char intent: jaja) {
				if(paraula.contains(String.valueOf(jaja))){
					contador++;
				}
			}
			
			if(contador==(paraula.length())) {
				resultat = "SALVADO";
			}else if(paraula.length()-contador >=7)
				resultat = "AHORCADO";
			else
				resultat = "COLGADO";
			
			System.out.println(resultat);
		}
		sc.close();
	}

}
