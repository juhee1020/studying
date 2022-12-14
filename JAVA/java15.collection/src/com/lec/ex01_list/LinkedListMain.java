package com.lec.ex01_list;
import java.util.*;
public class LinkedListMain {
	public static void main(String[] args) {
		List<String> arrList=new ArrayList<>();
		List<String> linkedList=new LinkedList<>();
		
		//ArrayList vs LinkedList 성능 비교
		long start, finish;
		
		// a. ArrayList
		start = System.nanoTime();	
		for(int i=0; i<500000;i++) {
			arrList.add(0,String.valueOf(i));
		}
		finish = System.nanoTime();
		System.out.println("ArrayList의 소요시간  : "+(finish-start)+" ns");
		// 30974712195 ns


		// b. LinkedList
		start = System.nanoTime();
		for(int i=0;i<500000;i++) {
			linkedList.add(0,String.valueOf(i));
		}
		finish = System.nanoTime();
		System.out.println("LinkedList의 소요시간 : " + (finish - start) + " ns");
		// 78628633 ns
	}
}