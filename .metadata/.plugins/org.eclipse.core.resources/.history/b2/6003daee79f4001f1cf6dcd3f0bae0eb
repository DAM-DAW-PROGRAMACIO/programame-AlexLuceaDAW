package Easy;

import java.util.Scanner;

public class p148 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String linia = sc.nextLine();
		int result;
		int h,m;
		int minMax = 24*60;
				
		while(!linia.equals("00:00")) {
			
			String arrayLinia[]= linia.split(":");
			
			h = Integer.parseInt(arrayLinia[0]);
			m = Integer.parseInt(arrayLinia[1]);

			
			result = minMax -(h * 60 + m);
			
			
			System.out.println(result);
			
			linia=sc.nextLine();
		}
		sc.close();
	}

}
