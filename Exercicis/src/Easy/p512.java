package Easy;

import java.util.Scanner;

public class p512 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			int conejo = sc.nextInt();
			int caballo = sc.nextInt();
			int total = conejo + caballo;
			
			int result = conejo * 100 / total;
			
			System.out.println(result);
		}
		sc.close();
	}

}
