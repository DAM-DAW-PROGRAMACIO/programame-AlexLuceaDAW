package Easy;

import java.util.Scanner;

public class p576 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int segons = sc.nextInt();
		
		
		while(segons > 0) {
			int def = sc.nextInt();
			int segonsTotals = 0;
			while(def>0) {
				segonsTotals = (segons * def) + segonsTotals;
				
				def=sc.nextInt();
			}
			
			int h, m, s;
			
			h = segonsTotals/3600;
			segonsTotals = segonsTotals%3600;
			m = segonsTotals/60;
			s = segonsTotals%60;
			
			if(s>59) {
				s=59;
				m++;
				if(m>59) {
					m=59;
					h++;
				}
			}
			
			System.out.format("%02d:%02d:%02d\n", h,m,s);
			segons=sc.nextInt();
		}
		sc.close();
	}

}
