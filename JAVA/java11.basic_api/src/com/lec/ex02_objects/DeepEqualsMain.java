package com.lec.ex02_objects;

import java.util.Objects;

public class DeepEqualsMain {
	public static void main(String[] args) {
/*
	동등비교 (equals()와 deepEquals())
	
		Objects.equals(Object a, Object b)메서드는 두 객체의 동등을 비교하는데
		1) a와 b 모두 null일 경우 true
		2) a와 b가 not null일 경우 a.equals(b)의 결과를 리턴
		
		Objects.deepequals(Object a, Object b)메서드 역시 두 객체의 동등을 비교하는데
		1) a와 b가 서로 다른 배열일 경우, 항목의 값이 모두 같다면 true를 리턴.
		2) 이 메서드는 Arrays.deepEquals(Object[] a, Object[] b)와 동일 기능을 제공한다.
*/
		Integer o1=1000;
		Integer o2=1000;
		System.out.println(Objects.equals(o1, o2)); // true
		System.out.println(Objects.equals(o1, null)); // false
		System.out.println(Objects.deepEquals(o1, o2)); // ture
		System.out.println();
		Integer[] arr1= {1,2,3};
		Integer[] arr2= {1,2,3};
		System.out.println(Objects.equals(arr1, arr2)); // false
		System.out.println(Objects.deepEquals(arr1, arr2)); // true
	}
}
