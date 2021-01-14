package Assignment2;

public class student {
	private String name = null;
	private String id = null;
	private double grade = -1;
	
	
	
	public student() {}

	public student(String id) {
		this.id = id;
	}
	
	public student(String name, String id) {
		this(id);
		this.name = name;
	}
	
	public student(String name, String id, double grade) {
		this(name,id);
		this.grade = grade;
	}

	public void display() {
		if(name != null) {
			System.out.println("Name: " + name);
		}
		
		if(id != null) {
			System.out.println("Id: " + id);
		}
		
		if(grade != -1) {
			System.out.println("Grade: " + grade);
		}
	}
	
	public void display(int year) {
		this.display();
		System.out.println("You are in year: " + year);
	}

}