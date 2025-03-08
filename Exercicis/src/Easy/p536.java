package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class terreny{
	
	private int tamaño;
	private int qAbono;
	private int qAgua;
	private int distancia;
	private String nom;
	
	public terreny(int tamaño, int qAbono, int qAgua, int distancia, String nom) {
		this.tamaño = tamaño;
		this.qAbono = qAbono;
		this.qAgua = qAgua;
		this.distancia = distancia;
		this.nom = nom;
	}
	
	public static terreny GetBestOne(terreny t1, terreny t2){
		terreny millor;
		if(t2.tamaño > t1.tamaño)
			millor = t2;
		else if(t1.tamaño>t2.tamaño)
			millor = t1;
		else {
			if(t1.qAgua<t2.qAgua)
				millor = t1;
			else if(t1.qAgua>t2.qAgua)
				millor = t2;
			else {
				if(t1.distancia<t2.distancia)
					millor = t1;
				else if(t1.distancia>t2.distancia)
					millor = t2;
				else{
					if(t1.qAbono<t1.qAbono)
						millor=t1;
					else if(t1.qAbono>t2.qAbono)
						millor=t2;
					else {
						millor=t1;
					}
				}
			}
		}
		
		return millor;
			
	}
	
	public String GetNom(){
		return this.nom;
	}
	
}


public class p536 {
		public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int casos;
		int tamaño;
		int qAbono;
		int qAgua;
		int distancia;
		String nom;
		
		while(sc.hasNext()) {
			
		
			casos = sc.nextInt();
			ArrayList<terreny> terrenys = new ArrayList<terreny>();
			
			tamaño = sc.nextInt();
			qAbono = sc.nextInt();
			qAgua =  sc.nextInt();
			distancia = sc.nextInt();
			nom = sc.nextLine().trim();
			
			terreny millor =  new terreny (tamaño,qAbono,qAgua,distancia, nom);
			
			for(int i = 1; i < casos; i++) {
				
				tamaño = sc.nextInt();
				qAbono = sc.nextInt();
				qAgua =  sc.nextInt();
				distancia = sc.nextInt();
				nom = sc.nextLine().trim();
				
				terreny casa = new terreny(tamaño, qAbono, qAgua, distancia, nom);
				
				millor = terreny.GetBestOne(millor, casa);
			}	
			
			
			System.out.println(millor.GetNom());
		}
		sc.close();
	}

	
}
