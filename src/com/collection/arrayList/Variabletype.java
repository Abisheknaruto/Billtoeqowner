package com.collection.arrayList;

public class Variabletype {
  int a=5;//instance 
	static int b= 5;//static variable
	int c; //instance
	
	public Variabletype(int c) {
		this.c = c;
	}

	public static void main(String[] args) {
		
		int d=12;//local variable
		Variabletype var=new Variabletype(10);
		
		System.out.println(var.a+b+var.c+d);
	}

}
