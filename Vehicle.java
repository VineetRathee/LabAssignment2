package Assignment2;

public class Vehicle {
	private int noOfWheels;
	private int noOfPassenger;
	private int model;
	private String maker;
	public Vehicle(int noOfWheels, int noOfPassenger, int model, String maker) {
		this.noOfWheels = noOfWheels;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.maker = maker;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	
	public int getNoOfPassenger() {
		return noOfPassenger;
	}
	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}
	public int getModel() {
		return model;
	}
	public String getMaker() {
		return maker;
	}
	
	
	void display() {
		System.out.println("noOfWheels is " + this.noOfWheels);
		System.out.println("noOfPassenger can sit "+  this.noOfPassenger );
		System.out.println("model is " + this.model);
		System.out.println("Maker  is " + this.maker);
	}
	

}
