package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p164 {

	public static void main(String[] args) throws Exception{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linia = br.readLine();
		int base;
		int altura;
		
		
		while(true) {
			String liniaCoordenades[] = linia.split(" ");
		
			int arrayCoordenades[] = {(Integer.parseInt(liniaCoordenades[0])), (Integer.parseInt(liniaCoordenades[1])), (Integer.parseInt(liniaCoordenades[2])), (Integer.parseInt(liniaCoordenades[3])) };
			
			base = (arrayCoordenades[2] - arrayCoordenades[0]);
			altura = (arrayCoordenades[3] - arrayCoordenades[1]);
			
			if(base < 0 || altura < 0)
				break;
			else
				System.out.println(base * altura);
		
			linia=br.readLine();
		}
	}

}
