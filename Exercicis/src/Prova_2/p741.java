package Prova_2;

import java.util.Scanner;

public class p741 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for(int i = 0; i < casos; i++) {
			long pisos = sc.nextLong();
			long cartes = pisos * (pisos + 1) + ((pisos - 1) * pisos) / 2;
			System.out.println(cartes);
		}
		sc.close();
	}

}
