package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p402 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linia = br.readLine();
		int num;
		int b=0;
		
		
		while(!linia.startsWith("0")) {
			
			num = Integer.parseInt(linia);
			
			b= (int)Math.sqrt(num);
			
			while(num%b !=0) {
				b--;
			}
			b = num/b;
			
			System.out.println(b);			
			linia=br.readLine();
		}
	}

}
