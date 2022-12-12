package com.lec.ex07_arrays;

import java.util.Arrays;

/*
	Arrays 클래스
	
	Arrays클래스는 배열에 관한 조작기능을 가지고 있다.
	배열의 복사, 항목의 정렬, 항목검색과 같은 기능을 제공하는 메서드를 가지고 있다.
	
	단순한 배열의 복사는 System.arraycopy()메서드를 사용할 수 있으나
	Arrays는 추가적으로 항목정렬, 검색, 비교와 같은 기능을 제공한다.
	Arrays관련 모든 메서드는 static이기 때문에 객체생성없이 Arrays클래스로 직접 메서드를 호출할 수 있다.
*/
public class ArraysMain {
	public static void main(String[] args) {
	// 1. 기본타입 정렬 및 검색
		int[] scores= {90,40,60,10,87};
		System.out.println(scores[0]+" "+scores[1]); // 소트 전 
		Arrays.sort(scores);
		System.out.println(scores[0]+" "+scores[1]); // 소트 후
		
		int index=Arrays.binarySearch(scores, 87);
		System.out.println("항목 "+scores[index]+"점의 위치는 : "+index);
		System.out.println();


	// 2. String 정렬 및 검색
		String[] names= {"블랙핑크","카라","소녀시대","트와이스","아이브"};
		Arrays.sort(names);
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
		}
		int index1=Arrays.binarySearch(names, "아이브");
		System.out.println("\n항목 ["+names[index1]+"]의 위치는 : "+index1);
		System.out.println();
		
		
	// 3. 객체의 정렬 및 검색
		// 객체를 정렬하려면 Comparable 인터페이스의 추상메서드인 
		// compareTo()메서드를 재정의 해야한다.
		// 만약 Comparable인터페이스를 구현하지않고 정렬을 하려면
		// 예외가 발생. Arrays.sort()는 자동으로 오름차순으로 정렬한다.
		Member m1=new Member("포도");
		Member m2=new Member("사과");
		Member m3=new Member("자두");
		
		Member[] members= {m1,m2,m3};
		Arrays.sort(members);
		for(int i=0;i<members.length;i++) {
			System.out.print(members[i].name+" "); // .name 빼면 toString() 뜨는것같음?
		}
		int index2=Arrays.binarySearch(members, m1); // m1자리에 "포도"  넣으면 예외(에러?) 뜨는것같다.
		System.out.println("\n항목 ["+members[index2].name+"]의 위치는 : "+index2);
		System.out.println();
	}
}

class Member implements Comparable<Member>{
	
	String name;
	
	public Member(String name) {
		this.name=name;
	}

	@Override
	public int compareTo(Member o) {
		return this.name.compareTo(o.name); // -1 0 1
	}
	
}