package Easy;


import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class p105 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		String linia = sc.nextLine();
		
		while(!linia.equals("-1")) {
			TreeMap<Integer, Double> ventesDia = new TreeMap<Integer, Double>();
			
			for(int i=0; i<6;i++) {
				ventesDia.put(i, Double.parseDouble(sc.nextLine()));
			}
			
			double dinersMinDia = ventesDia.firstKey();
			double dinersMaxDia = ventesDia.lastKey();
			
			int valorMinDia = ventesDia.get(dinersMinDia);
			int valorMaxDia = ventesDia.get(dinersMaxDia);
			
			String dia1="";
			String dia2="";
			String resposta;
			
			if(valorMinDia==0)
				dia1="MARTES";
			else if(valorMinDia==1)
				dia1="MIERCOLES";
			else if(valorMinDia==2)
				dia1="JUEVES";
			else if(valorMinDia==3)
				dia1="VIERNES";	
			else if(valorMinDia==4)
				dia1="SABADO";
			else if(valorMinDia==5)
				dia1="DOMINGO";
			
			if(valorMaxDia==0)
				dia2="MARTES";
			else if(valorMaxDia==1)
				dia2="MIERCOLES";
			else if(valorMaxDia==2)
				dia2="JUEVES";
			else if(valorMaxDia==3)
				dia2="VIERNES";	
			else if(valorMaxDia==4)
				dia2="SABADO";
			else if(valorMaxDia==5) {
				dia2="DOMINGO";
			}
			if(valorMaxDia==5)
				resposta = "SI";
			else
				resposta="NO";
			
			if(dinersMaxDia==dinersMinDia)
				resposta="EMPATE";
				
			
			System.out.println(dia2 + dia1 + resposta);
			
			linia=sc.nextLine();
		}
		sc.close();
	}

}
