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
		TreeMap<Integer, String> llibres = new TreeMap<>();
		ArrayList<String> llibresBons = new ArrayList<>();
		while(true) {
			
			sirAny = sc.nextInt();
			sc.nextLine();
			casos = sc.nextInt();	

			for(int i = 0; i < casos; i++) {	
				llibres.put(sc.nextInt(), sc.nextLine());
			}
			for(Entry<Integer, String> Llibre: llibres.entrySet()) {
				int any = Llibre.getKey();
				String llibre = Llibre.getValue();
				
				if(any > sirAny)
					llibresBons.add(llibre);
			}
			
			
			if(llibresBons.size() == casos) {
				for(int i = 0; i < llibresBons.size(); i++) {
					System.out.print(llibresBons.get(i));
				}
			}else if(llibresBons.size() == 0)
				System.out.println("NINGUNA");
			else {
				System.out.print(llibresBons.get(0));
			}

		}
	}

}
