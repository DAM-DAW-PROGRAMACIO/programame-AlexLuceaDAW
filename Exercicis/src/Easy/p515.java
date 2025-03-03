package Easy;

import java.util.Scanner;

public class p515 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int gots = sc.nextInt();
		
	
		
		while(gots!=0) {
			int viatges = 0;
			gots = gots-1;
			viatges++;
		
			while(gots!=0) {
				if(viatges%2==0) {
					gots--;
					viatges++;
				}else {
					if (gots%2==0) {
					gots= gots -2;
					viatges++;
					}else {
						gots--;
						viatges++;
					}
				}	
			}
			
			System.out.println(viatges);
			gots=sc.nextInt();
			
			
		}
		sc.close();
	}

}
