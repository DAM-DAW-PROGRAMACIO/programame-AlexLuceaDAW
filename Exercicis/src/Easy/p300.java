package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p300 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linia = br.readLine();
		int casos = Integer.parseInt(linia);
	
		linia =br.readLine();
		for(int j =0; j < casos; j++ ) {	
			
			
			int vocals [] = {0,0,0,0,0};
			int contadorVocals=0;
				
			for(int i=0; i < linia.length();i++) {
				 if((linia.charAt(i)) == 'a')
					 vocals[0]++;
				 else if((linia.charAt(i))=='e')
					 vocals[1]++;
				 else if((linia.charAt(i))=='i')
					 vocals[2]++;
				 else if((linia.charAt(i))=='o')
					 vocals[3]++;
				 else if((linia.charAt(i))=='u')
					 vocals[4]++;	

			}	
			for (int i= 0; i < vocals.length; i++) {
				if(vocals[i]>=1) {
					contadorVocals++;
				}
			}
			if(contadorVocals==5) 
				System.out.println("SI");
			else
				System.out.println("NO");
			
			linia=br.readLine();
		}
	}

}
