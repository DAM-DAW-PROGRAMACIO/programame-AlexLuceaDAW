package Easy;

import java.util.Scanner;

public class p688 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
			
		while(sc.hasNext()) {
			int alturaSeguit =sc.nextInt();
			int alturaQualsevol = sc.nextInt();
			int numPeldaños = sc.nextInt();
			
			int inici = sc.nextInt();
			int primer = sc.nextInt();
			int diferencia = primer-inici;
			
			boolean tropiezo = false;
			
			int diferenciaPeldaño = 0;
			int diferenciaTotal = 0;
			int contador = 0;
			
			while(contador < numPeldaños-1 && !tropiezo) {
				int peldaño = sc.nextInt();
				diferenciaPeldaño = Math.abs((peldaño-primer)-diferencia);
				diferenciaTotal += diferenciaPeldaño;
				
				if(diferenciaPeldaño> alturaSeguit|| diferenciaTotal>alturaQualsevol) {
					tropiezo = true;
					sc.nextLine();
				}
				else {
					primer = peldaño;
					contador++;
				}
			}
			if(tropiezo)
				System.out.println("Tropiezo");
			else
				System.out.println("OK");
		}
		sc.close();
	}

}
