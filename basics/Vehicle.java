package com.basics;

import java.util.Objects;

public class Vehicle {

	int vehicleID;
	String vehicleType;
	static String name = "Anudeep";

	public Vehicle() {

	}

	public Vehicle(int vehicleID, String vehicleType) {
		this.vehicleID = vehicleID;
		this.vehicleType=vehicleType;
	}

	protected void getType() {
		System.out.println("The id of vehicle is "+ vehicleID);
		System.out.println("The vehicle type is " + vehicleType);
	}

	 void getCustomerDetails() {
		System.out.println("The customer name is " + name);
	}
	 
	 public boolean equals(Object ob) {
		 if(!(ob instanceof Vehicle))
			 return false;
		 Vehicle v = (Vehicle)ob;
		 return Objects.equals(vehicleID, v.vehicleID)&&Objects.equals(vehicleType, v.vehicleType);
		 
	 }
}
