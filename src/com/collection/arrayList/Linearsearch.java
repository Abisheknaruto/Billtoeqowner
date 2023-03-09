package com.collection.arrayList;

import java.util.Scanner;

public class Linearsearch {
	
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n;
		 
		int i, k;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the number of element");
		n = s.nextInt();
		int[] a = new int[n];
		System.out.println("enter the input");
		for (i = 0; i < n; i++) {

			a[i] = s.nextInt();
		}
		System.out.println("enter the search element");
		k = s.nextInt();

		for (i = 0; i < n; i++) {
			if (a[i] == k) {
				System.out.println("search element is: " + k + " index of: " + i);
				break;
			}
		}
		s.close();
	}

}
