package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p462pocho {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		long casos = Integer.parseInt(line);
		
		for (int i = 0; i < casos; i++) {
			
			line = br.readLine();
			String entrada[] = line.split(" ");
			int netejes = Integer.parseInt(entrada[0]);
			String temps[] = entrada[1].split(":");
			
			long segonsTotals = netejes * (Integer.parseInt(temps[0]) * 3600 + Integer.parseInt(temps[1]) * 60 + Integer.parseInt(temps[2]));
			
			long dies = segonsTotals / (3600 * 24);
			segonsTotals= segonsTotals % (3600 * 24);
			
			long hores = segonsTotals / 3600;
			segonsTotals= segonsTotals %3600;
			
			long minuts = segonsTotals / 60;
			long segons = segonsTotals % 60;
			
			System.out.format("%d %02d:%02d:%02d\n", dies, hores, minuts, segons);
		}
	}
}
