	package Prova_2;
	
	import java.util.Scanner;
	
	public class p742 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			Scanner sc = new Scanner(System.in);
			
			int casos = sc.nextInt();
			sc.nextLine();
			for(int i=0; i<casos; i++) {
			
				int zeroT = 0;
				int cont = 0;
				String balas = sc.nextLine();
				
				for(int j = 0; j < balas.length()-1; j++) {
					
					int n = Integer.parseInt(Character.toString(balas.charAt(j)));
					if(n == 0) {
						zeroT++;
						if(Integer.parseInt(Character.toString(balas.charAt(j+1))) == 0)
							cont++;
					} 
				}
				
				int n = Integer.parseInt(Character.toString(balas.charAt(balas.length()-1)));
				if(n == 0) {
					zeroT++;
					if(Integer.parseInt(Character.toString(balas.charAt(0))) == 0)
						cont++;
				}
				
				double chances = 1.0*cont/(double) zeroT;
				double chancesM = (1.0*balas.length() - zeroT)/(double) balas.length();
				
				if(zeroT == balas.length())
					System.out.println("Da igual");
				else if(chances > chancesM)
					System.out.println("No girar");
				else if(chances < chancesM)
					System.out.println("Girar");
				else
					System.out.println("Da igual");
			}
			sc.close();
		}
		
	}
