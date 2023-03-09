package com.collection.lambda;

public class Productdetails {

    int productId;
    String ProductName;
    int ProductRate;
	public Productdetails(int productId, String productName, int productRate) {
		this.productId = productId;
		this.ProductName = productName;
		this.ProductRate = productRate;
	}
	@Override
	public String toString() {
		return "Productdetails [productId=" + productId + ", ProductName=" + ProductName + ", ProductRate="
				+ ProductRate + "]";
	}
    
    
    
}
