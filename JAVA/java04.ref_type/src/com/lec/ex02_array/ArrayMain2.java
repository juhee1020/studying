package com.lec.ex02_array;
public class ArrayMain2 {
	public static void main(String[] args) {
		// 2. new 연산자 : 배열의 선언과 초기화
		int scores[]; // 선언만 되어있고 크기, 값 등은 선언되어 있지 않다.
		// System.out.println(scores[0]); // 에러. The local variable scores may not have been initialized
		scores= new int[]{10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		for(int i=0; i<scores.length;i++) {
			sum+=scores[i];}
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+(double)sum/scores.length);
		System.out.println("----------------------");



		// 3. 메서드를 사용해서 배열처리
		int tot=total(scores); // total에 마우스 > 크리에이트 메서드
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+(double)tot/scores.length);
		
		// xxx(); // 호출안됨.
		yyy();
	}
	//메서드 생성 방법.
	// public void 메서드명(){}
	// public 리턴타입 메서드명(){ return 리턴타입의 값;}
	// 아랫줄 static으로 해줘야지만 에러 안걸린다. (안쓰면 18줄에 total이 기울기가 없어지고 에러가 생긴다.)
	// total이 누워있는 이유가 얘가 스태틱 변수나 스태틱 메서드라는 이야기이다.
	public static int total(int[] scores){ // scores를 받으므로 관례상 scores라고 적어주자.
		int tot=0;
		for(int i=0; i<scores.length;i++) {tot+=scores[i];}
		return tot;
	}
	// 22,23줄에서 호출해봤다.
	void xxx() {}; // 얜 호출 안된다. (스태틱이 아니라서.. 스태틱 붙여줘야함.)
	static void yyy() {};
/*	
	private static int total(Object object) {
		// TODO Auto-generated method stub
		return 0;
	}
*/
}
