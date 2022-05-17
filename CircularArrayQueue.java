package queue;

public class CircularArrayQueue {
	
	int a[];
	int N;
	int front=-1,rear=-1;
	
	public CircularArrayQueue(int n)
	{
		this.N=n;
		a=new int[n];
	}
	
	void enqueue(int data)
	{
		if((rear+1)%N==front)//check if queue is full
			return;
		if(front==-1)
			front=0;
		rear=(rear+1)%N;//for traversing 
		a[rear]=data;
	}
	
	int dequeue() throws Exception
	{
		if(front==-1)
		{
			throw new Exception();
		}
		int result=a[front];
		if(front==rear)//check if only one element is remain
		{
			front=rear=-1;
		}
		else
		{
			front=(front+1)%N;//increment front so dequeue done
		}
		return result;
	}
	
	void print()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"->");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray q=new QueueUsingArray(3);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.print();
		System.out.println("dequeue data is :"+q.dequeue());
		q.print();
		
		

	}

}
