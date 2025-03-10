package Easy;

import java.util.Scanner;

public class p107 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextInt();
		long errorMax = sc.nextInt();
		
		
		
		while(!(num==0 && errorMax==0)) {
			
			long error;
			
			error = 1/(long)Math.pow(10, errorMax);
			
			if(Math.abs(error)>num)
				System.out.println("Mayor");
			else if(Math.abs(error)<num)
				System.out.println("Menor");
			else 
				System.out.println("Igual");
			
			num = sc.nextInt();
			errorMax = sc.nextInt();
			
		}
		sc.close();
	}

}
