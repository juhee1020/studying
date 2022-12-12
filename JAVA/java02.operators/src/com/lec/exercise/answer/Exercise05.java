package com.lec.exercise.answer;

public class Exercise05 {
	public static void main(String[] args) {
		int value=356;
		// 십의 자리 이하를 버리는 코드. val이 356이면 300이 나오도록 해라.
		System.out.println(value-value%100);
	}
}
