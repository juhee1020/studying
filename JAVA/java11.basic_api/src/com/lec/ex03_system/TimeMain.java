package com.lec.ex03_system;
// 두번째

public class TimeMain {
	public static void main(String[] args) {
		
		// 1~1000000까지의 합을 구하는데 소요 시간
		long start=System.nanoTime();
		
		int sum=0;
		for(int i=1;i<=10000000; i++) {
			sum+=i;
		}
		long end =System.nanoTime();
		
		System.out.println("10000000까지의 합:"+sum);
		System.out.println("걸린시간:"+(end-start)+"ns");
	}
}