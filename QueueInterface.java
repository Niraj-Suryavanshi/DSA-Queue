package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;


public class QueueInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue<Integer>q=new LinkedList<>();
		Queue<Integer>q=new ArrayDeque<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		System.out.println(q.size());
		System.out.println(q.peek());
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		
		System.out.println(q.isEmpty());
		System.out.println(q.size());

	}

}
