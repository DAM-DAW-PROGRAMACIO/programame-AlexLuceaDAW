package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class p345_2 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		for(int i = 0; i<casos; i++) {
			String resposta = "SI";
			int sudoku[][]= new int[9][9];
		
			
			
			for(int j = 0; j < 9; j++) {
				for(int k = 0; k <9; k++) {
					sudoku[j][k] = sc.nextInt();
				}
			}
			
			for(int j = 0; j < 9; j++) {
			
				if(resposta.equals("SI")) {	
					HashSet<Integer> files = new HashSet<Integer>();
					HashSet<Integer> columnes = new HashSet<Integer>();
					for(int k = 0; k <9; k++) {
						 if(!files.add(sudoku[j][k])) {
							 resposta= "NO";
							 break;
						 }
						 if(!columnes.add(sudoku[k][j])) {
							 resposta= "NO";
							 break;
						 }
					}
				}
			}
			if(resposta.equals("SI")) {
				for(int j = 0; j<9; j+=3) {
					for(int k = 0; k<9 ; k+=3) {
						HashSet<Integer> grups = new HashSet<Integer>();

						for(int x = 0; x<3; x++) {
							for(int y = 0; y<3; y++) {
								if(!grups.add(sudoku[x+j][y+k])) {
									resposta ="NO";
									break;
								}
							}
						}
					}
				}
			}
			System.out.println(resposta);
		}
		
		sc.close();
	}

}
