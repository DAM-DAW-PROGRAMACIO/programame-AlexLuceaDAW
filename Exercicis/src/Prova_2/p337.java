package Prova_2;

import java.util.Scanner;

public class p337 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for(int i=0; i<casos; i++) {
			boolean mal = false;
			
			int array1 [] = new int [6];
			int array2 [] = new int [6];
			
			for(int j=0; j<6; j++) {
				array1[j] = sc.nextInt();
			}
			for(int k=0; k<6; k++) {
				array2[k] = sc.nextInt();
			}
			
			 
			int suma = array1[0]+array2[0];
			
			for(int h = 1; h<6; h++) {
				if(array1[h]+array2[h] != suma) {
					mal = true;
					break;
				}
			}
			
			if(mal)
				System.out.println("NO");
			else
				System.out.println("SI");
		}
	}

}
