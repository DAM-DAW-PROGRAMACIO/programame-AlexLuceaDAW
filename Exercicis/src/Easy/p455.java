package Easy;

import java.util.Scanner;

public class p455 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int entrades = sc.nextInt();
		int num;
		boolean trobat;
		int contador;
		int mcd;
		int numBo;
		
		for(int i = 0; i <entrades; entrades++){
			
			mcd = 1;
			contador = 2;
			trobat = false;
			
			num= sc.nextInt();
		
			
		while(!trobat) {
			if(num%contador == 0 && 100%contador == 0)
				trobat = true;
			else
				contador++;
		}
		
		while(!trobat) {
			if(num%contador !=0 || 100%contador != 0)
				trobat = true;
			else
				mcd = contador;
		}
		
		numBo =mcd;
		System.out.println(numBo);
		}
		
		sc.close();
		
	}
}
