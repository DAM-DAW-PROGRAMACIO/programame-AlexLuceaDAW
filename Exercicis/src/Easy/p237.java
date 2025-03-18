package Easy;

import java.util.Scanner;

public class p237 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNext()) {
			
			String linia = sc.nextLine();
			
			long longitud = linia.length();
			long num = Long.parseLong(linia.trim());
			
			boolean polidivisible = true;
			
			while(polidivisible && longitud>1){
				if(num%longitud == 0) {
					num = num/10;
					linia = Long.toString(num);
					longitud = linia.trim().length();
				}else {
					polidivisible = false;
				}
			}
			if(polidivisible)
				System.out.println("POLIDIVISIBLE");
			else
				System.out.println("NO POLIDIVISIBLE");
		}
		sc.close();
	}

}
