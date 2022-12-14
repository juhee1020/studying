package com.lec.ex04_tree.set;
import java.util.*;

public class TreeSetMain2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores=new TreeSet<>();
		scores.add(Integer.valueOf(99));
		scores.add(Integer.valueOf(15));
		scores.add(Integer.valueOf(29));
		scores.add(Integer.valueOf(56));
		scores.add(Integer.valueOf(87));
		scores.add(Integer.valueOf(71));
		
		// TreeSet은 저장될때 자동으로 오름차순으로 정렬되어 저장된다. 
		// (그래서 메서드가 descending만 잇는것.)
		for(Integer score:scores) {
			System.out.print(score+" ");
		}
		System.out.println("\n");
		
		// 내림차순
		// descendingIterator() : 내림차순으로 정렬된 Iterator를 리턴
		// descendingSet() : 내림차순으로 정렬된 NavigableSet을 반환
		NavigableSet<Integer> descendginScores=scores.descendingSet();
		for(Integer score:descendginScores) {
			System.out.print(score+" ");
		}
		System.out.println("\n");
		// 오름차순
		NavigableSet<Integer> ascendingScores=descendginScores.descendingSet();
		for(Integer score:ascendingScores) {
			System.out.print(score+" ");
		}
	}
}