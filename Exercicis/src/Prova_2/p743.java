package Prova_2;

import java.util.Scanner;

public class p743 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		while (casos > 0) {
			int sum = 0;
			int ahorro = 0;
			for(int i=0; i<casos; i++) {
				int doc = sc.nextInt();
				ahorro = doc / 2;
				sum = sum + ahorro;
			}
			
			System.out.println(sum);
			casos = sc.nextInt();
		}
	}

}
