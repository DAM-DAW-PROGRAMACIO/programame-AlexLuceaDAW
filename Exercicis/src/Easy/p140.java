package Easy;

import java.util.Scanner;

public class p140 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);		
		int num = sc.nextInt();
		
		while(num >= 0) {
			
			String sNum = String.valueOf(num);

			int suma = 0;
			String numFinal = "";
			for(int i = 0; i<sNum.length(); i++) {
				suma = suma + (sNum.charAt(i)-48);
				numFinal= numFinal + sNum.charAt(i) + " + ";
			}
			System.out.println(numFinal.substring(0, numFinal.length()-2) + "=" + " " + suma);
			
			num = sc.nextInt();
		}
		sc.close();
	}

}
