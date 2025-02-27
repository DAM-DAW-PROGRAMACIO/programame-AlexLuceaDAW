package Easy;

import java.util.Scanner;


public class p335 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		long altura;
		int casos = sc.nextInt();
		
		
		
		for(int i=0; i<casos; i++) {
			altura = sc.nextInt();
			long bolasFila = 0;
			long bolesFiles = 0;
			
			for(long j = 1; j <= altura; j++) {	
				bolasFila +=j;
				bolesFiles += bolasFila;
			}
			System.out.println(bolesFiles);
			
		}
		sc.close();
	}

}
