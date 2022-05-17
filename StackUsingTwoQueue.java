package queue;
import java.util.Queue;
import java.util.*;

public class StackUsingTwoQueue {
	Queue<Integer> q1=new ArrayDeque<>();
	Queue<Integer> q2=new ArrayDeque<>();
	
	void push(int data)
	{
		while(!q1.isEmpty())
		{
			q2.offer(q1.poll());
		}
		q1.offer(data);
		
		while(!q2.isEmpty())
		{
			q1.offer(q2.poll());
		}
		
	}
	
	int pop()
	{
		return q1.poll();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingTwoQueue s=new StackUsingTwoQueue();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		

	}

}
