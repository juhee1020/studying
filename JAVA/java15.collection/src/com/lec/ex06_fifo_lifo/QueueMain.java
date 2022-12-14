package com.lec.ex06_fifo_lifo;
import java.util.*;

public class QueueMain {
	public static void main(String[] args) {

		Queue<Message> msgQueue=new LinkedList<>();

		msgQueue.offer(new Message("twitter","홍길일"));
		msgQueue.offer(new Message("mail","홍길이"));
		msgQueue.offer(new Message("facebook","홍길삼"));
		msgQueue.offer(new Message("instar","홍길사"));
		msgQueue.offer(new Message("facebook","홍길오"));
		msgQueue.offer(new Message("kakaotalk","홍길육"));
		System.out.println();
		
		while(!msgQueue.isEmpty()) {
			Message msg=msgQueue.poll();
			System.out.println(msg.command +" / "+msg.to);
		}
	}
}

class Message{
	String command; String to;

	public Message(String command, String to) {
		super();
		this.command = command; this.to = to;
	}
}