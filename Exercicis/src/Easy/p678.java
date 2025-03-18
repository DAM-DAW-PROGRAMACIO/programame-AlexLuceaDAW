package Easy;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class p678 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);	
		
		String linia1 = sc.nextLine().trim();
		
		while(!linia1.equals(".")) {
			
			boolean trobat = false;
			boolean ahorcado = false;
			int contador=0;
			String linia2=sc.nextLine().trim();
			
			LinkedHashSet<Character> paraula = new LinkedHashSet<Character>();
			LinkedHashSet<Character> intents = new LinkedHashSet<Character>();
			
			for(int i = 0; i <linia1.length(); i++) {
				paraula.add(linia1.charAt(i));
			}
			
			for(int i = 0; i <linia2.length(); i++) {
				paraula.add(linia2.charAt(i));
			}
			
			for(char prova : intents) {
				if(!paraula.contains(prova)) {
					contador++;
					if(contador>=7) {
						ahorcado = true;
						break;
					}
						
				}else {
					paraula.remove(prova);
					if(paraula.isEmpty()) {
						trobat = true;
						break;
					}
				}
			}
			
			if(ahorcado)
				System.out.println("AHORCADO");
			else if(trobat)
				System.out.println("SALVADO");
			else
				System.out.println("COLGANDO");
		
			linia1 = sc.nextLine().trim();

			
		}
		sc.close();
	}

}
