package Easy;

import java.util.Scanner;

public class p492 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		
		while(!(n==0 && d==0 && n==0)) {
			int start=0;
			if(m>d) {
				if(m%d == 0)
					start= m;
				else
					start = m*d; 

			}
			else if (m<d)
			{
				if(d%m == 0)
					start= d;
				else
					start = m*d; 
			}
			else
				start = m;
			
			int contador = n/start;
			
			
			System.out.println(contador);
			 m = sc.nextInt();
			 d = sc.nextInt();
			 n = sc.nextInt();
		}
		sc.close();
	}

}
