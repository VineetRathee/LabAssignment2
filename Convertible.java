package Assignment2;

public class Convertible extends Car {
	private boolean isHoodOpen;

	
	public Convertible(int noOfWheels, int noOfPassenger, int model, String maker, int noOfDoors,boolean isHoodOpen) {
		super(noOfWheels, noOfPassenger, model, maker,noOfDoors);
		this.isHoodOpen = isHoodOpen;
	}
	void display() {
		System.out.println("noOfWheels is " + getNoOfWheels());
		System.out.println("noOfPassenger can sit "+  super.getNoOfPassenger() );
		System.out.println("model is " + super.getModel());
		System.out.println("Maker  is " + super.getMaker());
		System.out.println("noOfDoors  is " + super.getNoOfDoors());
		System.out.println("hood is open  is " + this.isHoodOpen);
		
		
	}
	

}
