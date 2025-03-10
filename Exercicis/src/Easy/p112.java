package Easy;

import java.util.Scanner;

public class p112 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double metres;
		double kmh;
		double segons;
		
		double metresSegon;
		
		metres = (double)sc.nextInt();
		kmh = (double)sc.nextInt();
		segons = (double)sc.nextInt();

		while(!(metres == 0 && kmh == 0 && segons == 0)) {
			
			if(metres <= 0 || kmh <= 0 || segons <= 0 ) {
					System.out.println("ERROR");
			}else {
				
				metresSegon = 1.0d*kmh * 1000 /3600;
				if(1.0*metres/segons <= metresSegon) {
					System.out.println("OK");
				}else if(1.0*metres/segons >= metresSegon*1.2d) {
					System.out.println("PUNTOS");
				}else {
					System.out.println("MULTA");
				}
			}
			
			metres = sc.nextInt();
			kmh = sc.nextInt();
			segons = sc.nextInt();
		}
		sc.close();
	}

}
