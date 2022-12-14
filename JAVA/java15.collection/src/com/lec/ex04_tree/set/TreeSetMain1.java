package com.lec.ex04_tree.set;
import java.util.*;

/*
	TreeSet은 이진트리(binary tree)를 기반으로 한 컬렉션이다.
	하나의 노드는 노드값인 value와
	왼쪽과오른쪽 자식 노드를 참조하기 위한 두개의 변수로 구성된다.
	TreeSet에 객체를 저장하면 자동으로 정렬되는데
	부모값과 비교해서 낮은것은 왼쪽자식노드에,
	높은것은 오른쪽 자식 노드에 저장한다.
*/
public class TreeSetMain1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores=new TreeSet<>();
		// Set 인터페이스 타입 변수에 대입해도 되지만 TreeSet클래스 타입으로 대입한 이유는
		// 객체를 찾거나 범위 검색과 관련된 메소드를 사용하기 위해서다.

		//scores.add(new Integer(100)); // 이 방법은 잘 안쓴다?
		scores.add(Integer.valueOf(100));
		scores.add(Integer.valueOf(80));
		scores.add(Integer.valueOf(95));
		scores.add(Integer.valueOf(75));
		scores.add(Integer.valueOf(75)); // 중복저장안됨
		scores.add(Integer.valueOf(55));
		System.out.println("총 객체 수 : "+scores.size());

		Integer score=null;

		// 가장 낮은 점수, 가장 높은 점수
		score=scores.last();
		System.out.println("가장 높은 점수 : "+score);
		score=scores.first();
		System.out.println("가장 낮은 점수 : "+score);

		// 95 바로 아래 점수, 95 바로 위 점수
		score=scores.lower(95);
		System.out.println("95 아래 점수 : "+score);
		score=scores.higher(95);
		System.out.println("95 아래 점수 : "+score);

		score=scores.floor(95);
		System.out.println("95 포함 95 아래 점수 : "+score);

		score=scores.ceiling(95);
		System.out.println("95 포함 95 위 점수 : "+score);
		System.out.println();


		while(!scores.isEmpty()) {
			//score=scores.pollLast(); // 가장 값이 큰 객체를 꺼내오고 컬렉션에서 삭제
			score=scores.pollFirst(); // 가장 값이 작은 객체 꺼내오고 컬렉션에서 삭제
			System.out.println(score);
			System.out.println("총 객체 수 : "+scores.size());
		}
		
	}
}