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
		if(front == maxSize) {
			front = 0;
			System.out.println("Queue is Empty"); 
			return 0;
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
 	public void choose_New_customer(){return;}
 	public void choose_Billing(){return;}
 	public void choose_Technical_Issue(){return;}

 	public void task_New_customer(){return;}
 	public void task_Billing(){return;}
 	public void task_Technical_Issue(){return;}

 	public void display_New_customer(){return;}
 	public void display_Billing(){return;}
 	public void display_Technical_Issue(){return;}

}

class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Queue theQueue = new Queue(10);
		int j;
		String j1;
		long i ;
		while (true){
			System.out.print("\nMenu\n[1] Choose Services\n[2] Task Accomplished\n[3] Display Number of Customers\n[4] Exit\nEnter your choice:");
			j = input.nextInt();
			System.out.println("");
			if (j==1){
				System.out.print("\n[a] New Customer \n[b] Billing\n[c] Technical Issue");
      			j1 = input.nextInt();
      			System.out.println("");
      			if (j1=='a'){
					choose_New_customer();
				}
				else if (j1=='b'){
					choose_billing();
				}
				else if (j1=='c'){
					choose_Technical_Issue();
				}
				else{
					System.out.println("Incorrect Selection Try Again.........");
					continue;
				}
			}
			else if (j==2){
				System.out.print("\n[a] New Customer \n[b] Billing\n[c] Technical Issue");
      			j1 = input.nextInt();
      			System.out.println("");
      			if (j1=='a'){
					task_New_customer();
				}
				else if (j1=='b'){
					task_Billing();
				}
				else if (j1=='c'){
					task_Technical_Issue();
				}
				else{
					System.out.println("Incorrect Selection Try Again.........");
					continue;
				}
			}
			else if (j==3){
				System.out.print("\n[a] New Customer \n[b] Billing\n[c] Technical Issue");
      			j1 = input.nextInt();
      			System.out.println("");
      			if (j1=='a'){
					display_New_customer();
				}
				else if (j1=='b'){
					display_Billing();
				}
				else if (j1=='c'){
					display_Technical_Issue();
				}
				else{
					System.out.println("Incorrect Selection Try Again.........");
					continue;
				}
			}
			else if (j==4){
				break;			
			}
			else{
				System.out.println("Incorrect Selection Try Again.........");
				continue;
			}
      		System.out.println("");
  



		}
	}
}