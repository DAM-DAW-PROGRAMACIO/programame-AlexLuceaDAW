package Easy;

import java.util.Scanner;

public class p511 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		String linia = sc.next();
		
		
		while(!linia.isEmpty()) {
			int na = Integer.parseInt(linia);
			int nb = sc.nextInt();
			
			StringBuilder sba = new StringBuilder();
			StringBuilder sbb = new StringBuilder();
			
			for(int i = 0; i < na ; i++) {
				int naa = sc.nextInt();
				int av = sc.nextInt();
				
				for(int j = 0; j < naa; j++) {
					sba.append(av);
				}
			}
			
			for(int i = 0; i < nb ; i++) {
				int nbb = sc.nextInt();
				int bv = sc.nextInt();
				
				for(int j = 0; j < nbb; j++) {
					sba.append(bv);
				}
			}
			
			int n = sba.length()/2;
			
			int total = 0;
			String sa = sba.toString();
			String sb = sbb.toString();
			for(int i = 0; i < n; i++) {
				total += Integer.parseInt(Character.toString(sa.charAt(i)))*Integer.parseInt(Character.toString(sb.charAt(i)));
			}
			
			System.out.println(total);
			linia=sc.next();
		}
		sc.close();
	}

}
