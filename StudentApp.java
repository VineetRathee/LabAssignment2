package Assignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentApp {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1 – to create a Student object");
				System.out.println("2 – to display the student info.");
				int input =Integer.parseInt(br.readLine());
				student Student=null ;
				switch(input) {
				case 1:
					
					System.out.println(" Press 1 if you want to create Object using Name,Id,Grades");
					System.out.println("Press 2 if you want to create Object using Name,Id");
					System.out.println("Press 3 if you want to create Object using Id");
					int inputChoice = Integer.parseInt(br.readLine());
					
					if(inputChoice  == 1) {
						
						System.out.println("Enter Name,Id,Grade ");
						String Name = br.readLine();
						String Id = br.readLine();
						int Grade = Integer.parseInt(br.readLine());
						 Student = new student(Name,Id,Grade);
						
					}
					else if(inputChoice == 2) {
						
						System.out.println("Enter Name and Id: ");
						String Name = br.readLine();
						String Id = br.readLine();
						Student = new student(Name,Id);

					}
					else if(inputChoice == 3) {
						
						System.out.println("Enter Id: ");
						String Id = br.readLine();
						Student = new student(Id);
						
					}
					else {
						System.out.println("Invalid input! ");
						return;
					}
					
					System.out.println("Do you want to enter Year ?? ");
					System.out.println("1.Yes");
					System.out.println("2.No");
					inputChoice = Integer.parseInt(br.readLine());
					if(inputChoice == 1) {
						System.out.println("Enter year: ");
						int year = Integer.parseInt(br.readLine());
						Student.display(year);
					}
					else {
						System.exit(0);
					}
					break;
				case 2:
					if(Student==null) {
						Student.display();
					}
					
					break;
				default:
		            System.out.println("Invalid Input");
		        }
					
				
				
		
	}

}
