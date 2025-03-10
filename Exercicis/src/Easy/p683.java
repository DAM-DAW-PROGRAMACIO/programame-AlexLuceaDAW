package Easy;

import java.util.Scanner;

public class p683 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		while(casos > 0) {
			
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			int posMax = -1;
			int posMin = -1;
			int dist;
			int arrayTemp[]=new int[casos];
			
			
			for(int i=0; i < casos; i++) {
				int num = sc.nextInt();
				arrayTemp[i] = num;
				if(num <= min) {
					min = num;	
				}
				if(num >= max) {
					max=num;
					posMax=i;
				}
				
				//arrayTemp[i] = /*String.valueOf*/sc.nextInt();	
			}	for(int j= 0; j <arrayTemp.length; j++) {
					if(min == arrayTemp[j])
						break;
				}
			
			System.out.format("%d %d %d\n", min, max, Math.abs(posMin-posMax));
			casos=sc.nextInt();
		}
		sc.close();
	}

}
