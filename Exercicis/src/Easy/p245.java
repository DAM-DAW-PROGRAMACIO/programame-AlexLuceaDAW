package Easy;

import java.util.Scanner;

public class p245 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		long nHermanos; 
		long n1;
		long n2;

		nHermanos = sc.nextLong();
				
		while(nHermanos != 0) {
			
			String dalton="DALTON";
			
			n1 = sc.nextLong();
			n2 = sc.nextLong();
			
				if(n1<n2) {
					nHermanos--;
					n1 = n2;
					
				while (nHermanos>1) {
						n2 = sc.nextLong();
						
						if (n1 >= n2) {
							dalton = "DESCONOCIDOS";				
							sc.nextLine();
							break;
						}else {
							nHermanos--;
							n1=n2;
						}
							
					}
				}else if(n1>n2) {
					nHermanos--;
					n1 = n2;
					while(nHermanos >1) {
						
						n2 = sc.nextLong();
						
						if (n1 <= n2) {
							dalton = "DESCONOCIDOS";				
							sc.nextLine();
							break;
						}
						else {
							nHermanos--;
							n1=n2;
						}
					}
				}else {
					dalton = "DESCONOCIDOS";				
					sc.nextLine();
				}
			
			System.out.println(dalton);
				
			nHermanos = sc.nextLong();
		}
		
		sc.close();
		System.exit(0);

	}	
	
}


