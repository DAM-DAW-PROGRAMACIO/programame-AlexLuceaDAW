package Easy;

import java.util.Scanner;

public class p242 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int paisos = sc.nextInt();
		
		
		while(paisos>0) {	
			int num = sc.nextInt();
			String linia[] = sc.nextLine().split(" ");
			int suma = 0;
			for(int i=0; i<paisos-1; i++) {
				suma = suma + Integer.parseInt(linia[i]);
			}
			
			System.out.println(Math.pow(num, suma));
		}
		sc.close();
	}

}
