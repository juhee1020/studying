package com.lec.exercise;

public class ㅁㅁㅁ {
	public static void main(String[] args) {
		try {method1();}catch(Exception e) {System.out.println(5);}
		/*
		int lotto_num[]=new int[6];
		for(int i=0; i<lotto_num.length; i++) {
			lotto_num[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(lotto_num[i]==lotto_num[j]) {
					i--;
				}
			}
		}
		for(int i=0;i<lotto_num.length;i++) {
			System.out.print(lotto_num[i]+" ");
		}
		*/
		
	}
	static void method1() {
		try {
			method2();
			System.out.println(1);
		}catch(ArithmeticException e) {
			System.out.println(2);
		}finally {
			System.out.println(3);
		}
		System.out.println(4);
	}
	static void method2() {
		throw new NullPointerException();
	}
}