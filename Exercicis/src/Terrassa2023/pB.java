package Terrassa2023;

import java.util.Scanner;

public class pB {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			int any1 = sc.nextInt();
			int any2 = sc.nextInt();
			
			int marc29 = 0;
			int marc28Traspas = 0;
			
			for (int j = any1; j <= any2; j++) {
				if (j % 400 == 0 || j % 400 == 0 && j % 100 == 0 || j % 4 == 0 && j % 100 != 0)
					marc28Traspas++;
				else
					marc29++;
			}
			System.out.println(marc29 + " " + marc28Traspas);			
		}
		sc.close();
	}

}
