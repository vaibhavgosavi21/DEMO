package Interface_Parking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ParkArea pa = new ParkArea(5, 10);

		Parking parking = pa;

		
			
			System.out.println("-------------PARKING SYSTEM--------------");
			while (true) {
			System.out.println("\n1. Entry For Parking \n2. Available Parking \n3. Exit for vehicle \nEnter your choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				System.out.println("No of vehicle to park: ");
				int noofvehicle=sc.nextInt();
				

				parking.entry();

			}
			case 2 -> {
				parking.availability();
			}
			default ->{
				System.out.println("INVALID CHOICE6!, Please enter a valid choice");
			}
			}

		}
	}

}
