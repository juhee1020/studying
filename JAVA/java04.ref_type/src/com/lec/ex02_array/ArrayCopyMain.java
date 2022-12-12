package com.lec.ex02_array;

import java.util.Arrays;

/*
	배열의 복사

	참조타입배열일 경우, 배열복사가 되면 복사되는 값이 객체의 메모리주소이기 때문에
	새 배열의 항목은 이전 배열의 항목이 참조하는 객체(메모리주소)와 동일하다.

	이 것을 얕은 복사 (shallow copy)라고 한다.

	반대로 깊은 복사(deep copy)는 참조하는 객체도 별도로 생성해서 복사하는 것을 말한다.


	Array복사

	Java에서는 배열을 한번 생성하면 크기를 변경할 수 없기 때문에 더 많은 저장요소를 저장하려면
	보다 큰 배열을 새로 만들고 이전 배열에서 항목값을 별도로 복사해야 한다.

	배열간 항목을 복사하려면 for문을 이용하거나 System.arraycopy() or Arrays.copfof()
*/
public class ArrayCopyMain {
	public static void main(String[] args) {
		// 1. 얕은 복사
		String[] oldArray= {"JAVA", "ARRAY", "COPY"};
		String[] newArray=oldArray;
		
		oldArray[0]="Python";
		System.out.println("oldArray=");
		// 향상된 for문 - <배열>에만 사용한다!
		for(String x : oldArray) {
			System.out.print(x+","); // Python,ARRAY,COPY,
		}
		System.out.println("\n--------------------");
		System.out.println("newArray=");
		for(String x : newArray) {
			System.out.print(x+","); // Python,ARRAY,COPY, // newArray는 건드리지않았지만 파이썬으로 바뀐 모습.
		}
		System.out.println();System.out.println("--------------------\n");


		// 2. 깊은 복사
			// 1) for문을 이용
			String[] old1 = {"스타벅스","녹색녹색","텀블러"};
			String[] new1 = new String[3];
			
			for(int i=0; i<old1.length; i++) {
				new1[i]=old1[i];
			}
			old1[0]="갤럭시노트20";
			for(String x : old1) {
				System.out.print(x+","); // 갤럭시노트20,녹색녹색,텀블러,
			}
			System.out.println("\n--------------------");
			for(String x : new1) {
				System.out.print(x+","); // 스타벅스,녹색녹색,텀블러,
			}
			System.out.println("\n--------------------\n");

			// 2) System.arraycopy(old, old시작, new, new시작, old크기) 이용
			String[] old2= {"맨시티","리버풀","첼시"};
			String[] new2=new String[6];
			System.arraycopy(old2, 0, new2, 0, old2.length);
			old2[0]="파리";
			new2[3]="아스날"; new2[4]="맨유"; new2[5]="토트넘";
			for(String x : old2) {
				System.out.print(x+","); // 파리,리버풀,첼시,
			}
			System.out.println("\n--------------------");
			for(String x : new2) {
				System.out.print(x+","); // 맨시티,리버풀,첼시,아스날,맨유,토트넘,
			}
			System.out.println("\n--------------------\n");
			// 3) Arrays.copfof()
					// a. Arrays.copyOf(src, new.length)
					// b. Arrays.copyOfRange(src, start, end-1)
			int[] old3 = {1,2,3,4,5};
			int[] new3 = Arrays.copyOf(old3, 3); // 3개만 카피떴음.
			old3[0]=100;
			for(int x : old3) {
				System.out.print(x+","); // 100,2,3,4,5,
			}
			System.out.println("\n--------------------");
			for(int x : new3) {
				System.out.print(x+","); // 1,2,3
			}
			System.out.println("\n--------------------\n");

			int[] old4 = {1,2,3,4,5};
			int[] new4 = Arrays.copyOfRange(old4, 1, 4);
			for(int x : old4) {
				System.out.print(x+","); // 1,2,3,4,5,
			}
			System.out.println("\n--------------------");
			for(int x : new4) {
				System.out.print(x+","); // 2,3,4,
			}
	}
}