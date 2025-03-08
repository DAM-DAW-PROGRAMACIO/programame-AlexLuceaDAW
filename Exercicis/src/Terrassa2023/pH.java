package Terrassa2023;

import java.util.Scanner;

public class pH {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int nVEces = sc.nextInt();
		
		
		for(int i = 0; i < nVEces;i++) {
			int line = sc.nextInt();
			System.out.println(line + " " + line*2);
		}
		sc.close();
	}

}
