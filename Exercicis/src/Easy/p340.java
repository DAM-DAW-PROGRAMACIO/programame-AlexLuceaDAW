package Easy;

import java.util.Scanner;

public class p340 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		int altura;
		int base;
		int cerillas;
		
		while(casos > 0) {
			
			base = sc.nextInt();
			altura = sc.nextInt();
			
			cerillas = (base+1)*altura + (altura+1)*base;
			
			System.out.println(cerillas);		
			
			casos--;
		}
		sc.close();
	}

}
