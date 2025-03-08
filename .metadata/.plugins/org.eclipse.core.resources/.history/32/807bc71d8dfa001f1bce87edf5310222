package Easy;

import java.util.Scanner;
import java.util.Stack;

public class p141 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		
		/*push fiques
		pop el treus
		peek comproves*/
		

		while(sc.hasNext()) {
			
			String linia=sc.nextLine();
			Stack<Character> casos = new Stack<Character>();
			String resposta = "YES";
			
			for(int i = 0; i <linia.length(); i++) {
				char caracter = linia.charAt(i);
				char lastCar;
				if(caracter == '{'||caracter == '('||caracter == '[') {
					casos.push(caracter);
					resposta = "NO";
				}else if(caracter == '}') {
					if(!casos.empty()) {
						lastCar = casos.pop();
						if(!(lastCar=='{')) {
							resposta = "NO";
							break;
						}else
							resposta="YES";
					}else {
						resposta = "NO";
						break;
					}
				}else if(caracter == ')') {
					if(!casos.empty()) {
						lastCar = casos.pop();
						if(!(lastCar=='(')) {
							resposta = "NO";
							break;
						}else
							resposta="YES";
					}else {
						resposta = "NO";
						break;
					}	
				}else if(caracter == ']') {
					if(!casos.empty()) {
						lastCar = casos.pop();
						if(!(lastCar=='[')) {
							resposta = "NO";
							break;
						}else
							resposta="YES";
					}else {
						resposta = "NO";
						break;
					}
					
				}
			}
			System.out.println(resposta);
		}
		sc.close();
	}

}