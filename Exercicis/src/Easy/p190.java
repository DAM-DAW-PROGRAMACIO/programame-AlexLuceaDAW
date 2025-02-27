package Easy;

import java.util.Scanner;

public class p190 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		long num=sc.nextInt();
		long den = sc.nextInt();
	
		
		while(!(num<den)) {
			long resultat=1;
				for (long i=den+1; i<=num; i++) {
				resultat *=i;
				}	
			
			
			
			System.out.println(resultat);
			num=sc.nextInt();
			den = sc.nextInt();
		}
		sc.close();
	}

}
