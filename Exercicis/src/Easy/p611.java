package Easy;


import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class p611 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int sirAny;
		int casos;
	
		while(sc.hasNext()) {
			
			TreeMap<Integer, String> llibres = new TreeMap<>();			
			sirAny = sc.nextInt();
			sc.nextLine();
			casos = sc.nextInt();	
			int any;
			String llibre;
			
			for(int i = 0; i < casos; i++) {	
				any = sc.nextInt();
				llibre = sc.nextLine();
				
				if(any>=sirAny) {
					llibres.put(any, llibre);
				}
				
			}
			
			if(llibres.size() == casos) {
				System.out.println("TODAS");
			}else if(llibres.size() == 0)
				System.out.println("NINGUNA");
			else {
				System.out.println(llibres.get(llibres.firstKey()).trim());
			}

		}
		sc.close();
	}

}
