package Prova_2;

import java.util.Scanner;

public class p744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			int temps = sc.nextInt();
	
			int missatge = 0;
			int passat = temps; 
			
	
			while(sc.hasNextInt()) {
				int end = sc.nextInt();
				if (end == 0)
					break;
				if(end <= passat)
					missatge++;
				passat += passat+temps;
			}
			
			System.out.println(missatge/2);
		}
		
		sc.close();
	}

}
