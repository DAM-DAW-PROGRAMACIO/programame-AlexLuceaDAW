package Terrassa2023;

import java.util.Scanner;
import java.util.TreeSet;

public class pI {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		
		while(casos > 0) {
			
			int temps[] = new int[casos];
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for (int i = 0; i < casos; i++) {
				
				int temp = sc.nextInt();
				if (max <= temp)
					max = temp;
				if (min >= temp)
					min = temp;
			}
			
			TreeSet<Integer> mins = IndexesOf(min, temps);
			TreeSet<Integer> maxes = IndexesOf(max, temps);
			int dist = Integer.MAX_VALUE;
			
			if (mins.size() > maxes.size()) {
				for (int mns : mins) {
					for (int mxs : maxes) {
						if (Math.abs((mns - mxs)) <= dist)
							dist = Math.abs((mns - mxs));
					}
				}
			}
			else {
				for (int mxs : maxes) {
					for (int mns : mins) {
						if (Math.abs((mns - mxs)) <= dist)
							dist = Math.abs((mns - mxs));
					}
				}
			}
			
			System.out.printf("%d %d %d\n", min, max, dist);
			
			casos = sc.nextInt();
		}
		sc.close();
	}

	public static TreeSet<Integer> IndexesOf(int n, int t[]) {
		// TODO Auto-generated method stub
		TreeSet<Integer> result = new TreeSet<Integer>();
		for (int i = 0; i < t.length; i++) {
			if (t[i] == n)
				result.add(t[i]);
		}
		return result;
	}

}
