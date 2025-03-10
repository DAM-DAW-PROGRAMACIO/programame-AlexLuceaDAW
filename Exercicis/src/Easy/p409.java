package Easy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p409 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int casos;
		int nNivel;
		int nColla;
		int a1, a2;

		
		casos = sc.nextInt();
		
		for(int i = 0; i<casos; i++){
			
			int nivells = 0;
			nNivel = sc.nextInt();
			nColla = sc.nextInt();			
			int altures[] = new int[nColla];
			boolean fila = true;
			
			for(int j = 0 ; j < nColla; j++) {
				altures[j] = sc.nextInt();
			}
			
			Arrays.sort(altures);
			
			int contador=0;
			
			while(contador < nColla-(nNivel-1)) {
				
				if(altures[contador+(nNivel-1)] - altures[contador] <= 15) {
					nivells++;
					contador+=nNivel;
				}else
					contador++;
			}
			
			System.out.println(nivells);
		}
		sc.close();
	}

}
