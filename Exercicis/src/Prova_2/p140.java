package Prova_2;

import java.util.Scanner;

public class p140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine().trim();
		
		while(Integer.parseInt(line)>=0) {
			
			int suma = 0;
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < line.length()-1; i++) {
				
				int n = Integer.parseInt(Character.toString((line.charAt(i))));
				suma += n;
				sb.append(n);
				sb.append(" + ");
			}
			
			suma += Integer.parseInt(Character.toString((line.charAt(line.length()-1))));
			
			sb.append(line.charAt(line.length()-1));
			sb.append(" = ");
			sb.append(suma);
			System.out.println(sb.toString().trim());
			
			line = sc.nextLine().trim();
		}
		sc.close();
	}

}
