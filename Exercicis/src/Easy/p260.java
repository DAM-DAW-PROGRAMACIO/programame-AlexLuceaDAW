package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class p260 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 0; i<casos; i++) {
			
			String resposta = "SI";
			
			String linia1=sc.nextLine().toLowerCase().replaceAll("\\s","");
			
			String linia2 = sc.nextLine().toLowerCase().replaceAll("\\s","");
			
			if(linia1.length()==linia2.length()) {
				
				char array1[] = linia1.toCharArray();
				char array2[] = linia2.toCharArray();
				
				Arrays.sort(array1);
				Arrays.sort(array2);
				
				for(int j=0; j<linia1.length(); j++) {
					if(array1[j] != array2[j]) {
						resposta = "NO";
						break;
					}
				}
			
			}else {
				resposta ="NO";
			}
			
			System.out.println(resposta);

		}
		sc.close();
	}

}
