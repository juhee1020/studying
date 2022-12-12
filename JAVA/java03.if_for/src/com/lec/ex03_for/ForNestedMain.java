package com.lec.ex03_for;
public class ForNestedMain {
	public static void main(String[] args) {
		// 구구단
		/*
		for(int i=2; i<=9; i++) {
			System.out.println("-----"+i+"단----- ▼");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
		*/
		// 실습. 구구단
		// System.out.printf("%d x %d = %2d", 2,2,4); 이렇게 쓰는것도 가능.
		for(int i=1; i<=9; i++) {
			System.out.println();
			for(int j=2; j<=9; j++) {
				System.out.print(j+"x"+i+"="+i*j+"\t\t");
			}
		}
		System.out.println("\n--------------------");
		String gugudan;
		for(int i=1; i<=9;i++) {
			gugudan="";
			for(int dan=2; dan<=9; dan++) {
				gugudan+=dan+"x"+i+"="+(dan*i)+"\t\t";
			}
			System.out.println(gugudan);
		}
	}
}