package Easy;

import java.util.Scanner;

public class p680 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		for(int i=0; i<casos; i++) {
			
			int longitudMax = sc.nextInt();
			int longitudSal = sc.nextInt();
			int retroces = sc.nextInt();
			int llego=0;
			int contador =0;
			
			if(longitudMax <= longitudSal) {
				System.out.println(1);
			}		
			else if(retroces >= longitudSal)
				System.out.println("IMPOSIBLE");
			else {
				while(!(llego>=longitudMax)) {
					llego +=longitudSal;
					
					if(llego>=longitudMax) {
						contador++;

					}else {
						llego-=retroces;
						contador++;
						
					}
				}
				
				System.out.println(contador);
			}

		}
		sc.close();
	}

}
