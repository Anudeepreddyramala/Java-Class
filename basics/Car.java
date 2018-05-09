package com.basics;

public class Car extends Vehicle implements Automobile{

	public Car() {
	}

	public Car(int vehicleID,String vehicleType) {
		super(vehicleID, vehicleType);
	}

	final int carPrice = 10000;

	public void getType() {
		System.out.println("The car type is " + CARTYPE);
	}

	public void getPrice() {
		//carPrice=carPrice+2;        --CompileTime Error due to Final
		System.out.println("The car Price is " + carPrice);
	}

	public static void main(String args[]) {
        name.concat("Reddy");    
        System.out.println(name);        //String is immutable
        
        StringBuffer sbf= new StringBuffer(name);      
        System.out.println(sbf.append("Reddy"));      //StringBuffer is mutable and thread safe
        
        StringBuilder sbd=new StringBuilder(name);
        System.out.println(sbd.append("Reddy"));      //StringBuilder is mutable and not thread safe
		
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
		System.out.println("Hashcodes are "+v2.hashCode()+" , "+v3.hashCode());
	}
}
