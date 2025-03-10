package Easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p778 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		while(casos!=0) {
			
			int contador =0;
			int num1, num2;
			int contadorMax = Integer.MIN_VALUE;
			
			int nums[] = new int[casos];
			
			for(int i = 0; i<casos; i++) {
				 nums[i] = sc.nextInt();	
			}
			
			for(int i = 0; i<casos-1; i++) {
				num1 = nums[i];
				num2 = nums[i+1];
				
				if(num1<=num2) {
					contador++;
					if(contadorMax<contador)
						contadorMax = contador;
				}
				Queue<String> jaj= new LinkedList<String>()	
				else {			
					contador = 0;
				}
			}
			
			System.out.println(contadorMax);
			casos = sc.nextInt();
		}
		sc.close();
	}

}
