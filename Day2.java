import java.util.Scanner;

public class Day2 {
	public static void main(String args[]) {
		int a, b, sum;
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the first number: ");
		a = sc.nextInt();
		System.out.print("Enter the second number: ");
		b = sc.nextInt();
		sum = sum(a, b);
		System.out.println("Sum of the two numbers is: " + sum);
		sc.close();
	}

	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
		
	}
}