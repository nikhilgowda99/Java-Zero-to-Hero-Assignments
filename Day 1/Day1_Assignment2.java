import java.util.Scanner;

class Student {
	private int Rollno;
	String Name;
	Float Marks;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Roll Number: ");
		Rollno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Name: ");
		Name = sc.nextLine();
		System.out.print("Enter the Marks: ");
		Marks = sc.nextFloat();
		sc.close();
	}

	public void display() {
		System.out.println("Rollno: " + Rollno);
		System.out.println("Name: " + Name);
		System.out.println("Marks of " + Name + " is: " + Marks);

	}

}

public class Day1_Assignment2 {

	public static void main(String[] args) {

		Student s = new Student();
		s.input();
		s.display();
	}
}