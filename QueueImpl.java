package com.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {

	public static void main(String arg[]) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(1);
		q.add(5);
		q.add(10);
		q.add(15);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.size());
		System.out.println(q);
		
		PriorityQueue<String> q1=new PriorityQueue<String>();
		q1.add("Anudeep");
		q1.add("Reddy");
		q1.add("Ramala");
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.poll());
		System.out.println(q1.size());
		System.out.println(q1);
		
		Deque<Integer> dq=new LinkedList<Integer>();
		dq.add(10);
		dq.addLast(2);
		dq.add(5);
		dq.add(7);
		dq.addFirst(1);
		dq.addLast(8);
		dq.add(10);
		dq.addLast(2);
		dq.add(5);
		dq.add(4);
		dq.addFirst(1);
		dq.addLast(8);
		
		System.out.println(dq);
		System.out.println(dq.peek());
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq.poll());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
		dq.pop();
		System.out.println(dq);
		dq.push(1);
		System.out.println(dq);
		dq.remove();
		dq.removeFirst();
		dq.removeFirstOccurrence(5);
		dq.removeLast();
		dq.add(2);
		System.out.println(dq);
		dq.removeLastOccurrence(2);
		System.out.println(dq);
		System.out.println(dq.size());
	}
}
