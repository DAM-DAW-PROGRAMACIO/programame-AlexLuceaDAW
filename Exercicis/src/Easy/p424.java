package Easy;

import java.util.Scanner;

public class p424 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int moviments = sc.nextInt();
	
		
		while(moviments>0) {
			int diners=0;
			int max=Integer.MIN_VALUE;
			for(int i= 0; i<moviments; i++) {
				diners += sc.nextInt();
				if(diners>max)
					max=diners;
			}
			System.out.println(diners + " " +max);
			moviments =sc.nextInt();
		}
		sc.close();
	}

}
