package Prova_2;

import java.util.Scanner;

public class p350 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		while(n1 != 0 && n2 != 0) {
			double r = Math.floor((n1*n2)*10/2);
			System.out.println(r/10);
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}
		sc.close();
	}

}
