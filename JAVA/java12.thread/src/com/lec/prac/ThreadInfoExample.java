package com.lec.prac;
import java.util.*;

public class ThreadInfoExample {
	public static void main(String[] args) {
		Map<Thread, StackTraceElement[]> map=Thread.getAllStackTraces();
		Set<Thread> threads=map.keySet();
		for(Thread thread:threads) {
			if(thread.isDaemon()) {System.out.println(thread.getName()+" /데몬");}
			else System.out.println(thread.getName()+" / 주");
			System.out.println("소속그룹 : "+thread.getThreadGroup().getName()+"\n");
		}
	}
}