package Easy;

import java.util.Scanner;

public class p772 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		String linia = sc.nextLine();
		
		
		while(!linia.equals("0 0")) {
			
			int any = Integer.parseInt(linia.split(" ")[0]);
			int pronostic = Integer.parseInt(linia.split(" ")[1]);

			System.out.println("["+(any+(74*pronostic))+" .. "+(any+(79*pronostic))+"]");
			linia=sc.nextLine();
		}
		sc.close();
	}

}
