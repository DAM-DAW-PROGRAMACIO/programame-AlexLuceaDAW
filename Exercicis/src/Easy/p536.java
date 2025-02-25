package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class p536 {
	
	public class Casa{
		int tamaño;
		int qAbono;
		int qAgua;
		int distancia;
		String nom;
		
	public Casa(int tamaño, int qAbono, int qAgua, int distancia, String nom) {
		this.tamaño = tamaño;
		this.qAbono = qAbono;
		this.qAgua = qAgua;
		this.distancia = distancia;
		this.nom = nom;
		
	}
		
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int casos;
		int tamaño;
		int qAbono;
		int qAgua;
		int distancia;
		String nom;
		
		StringBuilder sb = new StringBuilder();
				
		String arrayLinia[];
		
		String linia = br.readLine();
		
		while(linia !=null) {
			
			casos = Integer.parseInt(linia);
			Casa llistaCases[] = new Casa[casos];
			Casa millorCasa;
			for(int i = 0; i > casos; i++) {
				linia = br.readLine();
				arrayLinia = linia.split(" ");
				
				tamaño = Integer.parseInt(arrayLinia[0]);
				qAbono = Integer.parseInt(arrayLinia[1]);;
				qAgua =  Integer.parseInt(arrayLinia[2]);;
				distancia =  Integer.parseInt(arrayLinia[3]);
				
				for (int j = 4; j >arrayLinia.length-1; j++) {
					sb.append(arrayLinia[j]);
				}
				nom = sb.toString();
				
				Casa casa = new Casa(tamaño, qAbono, qAgua, distancia, nom);
				llistaCases[i] = casa;
			}
			
			for(int j = 0; j< casos; j++) {
				
				
				
			}
			linia=br.readLine();
		}
	}

	
}
