package com.lec.ex01_object.ex05_finalize;
public class CounterMain {
	public static void main(String[] args) {
		Counter counter=null;
		for(int i=0; i<=50; i++) {
			counter=new Counter(i);
			counter=null; // Counter객체를 쓰레기로 만듦
			System.gc(); // 가비지콜랙터에게 사용하지않는객체는 힙영역에서 삭제요청.
		}
	}
}