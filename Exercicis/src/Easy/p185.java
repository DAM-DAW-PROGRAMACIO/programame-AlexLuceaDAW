package Easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class p185 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = Integer.parseInt(sc.nextLine());
		
		
		while(casos>0) {
			
			TreeSet<String> si = new TreeSet<>();
			TreeSet<String> no = new TreeSet<>();
			for(int i =0; i < casos; i++) {
				String iniciador = sc.next();
			

				
				if(iniciador.equals("SI:")) {
					while(!sc.hasNext("FIN")) {
						si.add(sc.next());
					}
				}else if(iniciador.equals("NO:")) {
					while(!sc.hasNext("FIN")) {
						no.add(sc.next());
					}
				}
				sc.nextLine();
			}
			no.removeAll(si);
			StringBuilder sb = new StringBuilder();
			for(String ingredient : no) {
				sb.append(ingredient + " ");
			}
			
			System.out.println(sb.toString().trim());
			
			casos=Integer.parseInt(sc.nextLine());
		}
		sc.close();
	}

}
