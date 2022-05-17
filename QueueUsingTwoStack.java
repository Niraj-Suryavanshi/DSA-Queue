package queue;
import java.util.Stack;

public class QueueUsingTwoStack {
	Stack <Integer>s1=new Stack<>();
	Stack <Integer>s2=new Stack<>();
	
	void push(int data)
	{
		s1.push(data);
	}
	
	int pop()
	{
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		int result=s2.pop();
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingTwoStack s=new QueueUsingTwoStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		System.out.println(s.pop());
		

	}

}
