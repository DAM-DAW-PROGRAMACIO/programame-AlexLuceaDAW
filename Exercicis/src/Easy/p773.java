package Easy;

import java.util.Scanner;

public class p773 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int limit = sc.nextInt();
		int tipus = sc.nextInt();
		
		
		while(!(limit==0 && tipus == 0)) {
			
			int max[] = new int [tipus];
			int qBandeja[] = new int [tipus];
			int sumaBandeja =0; 
			String resposta = "SI";
			
			for(int i=0; i<tipus;i++) {
				max[i]= sc.nextInt();
			}
			for(int i = 0; i<tipus; i++) {
				qBandeja[i] = sc.nextInt();
				sumaBandeja = sumaBandeja + qBandeja[i];
			}
			
			if(sumaBandeja > limit)
				resposta ="NO";
			else {
				
				for(int i= 0; i<tipus; i++) {
					if(qBandeja[i]>max[i]) {
						resposta = "NO";
						break;
					}
				}
			}
			
			
			System.out.println(resposta);
			limit = sc.nextInt();
			
			tipus = sc.nextInt();
		}
		sc.close();
	}

}
