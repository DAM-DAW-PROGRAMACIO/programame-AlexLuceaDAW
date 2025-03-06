package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p345 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		String linia = sc.nextLine();
		
		
		int casos = Integer.parseInt(linia);
		int files[][] = new int [9][9];

		
		for(int i = 0; i < casos; i++) {
			
			String resposta = "SI";
			
			int comprovarFiles[] = {0,0,0,0,0,0,0,0,0,0};
			int comprovarColumnes[]= {0,0,0,0,0,0,0,0,0,0};
			int comprovarGrups[] = {0,0,0,0,0,0,0,0,0,0};
			
			linia = sc.nextLine();
			
			String arrayLinia[] = linia.split(" ");
			
			for(int x = 0; x < 9; x++) {
				for(int y = 0; y <9; y++) {
					files[x][y] = Integer.parseInt(arrayLinia[y]);
				}	
			}
			
			for(int x = 0; x < 9; x++) {
				for(int y = 0; y <9; y++) {
					comprovarFiles[files[x][y]]++;
					comprovarColumnes[files[y][x]]++;	
					
					if(comprovarFiles[files[x][y]] > 1 || comprovarColumnes[files[y][x]] > 1) {
						resposta = "NO"; 
						continue;
					}
				}
				for(int z = 0; z <9; z++) {
					comprovarFiles[z] = 0;
					comprovarColumnes[z]= 0;
				}
				

			}//grup1
			for (int x= 0; x <3; x+=3) {
				for(int y= 0; y <3; y+=3) {	
					for(int j = 0; j<3; j++) {
						for(int k = 0; k <3; k++) {
							if(comprovarGrups[files[j+x][k+y]] >1) {
								resposta = "NO"; 
								continue;
							}
						}
					
					}
				}
				for(int z = 0; z <9; z++) {
					comprovarGrups[z] = 0;
				}
			}		
			System.out.println(resposta);
			linia = br.readLine();
		}
	}

}
