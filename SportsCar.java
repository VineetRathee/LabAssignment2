package Assignment2;

	public class SportsCar extends Car{
		public SportsCar(int noOfWheels, int noOfPassenger, int model, String maker) {
			super(noOfWheels, noOfPassenger, model, maker,2);

		}
		void display() {
			System.out.println("noOfWheels is " + getNoOfWheels());
			System.out.println("noOfPassenger can sit "+  super.getNoOfPassenger() );
			System.out.println("model is " + super.getModel());
			System.out.println("Maker  is " + super.getMaker());
			System.out.println("noOfDoors  is " + super.getNoOfDoors());
		}
	
	

}
