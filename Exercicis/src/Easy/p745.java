package Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class p745 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		
		while(!sc.hasNextInt(0)) {
			ArrayList<Integer>codi = new ArrayList<Integer>();
			String frase = "";
			while(!sc.hasNextInt(0)) {
				
				int num =sc.nextInt();
				while(num>27) {
					num = num-27;
				}
				char caracter = (char)(num + 100);
				
				frase = frase + ""
				codi.add(sc.nextInt());
			}
		}
		sc.close();
	}

}
