package com.lec.ex02_array;
public class MultiArrayMain {
	public static void main(String[] args) {
		// Java에서는 다차원배열을 선언할 수 있다.
		// 다차원배열은 정방향과 비정방형도 선언할 수 있다.


		// 1. 2행 3열인 배열 선언하기
		int[][] mathScores = new int[2][3];
		
		// 배열의 크기확인
		System.out.println(mathScores.length); // 2 - 앞에꺼?만 나온다.
		System.out.println(mathScores[0].length); // 3
		System.out.println(mathScores[1].length); // 3
		System.out.println("--------------------");


		// 2. 정방형 배열
		for(int i=0; i<mathScores.length;i++) { // 얜 두번 돌고
			for(int j=0; j<mathScores[i].length; j++) { // 얜 세번 돌고~
				System.out.println("mathScores["+i+"]["+j+"]");
			} // 중첩포문
		}
				/* 위 포문 결과
				mathScores[0][0]
				mathScores[0][1]
				mathScores[0][2]
				mathScores[1][0]
				mathScores[1][1]
				mathScores[1][2]
				*/
		System.out.println("--------------------");


		// 3. 비정방형 배열
		int[][] engScores=new int[3][]; // 3행 ?열. ?열은 아직 크기가 확정되지않았다.
		System.out.println(engScores.length); // 3
		// System.out.println(engScores[0].length); // 아직 초기화안됏기때문에 에러~
		engScores[0]=new int[2];
		engScores[1]=new int[5];
		engScores[2]=new int[1];
		System.out.println(engScores[0].length); // 2
		System.out.println(engScores[1].length); // 5
		System.out.println(engScores[2].length); // 1

		for(int i=0; i<engScores.length;i++) {
			for(int j=0; j<engScores[i].length; j++) {
				System.out.println("engScores["+i+"]["+j+"]");
			}
		}
				/*
				engScores[0][0]
				engScores[0][1]
				engScores[1][0]
				engScores[1][1]
				engScores[1][2]
				engScores[1][3]
				engScores[1][4]
				engScores[2][0]
				*/
		System.out.println("--------------------");


		// 4. 2차원배열을 선언과 동시에 초기화하기
		int[][] korScores = {{70,88},{20,10,90,60,77},{95}};
		for(int i=0; i<korScores.length;i++) {
			for(int j=0; j<korScores[i].length; j++) {
				System.out.println("korScores["+i+"]["+j+"]="+korScores[i][j]);
			}
		}
		System.out.println("--------------------");


		// 5. 참조타입
		String[][] singers= {{"윤하","다비치"},{"BTS","BLACKPINK","IDLE"},{"임영웅","송가인"}};
		for(int i=0; i<singers.length;i++) {
			for(int j=0; j<singers[i].length; j++) {
				System.out.println("singers["+i+"]["+j+"]="+singers[i][j]);
			}
		}
				/*
				singers[0][0]=윤하
				singers[0][1]=다비치
				singers[1][0]=BTS
				singers[1][1]=BLACKPINK
				singers[1][2]=IDLE
				singers[2][0]=임영웅
				singers[2][1]=송가인
				*/
		System.out.println("--------------------");


		// 6. 얕은 복사
		String[][] names=singers;
		names[1][0]="방탄소년단";
		names[1][1]="블랙핑크";
		for(int i=0; i<names.length;i++) {
			for(int j=0; j<names[i].length; j++) {
				System.out.println("singers["+i+"]["+j+"]="+names[i][j]);
			}
		}System.out.println("--------------------");
		for(int i=0; i<singers.length;i++) {
			for(int j=0; j<singers[i].length; j++) {
				System.out.println("singers["+i+"]["+j+"]="+singers[i][j]);
			}
		}
	}
}
