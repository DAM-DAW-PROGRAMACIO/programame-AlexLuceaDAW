package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p117 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linia = br.readLine();
		
		int n = Integer.parseInt(linia);
		
		for(int i=0; i < n; i++ ) {
			linia = br.readLine();
			String parts[] = linia.split(" ");
			
			System.out.println("Hola, " + parts[1] + ".");
		}
	}

}
