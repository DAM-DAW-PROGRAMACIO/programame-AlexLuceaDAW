package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p456 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for(int i = 0; i <casos; i++) {
			int base = sc.nextInt();
			int altura = sc.nextInt();
			
			int necesaris = sc.nextInt();
			int quadTableta;
			int quantitat;
			
			if(altura != 0)
				quadTableta = base*altura;
			else
				quadTableta = base;
			
			quantitat = necesaris/quadTableta;
			
			if(necesaris%quadTableta == 0) {
				quantitat = necesaris/quadTableta;
			}else
				quantitat = necesaris/quadTableta+1;
			
			System.out.println(quantitat);
			
		} sc.close();
	}

}
