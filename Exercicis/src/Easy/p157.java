package Easy;

import java.util.Scanner;

public class p157 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		for(int i = 0; i<casos; i++) {
			
			int diesAny = 365;
			
			int dia = sc.nextInt();
			int mes = sc.nextInt();
			int resposta;
			
			if(mes==1) 
				resposta = diesAny-dia;
			else if(mes==2)
				resposta = diesAny-(dia+31);
			else if(mes==3)
				resposta= diesAny-(dia+31+28);
			else if(mes==4)
				resposta= diesAny-(dia+31*2+28);
			else if(mes==5)
				resposta = diesAny - (dia+31*2+28+30);
			else if(mes==6)
				resposta = diesAny -(dia+31*3+28+30);
			else if(mes == 7)
				resposta = diesAny -(dia+31*3+28+30*2);
			else if(mes==8)
				resposta = diesAny -(dia+31*4+28+30*2);
			else if(mes==9) 
				resposta = diesAny - (dia+31*5+28+30*2);
			else if(mes==10)
				resposta = diesAny - (dia+ 31*5 + 28 +30*3);
			else if(mes==11)
				resposta = diesAny - (dia +31*6 + 28 +30*3);
			else
				resposta = diesAny -(dia+31*6 + 28 + 30*4);
			
			System.out.println(resposta);
		}
		sc.close();
	}

}
