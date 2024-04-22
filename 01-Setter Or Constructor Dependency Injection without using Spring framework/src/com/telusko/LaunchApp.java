package com.telusko;

import services.BlueDart;
import services.DHL;

public class LaunchApp{

	public static void main(String[] args)	{
		
		System.out.println("Welcome to our First loosely coupled application App");
		
		//Constructor dependency injection
		//Amazon amz = new Amazon(new BlueDart());
		
		//setter dependency injection
		Amazon amz = new Amazon();
		amz.setService(new DHL());
		
		Boolean status = amz.deliver(4554.4);
		
		if(status)
			
			System.out.println("Product Delivered Successfully");
		else
			
			System.out.println("Failed to deliver product");
	}
}
