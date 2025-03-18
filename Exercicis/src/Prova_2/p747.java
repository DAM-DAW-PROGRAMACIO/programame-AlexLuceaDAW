package Prova_2;

import java.util.Scanner;



public class p747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int F = sc.nextInt();
		int C = sc.nextInt();
		while(F != 0 && C != 0) { 
			char[][] campo = new char[F][C];
			boolean[][] check = new boolean[F][C];
			Tabla tabla = new Tabla(check, F, C);
			for(int i = 0; i < F; i++) {
				String line = sc.nextLine();
				
				for(int j = 0; j < C; j++) {
					campo[i][j] = line.charAt(0);
					
				}
			}
			int cont = 0;
			boolean result = false;
			for(int i = 0; i<F; i++) {
				for(int j = 0; j < C; j++) {
					if(campo[i][j] == '.' && !(tabla.t()[i][j])) {
						tabla.visit(i, j);
						result = Function(campo, cont, i, j, tabla, false);
					}
				}
						
			
			}
			
			if(result)
				System.out.println("SI");
			else
				System.out.println("NO");
		}
	}
	static boolean Function(char[][] campo, int cont, int i, int j, Tabla tabla, boolean ret) {
		if(j+1 < tabla.F && campo[i][j+1] == '.' && !tabla.t()[i+1][j]) {
			tabla.visit(i, j+1);
			Function(campo, cont, i, j+1, tabla,ret);
		}
		if(i +1 < tabla.C && campo[i+1][j] == '.' && !tabla.t()[i+1][j]) {
			tabla.visit(i+1, j);
			Function(campo, cont, i+1, j, tabla,ret);
		}
		if(j-1 < tabla.F && campo[i][j-1] == '.' && !tabla.t()[i][j-1]) {
			tabla.visit(i, j-1);
			Function(campo, cont, i, j+1, tabla,ret);
		}
		if(i -1 < tabla.C && campo[i-1][j] == '.' && !tabla.t()[i-1][j]) {
			tabla.visit(i+1, j);
			Function(campo, cont, i-1, j, tabla,ret);
		}
		
		if(i == tabla.F && j == tabla.C)
			ret = true;
		return ret;
	}
}

class Tabla{
	boolean[][] check;
	int F;
	int C;
	public Tabla(boolean[][] check, int F, int C) {
		this.check = check;
		this.F = F;
		this.C = C;
	}
	public int F() {
		return F;
	}
	public int C() {
		return C;
	}
	public boolean[][] t(){
		return this.check;
	}
	public void visit(int i, int j) {
		check[i][j] = true;
	}
}