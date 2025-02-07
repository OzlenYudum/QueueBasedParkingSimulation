package project01;


import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please enter the number of cars you want the park to accommodate.");
		
		int N = scanner.nextInt();
		Park park = new Park(N);
		park.generate_times_and_cars();
	System.out.println("QUEUE SIMULATION\n");	
	park.QueueParkingSimulation();
	System.out.println("\n---------------------------------------------------------------\n");
	System.out.println("PRIORITY QUEUE SIMULATION\n");	
	park.PriorityQueueParkingSimulation();	
		
	}
	
	
	
}
