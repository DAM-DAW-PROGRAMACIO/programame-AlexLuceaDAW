package Easy;


import java.util.HashSet;
import java.util.Scanner;


public class p416 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc =new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		
		String linia = sc.next();
		
		while(!linia.equals("0")) 
		{	
			int casos = Integer.parseInt(linia);
			
			HashSet<String> sortedDates = new HashSet<String>();
			String aniversari;
			String resposta="NO";
			String data;
				
			for(int i=0; i < casos; i++) {
				data = sc.next();
				aniversari = data.substring(0, data.length()-4);
				
				if(!sortedDates.add(aniversari))
					resposta = "SI";
			}
			
			System.out.println(resposta);
			
			linia = sc.next();
		}
	}

}
