package queue;

class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
	}
}

public class Queue {
	
	Node front,rear;
	
	void enqueue(int data)
	{
		Node newnode=new Node(data);
		if(front==null)
		{
			front=rear=newnode;
		}
		rear.next=newnode;
		rear=newnode;
	}
	
	int dequeue()
	{
		if(front==null)
		{
			System.out.println("Queue is Empty dequeue not possible");
		}
		
		int result=front.data;
		front=front.next;
		return result;
	}
	
	void print()
	{
		Node temp=front;
		while(temp!=null)
		{
			System.out.print(temp.data+" ->");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.print();
		System.out.println("Deleted nodes data is:"+q.dequeue());
		q.print();

	}

}
