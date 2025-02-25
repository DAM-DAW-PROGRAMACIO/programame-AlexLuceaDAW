package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class p633 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int repetits = 0;
		int parelles =0;
		int solitaris = 0;
		int casos = sc.nextInt();
		HashSet<String> noRepetits = new HashSet<String>();
		
		while(casos != 0) {
			for(int i=0; i < casos; i++) {
				if(!noRepetits.add(sc.next())) 
					repetits++;;	
			}
			foreach()
						
			
			
			linia=br.readLine();
		}
	}

}
