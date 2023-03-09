package com.bank.application;

import java.util.Scanner;

public class Bankapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String name;
		int Accountno;
		//taking input from user 
		System.out.println("Enter the name: ");
		 name= s.nextLine();
		System.out.println("Enter the Account number: ");
		 Accountno= s.nextInt();
		 
		 Bankaccount bank=new Bankaccount(name,Accountno);
		 bank.menu();
		
		

	}

}
