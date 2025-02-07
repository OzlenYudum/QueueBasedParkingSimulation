package project01;

public class PriorityQueue {

	int count = 0;
	
	int front = -1;
	int size;
	Car arr[];
	
	PriorityQueue(int size){
		this.size = size;
		this.arr = new Car[size];
		
	}
	
	public void insert(int data,int time) {
		if(isFull()) {
			System.out.println("full");
		}
		if(isEmpty()) {
			
		arr[++front] = new Car(data,time);
		
		
		}
		else {
			if(time <= arr[front].process_time) {
				
				arr[++front]= new Car(data,time);
				
				
			}
			else {
				int i;
				for( i = front; i >= 0 ; i--) {
					if(time > arr[i].process_time) {
						arr[i+1] = arr[i];
					}
					else {
						break;
					}
				}
				
				arr[i+1] = new Car(data,time) ; 
				
				
				front++;
				
				
			}
				
				
		}
		
		count++;
	}
	
	public Car delete(){
		
		if(isEmpty()) {
			System.out.println("empty");
		}
		Car temp = arr[front];
		
		front--;
		count--;
		return temp;
	}
	
	public void print() {
		for(int i = front; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
	

	
	public boolean isFull() {
		return count == size;
	}
	public boolean isEmpty() {
		return count == 0;
	}
	

}
