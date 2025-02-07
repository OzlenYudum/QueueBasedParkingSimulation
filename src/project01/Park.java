package project01;

import java.util.Random;

public class Park {

	int N;
	
	int cars[];
	
	int times[];
	
	double averageTime;
	
	double averageTimeQ;
	
	double averageTimePQ;
	
	int total_time;

	Queue queueCar ;
	
	PriorityQueue priorityQueueCar;
	
	
	public Park(int n) {
		N = n;
		this.cars = new int[n];
		this.times = new int[n];
	    this.queueCar = new Queue(n);
	    this.priorityQueueCar = new PriorityQueue(n);
	  
	}
	

	public void generate_times_and_cars(){
		
	Random random_time = new Random();
	
	for(int i=0;i<N;i++) {
		
		int rand = random_time.nextInt(291)+10;
		times[i] = rand;
		total_time+=times[i];
			
	}
	
	
	
for(int i=0;i<N;i++) {
	
		cars[i] = i+1;
			
	}
	


	}
	
	
	public void QueueParkingSimulation() {
	
		
		
			for(int i=0;i<N;i++) {
			
			queueCar.insertObject(cars[i],times[i]);
				
		}
		
	   int waiting_time = 0;
	   int process_completion_time = 0;
	   int total_process_completion_time = 0;
		for(int i=0;i<N;i++) {
			
			Car car = queueCar.deleteObject();
			
			
			process_completion_time = car.process_time + waiting_time;
			
			System.out.println("Car number: " + car.car_number);
			System.out.println("Exit process time of car "+ car.car_number + " is: "+ car.process_time + " minutes");
			System.out.println("Waiting time of car "+ car.car_number + " is: "+ waiting_time + " minutes");
			System.out.println("Exit process complition time of car " + car.car_number + " is: "+ process_completion_time + " minutes");
			System.out.println();
			
			
			waiting_time+=car.process_time;
			
		  total_process_completion_time += process_completion_time;
		}
		
		averageTimeQ = (double)(total_process_completion_time)/N;
		
		System.out.println("Average transaction completion time for " + N +" cars is: " + averageTimeQ +" minutes");
		
		
		
		//System.out.println("-------------- " + total_process_completion_time+ " --------------------");
		
	}
		


	
	public void PriorityQueueParkingSimulation() {
		
			
		
		for(int i=0;i<N;i++) {
			
			priorityQueueCar.insert(cars[i],times[i]);
			
				
		}
			
		
		   int waiting_time = 0;
		   int process_completion_time = 0;
		   int total_process_completion_time = 0;
			
		for(int i=0;i<N;i++) {
			
			Car car = priorityQueueCar.delete();
			
			
				process_completion_time = car.process_time + waiting_time;
				
		  
			
			
			System.out.println("Car number: " + car.car_number);
			System.out.println("Exit process time of car "+ car.car_number + " is: "+ car.process_time + " minutes");
			System.out.println("Waiting time of car "+ car.car_number + " is: "+ waiting_time + " minutes");
			System.out.println("Exit process complition time of car " + car.car_number + " is: "+ process_completion_time + " minutes");
			System.out.println();
			
			 
				waiting_time+=car.process_time;
				
			
			total_process_completion_time += process_completion_time;
				
		}
		averageTimePQ = (double)(total_process_completion_time)/N;
		
		double gainDifference= (averageTimeQ - averageTimePQ);
		double gainPercentage= (gainDifference/averageTimeQ)*100;
		System.out.println("Average transaction completion time for " + N +" cars is: " + averageTimePQ +" minutes");
		System.out.println("Gain difference between queue and priority queue is: " + gainDifference);
		System.out.println("Gain percentage between queue and priority queue is: " + gainPercentage);
		
		//System.out.println("-------------- " + total_process_completion_time+ " --------------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

