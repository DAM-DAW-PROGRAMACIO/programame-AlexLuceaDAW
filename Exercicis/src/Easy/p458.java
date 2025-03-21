package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class p458 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		while(casos > 1) {
			
			Long num[] = new Long[casos];
			Long maxNum;
			Long maxMinNum;
			for(int i=0; i < casos; i++) {
				num[i]=sc.nextLong();
			}
			
			Arrays.sort(num);
			
			maxNum = num[0]*num[1];
			maxMinNum = num[num.length-2] * num[num.length-1];
			if(maxNum > maxMinNum)
				System.out.println(maxNum);
			else
				System.out.println(maxMinNum);
			
			casos=sc.nextInt();
		}
		sc.close();
	}

}
