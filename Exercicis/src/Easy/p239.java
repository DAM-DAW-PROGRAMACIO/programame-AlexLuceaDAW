package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p239 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int dies;
		int emisores;
		int sTotals;
		
		dies = sc.nextInt();
		emisores = sc.nextInt();
		
		while(!(dies == 0 && emisores==0)) {
			
			int d = 0;
			int h = 0;
			int m = 0;
			int s = 0;
			
			sTotals = dies*24*6*emisores;	
	
			d = sTotals/(3600*24);
			sTotals = sTotals%(3600*24);
			h = sTotals/3600;
			sTotals = sTotals%3600;
			m=sTotals/60;
			s = sTotals%60;
			if(d>1000) {
				d=1000;
				h=59;
				m=59;
				s=59;
			}
				
		
			System.out.format("%d:%02d:%02d:%02d\n",d,h,m,s);
			dies = sc.nextInt();
			emisores = sc.nextInt();
		}
		
	}
}
