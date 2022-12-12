package com.lec.ex01_object.ex04_clone.deep;
public class MemberMain {
	public static void main(String[] args) {
		// 1. 원본객체생성
		Member org_mb=new Member("샤샤샤",1000,new int[] {90,80,70,60}, new Car("롤스로이스"));
		
		// 2. 복제객체 생성 후 참조타입객체의 값을 변경
		Member clone_mb=org_mb.getMenber();
		System.out.println("원본 스코어 : "+org_mb.scores.hashCode());
		System.out.println("복제 스코어 : "+clone_mb.scores.hashCode());
		System.out.println();
		System.out.println("원본 카 : "+org_mb.car.hashCode());
		System.out.println("복제 카 : "+clone_mb.car.hashCode());
		System.out.println();
		clone_mb.scores[0]=100; clone_mb.car=new Car("포르쉐");
		for(int i=0; i<clone_mb.scores.length; i++) {
			System.out.print(clone_mb.scores[i]);
			System.out.print(i==(clone_mb.scores.length-1)?"":",");
		}
		System.out.println("\n소유차량 : "+org_mb.car.model);
	}
}