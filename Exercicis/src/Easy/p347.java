package Easy;

import java.util.Scanner;

public class p347 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		
		while(!sc.hasNext("0")) {
			
			int base = sc.nextInt();
			int altura = sc.nextInt();
			
			int mesgran;
			int contador = 0;
			if(base==altura)
				contador=1;
			else if(base>altura){
				mesgran = base;
				
				while(altura >=10 && base >=10 && base!=altura) {
					if(Math.sqrt(base))
					base-=altura;
					contador++;
				}
			}else {
				mesgran = altura;
				
				while(altura >=10 && base >=10 && base!=altura) {
					altura-=base;
					contador++;
				}
			}
			System.out.println(contador);
			
		}
		sc.close();
	}

}
