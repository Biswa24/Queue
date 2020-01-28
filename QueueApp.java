import java.util.Scanner;

class Queue {
	private int maxSize;
 	private long[] queArray; 
 	private int front; 
 	private int rear;
    private int nItems;
    
	public Queue(int s){
		maxSize = s;
		queArray = new long[maxSize]; front = 0;
		rear = -1;
		nItems = 0;
		}

	public void insert(long j){
		if(rear == maxSize-1){
			System.out.println("Queue is Full , try again inserting of elements after removing elements"); 
			return;
		}
		queArray[++rear] = j;
		nItems++;
		return;
		}

	public long remove(){
		if(front == maxSize | front==0) {
			front = 0;
			return -1;
		}
		long temp = queArray[front++]; 
 		nItems--; 
 		return temp; 
 	}

 	public long peekFront(){
		return queArray[front]; 
	}

 	public boolean isEmpty() {
		return (nItems==0); 
	}

 	public boolean isFull() {
		return (nItems==maxSize); 
	}

 	public int size() {
		return nItems;
 	}
 	public void display(){
 		int i; 

        if (front == rear) { 
            System.out.println("Queue is Empty"); 
            return; 
        } 
  
        // traverse front to rear and print elements 
        for (i = front; i <=rear; i++) { 
            System.out.printf(" %d  ", queArray[i]); 
        } 
        System.out.println("");
        return;
 	} 
}

class QueueApp {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int j;
		System.out.print("Enter the size of the Queue:-");
		j = input.nextInt();
		Queue theQueue = new Queue(j);
		long i ;
		while (true){
			System.out.print("\nMenu \n[1] Insert Number \n[2] Remove Number\n[3] Display content of the array\n[4] Exit\nEnter your choice: ");
			j = input.nextInt();
			if(j==1){
				System.out.print("Enter the Number you want to insert:- ");
				i = input.nextLong();
				theQueue.insert(i);
			}

			else if(j==2){
				i = theQueue.remove();
				if (i==-1){
					System.out.println("Queue is Empty");
					continue;
				}
				System.out.print("Removed Number:- ");
				System.out.println(i); 
			}

			else if(j==3){
				System.out.println("Content of array are --");
				theQueue.display() ; 
			}
			
			else if(j==4){
				System.out.println("Closing The program........");
				break; 
			}
			
			else{
				System.out.println("Incorrect input given,Please Try again.......");
			}	
		}
	}
}