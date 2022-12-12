package com.lec.ex01_object.ex04_clone.thin;
public class MemberMain {
	public static void main(String[] args) {
		
		// -  원본객체
		Member origin_mb=new Member("maple","어반시","1234a",20,true);
		
		// - 복제객체
		Member clone_mb=origin_mb.getMenber();
		System.out.println(origin_mb.hashCode()+" / "+clone_mb.hashCode());
		System.out.println(origin_mb.password.hashCode()+" / "+clone_mb.password.hashCode());
		
		
		//복제 후 패스워드 변경
		System.out.println("변경 전 패스워드 : "+ origin_mb.password);
		origin_mb.password="99999"; // 원본 비번 99999로 변경
		System.out.println("원본비번 바꾼 뒤 클론패스워드 : "+clone_mb.password); // 얜 원본따라 바뀌지않음
		System.out.println("원본 : "+origin_mb.password);


		System.out.println("비포 클론scores[0] : "+clone_mb.scores[0]);
		origin_mb.scores[0]=10;
		System.out.println("에프터 클론scores[0] : "+clone_mb.scores[0]);
		// 얕은복제라서 클론 아니고 오리진만 바꿔도 바뀌는 모습
	}
}