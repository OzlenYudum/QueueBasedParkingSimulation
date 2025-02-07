package project01;

public class Queue {
	int size;
	int count;
	Car arr[];
	int front;
	int rear;
	
	 Queue(int size) {
		this.size=size;
		this.front=-1;
		this.rear=-1;
		this.count=0;
		this.arr=new Car[size];
	}
	 
	 
	
public void insertObject(int data,int time){
	if(isEmpty()) {
	front++;
	rear++;
	arr[rear]= new Car(data,time) ;
	count++;
	
	}
	else if(isFull()) {
		System.out.println("Queue is full!!");
		
	}
	else if(!isFull() && rear == size-1) {
		rear=0;
		arr[rear] = new Car(data,time);
		count++;
	}
	else {
		rear++;
		count++;
		arr[rear]= new Car(data,time);
	}
	
	
}
public Car deleteObject() {
	
	Car temp = arr[front];
	
	if(isEmpty()) {
		System.out.println("Queue is empty");
	}
	else if(front == size-1){
		front=0;
		count--;
		
	}
	else{
		
		front++;
		count--;
	}
	
	return temp;
	
}



public boolean isEmpty() {
	return front == -1;
	}
public boolean isFull() {
	return count == size;
}



}