package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p400D_dubte {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linia = br.readLine();
		
		
		while(linia!=null) {
			int contador = 0;
			int maximEspai =-1;
			int cicles = (linia.length())-1;
			while(cicles >= 0)
			{
				if(linia.charAt(cicles)=='.') {
					while(linia.charAt(cicles)=='.') 
					{
					contador++;
					if (cicles>0)
						cicles--;
					else
						break;
					}
					if(contador == 1 ||contador == 2)
						maximEspai = 0;
					else
						if(maximEspai<contador)
							maximEspai=contador;
					contador = 0;
				}
				cicles--;
			}
			System.out.println(maximEspai);
			linia=br.readLine();
		}
	}

}
