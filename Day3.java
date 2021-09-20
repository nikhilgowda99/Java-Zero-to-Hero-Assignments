import java.util.Scanner;

class Cab {
	int fare;
	int distance;

	public Cab() {
		fare = 30;
	}

	public Cab(int amount) {
		fare = amount;
	}

	void displayFare() {
		System.out.println("Total Fare: Rs " + fare);
	}

}

public class Day3 {
	public static void main(String[] args) {
		int cabDistance;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the cab distance from user (km): ");
		cabDistance = sc.nextInt();

		if (cabDistance > 5) {
			Cab ob = new Cab(30 + 10 * (cabDistance - 5));
			System.out.print("Enter the distance from user (km): ");
			ob.distance = sc.nextInt();
			ob.fare += 10 * ob.distance;
			ob.displayFare();
			sc.close();
		}

		else {
			Cab ob = new Cab();
			System.out.print("Enter the distance from user (km): ");
			ob.distance = sc.nextInt();
			ob.fare += 10 * ob.distance;
			ob.displayFare();
		}
	}

}