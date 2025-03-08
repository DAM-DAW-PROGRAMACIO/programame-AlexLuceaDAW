package Easy;

import java.util.Scanner;

public class p635 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		for(int i = 0; i < casos; i++) {
			
			int any = sc.nextInt();
			
			int segle = any/100;
			int afegir = any%100;
			
			if(afegir>0)
				segle++;
			
			System.out.println(segle);
		}
		sc.close();
	}

}
