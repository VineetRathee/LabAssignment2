package Assignment2;
import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader; 
public class VehicleApp {
	public static void main(String[] args )throws IOException  {
		System.out.println("1 to create a Vehicle object"); 
		System.out.println("2 to create a Car object"); 
		System.out.println("3 to create a Convertible object"); 
		System.out.println("4 to create a SportsCar object"); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int input = Integer.parseInt(br.readLine());
		switch (input) {
        case 1:
        	System.out.println("Enter noOfWheels is ");
        	 int wheels = Integer.parseInt(br.readLine());
        	
    		System.out.println("Enter noOfPassenger can sit " );
    		int noOfPassenger = Integer.parseInt(br.readLine());
    		System.out.println("Enter model  " );
    		int model = Integer.parseInt(br.readLine());
    		System.out.println("Maker  is " );
    		String maker = br.readLine();
    		Vehicle vehicle = new Vehicle(wheels,noOfPassenger,model,maker );
    		vehicle.display();
    		
            break;
        case 2:
        	System.out.println("Enter noOfWheels is ");
       	   wheels = Integer.parseInt(br.readLine());
       	
   		System.out.println("Enter noOfPassenger can sit " );
   		  noOfPassenger = Integer.parseInt(br.readLine());
   		System.out.println("Enter model  " );
   		 model = Integer.parseInt(br.readLine());
   		System.out.println("Maker  is " );
   		 maker = br.readLine();
   		System.out.println("noOfDoors  is " );
		int noOfDoors= Integer.parseInt(br.readLine());
		Car car = new Car(wheels,noOfPassenger,model,maker,noOfDoors);
		car.display();
            break;
        case 3:
        	System.out.println("Enter noOfWheels is ");
       	   wheels = Integer.parseInt(br.readLine());
       	
   		System.out.println("Enter noOfPassenger can sit " );
   		  noOfPassenger = Integer.parseInt(br.readLine());
   		System.out.println("Enter model  " );
   		 model = Integer.parseInt(br.readLine());
   		System.out.println("Maker  is " );
   		 maker = br.readLine();
   		System.out.println("noOfDoors  is " );
		  noOfDoors= Integer.parseInt(br.readLine());
		boolean isHood = Boolean.parseBoolean(br.readLine());
		Convertible convertible = new Convertible(wheels,noOfPassenger,model,maker,noOfDoors,isHood);
		convertible.display();
            break;
       /* case 4:
        	System.out.println("Enter noOfWheels is ");
       	   wheels = Integer.parseInt(br.readLine());
       	
   		System.out.println("Enter noOfPassenger can sit " );
   		  noOfPassenger = Integer.parseInt(br.readLine());
   		System.out.println("Enter model  " );
   		 model = Integer.parseInt(br.readLine());
   		System.out.println("Maker  is " );
   		 maker = br.readLine();
   		System.out.println("noOfDoors  is " );
		  noOfDoors= Integer.parseInt(br.readLine());
		
		SportsCar sportsCar = new SportsCar(wheels,noOfPassenger,model,maker);
		sportsCar.display();
            break;
       */
        default:
            System.out.println("Invalid Input");
        }
		
		
}

}
