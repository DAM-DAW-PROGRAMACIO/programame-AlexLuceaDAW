package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p764 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String liniaNumCam = br.readLine();
		
		int numCam = Integer.parseInt(liniaNumCam);	
		int contador = 0;
		
		while(numCam != 0 ) {
			
			
			for(int i = 0; i < numCam; i++) {
				String linia[] = br.readLine().split(" ");
				int numAnells = Integer.parseInt(linia[0]);
				contador +=numAnells;
				
				numAnells = Integer.parseInt(linia[1]);
				if(numAnells != 0)
					contador-=numAnells;
			}
			System.out.println(contador);
			contador = 0;
			liniaNumCam = br.readLine();
			numCam = Integer.parseInt(liniaNumCam);	
		}
	}

}
