package Easy;

import java.util.Scanner;

public class p608 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos= sc.nextInt();
		
		
		while(casos != 0) {
			boolean avis= false;
			int contador = 0;
			
			for(int i = 0; i < casos; i++) {
				int cas = sc.nextInt();	
				if(cas < 5) {
					if(!avis) {
						contador++;
						avis =true;
					}
				}else if(cas>6) {
					avis=false;
				}
			}
			System.out.println(contador);
			
			casos=sc.nextInt();
		}
		sc.close();
	}

}
