package Terrassa2023;

import java.util.Scanner;
import java.util.Stack;

public class pE {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		long casos = sc.nextLong();
		
		
		while(casos > 0) {
			
			for (int i = 0; i < casos; i++) {
				
				Stack<String> frase = new Stack<String>();
				Stack<String> undos = new Stack<String>();
				String palabra = sc.next();
				
				while(!palabra.equals(".")) {
					
					if (!palabra.equals(">") && !palabra.equals("<")) {
						frase.add(palabra);
						undos.clear();
					}
					else if (palabra.equals("<")) {
						undos.push(frase.lastElement());
						frase.pop();
					}
					else {
						frase.push(undos.lastElement());
						if (undos.size() > 1)
							undos.pop();
					}
					
					palabra = sc.next();
				}
					
				StringBuilder sb = new StringBuilder("");
					
				for (int j = 0; j < frase.size(); j++) {
						
					sb.append(" ");
					sb.append(frase.get(j));
				}
					
				System.out.println((sb.toString()).trim());
				sc.nextLine();
			}
			casos = sc.nextLong();
		}
		sc.close();
	}

}
