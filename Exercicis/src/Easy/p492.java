package Easy;

import java.util.Scanner;

public class p492 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		
		while(m!=0 && d!=0 && n!=0) {
			
			long mcd = 0;
			long start=0;
			
			if(m==d)
				System.out.println(n/m);
			else {
				
				long major = Math.max(m, d);
				long menor = Math.min(m, d);
				
				long a = major;
				long b = menor;
				while(b!=0) {
					mcd = b;
					b = a%b;
					a = mcd;
				} 
				
				start =major*(menor/mcd);

				long contador = n/start;
				
				
				System.out.println(contador);
				
			}
			
			
			 m = sc.nextInt();
			 d = sc.nextInt();
			 n = sc.nextInt();
		}
		sc.close();
	}

}
