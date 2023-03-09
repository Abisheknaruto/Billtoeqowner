package com.collection.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {

	public static void main(String[] args) {
	
		  List<Productdetails> productsList = new ArrayList<Productdetails>();  
	        //Adding Products  
	        productsList.add(new Productdetails(1,"HP Laptop",25000));  
	        productsList.add(new Productdetails(2,"Dell Laptop",30000));  
	        productsList.add(new Productdetails(3,"Lenevo Laptop",28000));  
	        productsList.add(new Productdetails(4,"Sony Laptop",28000));  
	        productsList.add(new Productdetails(5,"Apple Laptop",90000)); 
	        
	       Stream<Productdetails>data=productsList.stream();
	       
	       data.forEach(n->System.out.println(n));
	}

}
