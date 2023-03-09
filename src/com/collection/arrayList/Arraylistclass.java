package com.collection.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arraylistclass {

	public static void main(String[] args) {
		
		Collection<String> obj=new ArrayList<>();
		
		obj.add("sangeetha");
		obj.add("ravi");
		obj.add("neetha");
		System.out.println(obj);
		
//		obj.clear();
	//	System.out.println(obj);
		
		List<Object> obj1 = new ArrayList<>();
		
		obj1.add(null);
		obj1.add(23);
		obj1.add(true);
		obj1.add(obj);
		System.out.println(obj1);

	}

}
