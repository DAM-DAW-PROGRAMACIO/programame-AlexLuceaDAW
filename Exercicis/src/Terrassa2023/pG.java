package Terrassa2023;

import java.util.Scanner;

public class pG {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int nVeces = sc.nextInt();
		
		while(sc.hasNextInt()) {
			int[] numeros = new int[nVeces];
			for(int i = 0; i < nVeces; i++) {
				numeros[i] = sc.nextInt();
			}
			Array.sort(numeros);
			int suma = numeros[nVeces-1];
			for(int i = nVeces-2; i > 1; i--) {
				if(numeros[i] >= numeros[i+1]) {
					while(numeros[i] >= numeros[i +1])
						numeros[i]--;
				}
				suma += numeros[i];
			}
			System.out.println(suma);
			nVeces = sc.nextInt();
		}
		sc.close();
	}

}
