package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p462 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linia = br.readLine();
		
		long casos = Integer.parseInt(linia);
		int vegades;
		String info[];
		String temps;
		long h,m,s;
		long d;
		long sTotals;
		long tTemps;
		
		for(int i = 0; i<casos; i++){
			linia=br.readLine();
			info = linia.split(" ");
			
			vegades = Integer.parseInt(info[0]);
			temps = info[1];

			
			sTotals = Integer.parseInt(temps.split(":")[0])*3600 + Integer.parseInt(temps.split(":")[1])*60 + Integer.parseInt(temps.split(":")[2]);
			
			tTemps = sTotals * vegades;
			
			d = tTemps/(3600*24);
			tTemps= tTemps%(3600*24);
			h = tTemps/3600;
			tTemps=tTemps%3600;
			m=tTemps/60;
			s=tTemps%60;
			
			System.out.format("%d %02d:%02d:%02d\n",d, h, m, s);
			
		}
	}

}
