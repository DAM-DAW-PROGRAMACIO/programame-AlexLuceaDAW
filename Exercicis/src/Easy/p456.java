package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p456 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linia = br.readLine();
		int amplada;
		int altura;
		int quadTableta;
		int necesaris;
		int quantitat=0;
		String arrayLinia[];
		int contador;
		contador = Integer.parseInt(linia);
		
		for (int i = 0; i < contador; contador++){
			
			linia=br.readLine();
			arrayLinia = linia.split(" ");
			
			amplada = Integer.parseInt(arrayLinia[0]);
			altura = Integer.parseInt(arrayLinia[1]);		
			necesaris=Integer.parseInt(arrayLinia[2]);
			
			if(altura != 0)
				quadTableta = amplada*altura;
			else
				quadTableta = amplada;
			
			quantitat = necesaris/quadTableta;
			
			if(necesaris%quadTableta == 0) {
				quantitat = necesaris/quadTableta;
			}else
				quantitat = necesaris/quadTableta+1;
			
			System.out.println(quantitat);
		} br.close();
	}

}
