package Easy;

import java.util.Scanner;

public class p682 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int casos; 
		int patos;
		
		casos = sc.nextInt();
		
		for(int i = 0; i < casos; i++) {
			
			patos = sc.nextInt();
			
			System.out.println(patos + " " + patos*2);
		}
		sc.close();
	}

}
