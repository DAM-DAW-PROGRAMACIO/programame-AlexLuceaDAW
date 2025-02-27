package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class p578 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		String linia = sc.nextLine();
		int casos;
		
		
		while(!linia.equals("0")) {
			
			HashSet<String> productes = new HashSet<String>();
			casos = Integer.parseInt(linia);
			int contador=0;
			for(int i=0; i<casos; i++) {
				linia = sc.nextLine().toUpperCase();
				if(productes.add(linia)) {
					contador++;
				}
			}
			System.out.println(contador);
			
			linia=sc.nextLine();
		}
		sc.close();
	}

}
