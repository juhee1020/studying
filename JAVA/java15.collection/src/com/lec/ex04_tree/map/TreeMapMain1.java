package com.lec.ex04_tree.map;
import java.util.*;

public class TreeMapMain1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> scores=new TreeMap<>();
		scores.put(100, "가나다");
		scores.put(60, "나다라");
		scores.put(30, "다라마");
		scores.put(90, "라마바");
		scores.put(70, "마바사");
		scores.put(88, "바사아");
		scores.put(95, "바밤바");
		
		Map.Entry<Integer, String> student=null;
		
		student=scores.firstEntry();
		System.out.println("가장 낮은 점수를 받은 친구는 "+student.getValue()+"입니다. [socre="+student.getKey()+"]");
		student=scores.lastEntry();
		System.out.println("가장 높은 점수를 받은 친구는 "+student.getValue()+"입니다. [socre="+student.getKey()+"]");
		student = scores.lowerEntry(95);
		System.out.println("95 바로 아래 점수 : " + student.getValue() + " = " + student.getKey());
		student = scores.higherEntry(95);
		System.out.println("95 바로 위 점수 : " + student.getValue() + " = " + student.getKey());
		student = scores.floorEntry(95);
		System.out.println("95 포함 바로 위 점수 : " + student.getValue() + " = " + student.getKey());
		student = scores.ceilingEntry(95);
		System.out.println("95 포함 바로 위 점수 : " + student.getValue() + " = " + student.getKey());
		System.out.println();
		
		// 외에도 treesetmain1에 잇는 메서드와 같은 메서드를 가지는 것 같다.


		while(!scores.isEmpty()) {
			student=scores.pollFirstEntry();
			System.out.println(student.getValue()+" : "+student.getKey());
			if(scores.size()==0) {System.out.println("남은객체 : "+scores.size());}
		}
	}
}