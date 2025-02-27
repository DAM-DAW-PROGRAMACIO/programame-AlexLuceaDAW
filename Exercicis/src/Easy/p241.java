package Easy;

import java.util.Scanner;

public class p241 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos  = sc.nextInt();
		
		
		for(int i=0; i <casos; i++) {
			
			String resposta="";
			int hojas = sc.nextInt();
			
			if(hojas < 3 || hojas == 5)
				resposta = "IMPOSIBLE";
			else if(hojas%3==0)
				resposta="0";
			else if(hojas%3==1)
				resposta="1";
			else if(hojas%3==2)
				resposta="2";
			
			System.out.println(resposta);
		}
		sc.close();
	}

}
