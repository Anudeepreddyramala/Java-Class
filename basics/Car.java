package com.basics;

public class Car extends Vehicle {

	public Car() {
	}

	public Car(int vehicleID,String vehicleType) {
		super(vehicleID, vehicleType);
	}

	String carType = "BMW";
	int carPrice = 10000;

	public void getType() {
		System.out.println("The car type is " + carType);
	}

	public void getPrice() {
		System.out.println("The car Price is " + carPrice);
	}

	public static void main(String args[]) {

		Vehicle v1 = new Car(10,"Car"); // upcasting
		v1.getType();
		//v1.getPrice();     ---- Compiletime Error
		v1.getCustomerDetails();

		Car c1 = (Car) v1; // downcasting
		c1.getType();
		c1.getPrice();
		c1.getCustomerDetails();
		
		Vehicle v2=new Vehicle(10,"Car");
		Vehicle v3=new Vehicle(10,"Car");
		if(v2.equals(v3)) {
			System.out.println("Both objects are same");
		}
		else {
			System.out.println("Both objects are not same");
		}
	}
}
