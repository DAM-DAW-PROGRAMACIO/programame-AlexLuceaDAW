package Easy;

import java.util.Scanner;

public class p514 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		while(sc.hasNext() && casos > 0) {
			
			int mesos[] = new int[casos];
			String out = "";
			for (int i = 0; i < casos; i++) {
				int contador = 0;
				mesos[i] = sc.nextInt();
				
				for (int j = 0; j < casos; j++) {
					
					if (mesos[i] < mesos[j])
						contador++;
					else contador = 0;
				}
				
				if (i < casos-1)
					out = out + contador + " ";
				else
					out = out + (contador);
			}
			
			System.out.println(out);
			
			casos= sc.nextInt();
			
			
		}
		sc.close();
	}

}
