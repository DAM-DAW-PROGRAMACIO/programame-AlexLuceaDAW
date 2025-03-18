package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p746 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		String linia = br.readLine();
		
		
		while(!(linia.equals("0 0"))) {
			
			int nGuirnaldas = Integer.parseInt(linia.split(" ")[0]);
			int dParedes = Integer.parseInt(linia.split(" ")[1]);
			
			String tamanoG [] = new String [nGuirnaldas];
			int contador = 0;
			
			
			tamanoG = br.readLine().split(" ");
			
			for(int i=0; i<nGuirnaldas; i++) {
				for(int j=i+1; j<nGuirnaldas; j++){
					if(Integer.parseInt(tamanoG[i])+Integer.parseInt(tamanoG[j])==dParedes) {
						contador++;
					}
				}
			}
			
			System.out.println(contador);
			
			linia = br.readLine();
			
		}
		sc.close();
	}

}
