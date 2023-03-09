package com.bank.application;

import java.util.Scanner;

public class Bankaccount {
	String name;
	int Accountno;
	double balance;
	double amount;
	
	Bankaccount(String name,int Accountno){
		this.name=name;
		this.Accountno=Accountno;
	}
	
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) {
		balance= balance - amount;
		}
		else {
			System.out.println("insufficent balance");
		}
	}
	
	void menu() {
		char option;
		Scanner s=new Scanner(System.in);
		System.out.println("welcome "+name);
		System.out.println("your account is *********");
		System.out.println("Enter the option");
		System.out.println("1.BALANCE CHECK");
		System.out.println("2.DEPOSIT");
		System.out.println("3.WITHDRAW");
		System.out.println("4.EXIT");
		System.out.println("press any key cancel");
		
		do {
			 option=s.next().charAt(0);
			 switch(option) {
			 case '1':
				 System.out.println("balance: "+balance);
				 System.out.println("balance check sucessfully");
				 
				 break;
			 case '2':
				 System.out.println("Enter your deposit amount");
				 amount= s.nextDouble();
				 deposit(amount);
				 System.out.println("deposit sucessfully");
				 System.out.println('\n');
				 System.out.println("Current amount: "+balance);
				 break;
			 case '3':
				 System.out.println("Enter your withdraw amount");
				 amount=s.nextDouble();
				 withdraw(amount);
				 System.out.println("withdraw sucessfully");
				 break;
			 case '4':
				 System.out.println("--------------");
				
				 default:
					 System.out.println("choose correct option to proceed");
					 break;
			 }
		} while(option!=4);
		
		System.out.println("Thank you");
		
	}

}
