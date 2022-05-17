package queue;

public class QueueUsingArray {
	int a[];
	int capacity;
	int rear;
	
	public QueueUsingArray(int n)
	{
		capacity=n;
		a=new int[n];
		rear=-1;
	}
	
	void enqueue(int data)
	{
		if(rear==capacity-1)
		{
			System.out.println("Queue is overflow");
			System.exit(1);
		}
		rear++;
		a[rear]=data;
	}
	
	int dequeue()
	{
		if(rear==-1)
		{
			System.out.println("Queue is underflow");
			System.exit(1);
		}
		int result=a[0];
		for(int i=0;i<rear;i++)
		{
			a[i]=a[i+1];
		}
		rear--;
		return result;
	}
	
	int getFront()
	{
		if(rear==-1)
		{
			System.out.println("Queue is Empty");
			System.exit(1);
		}
		return a[0];
	}
	
	void print()
	{
		System.out.println("Queue is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"-> ");
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
		q.enqueue(6);
		q.print();
		q.dequeue();
		q.print();
		System.out.println("Front is:"+q.getFront());
		
		
		

	}

}
