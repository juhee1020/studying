package com.lec.ex02_set;
import java.util.*;

public class HashSetMain1 {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("잉글랜드");
		set.add("네덜란드");
		set.add("프랑스");
		set.add("아르헨티나");
		set.add("네덜란드"); // 중복은 에러 발생하지않지만 저장되지는않는다.
		System.out.println("총 객체 수 : "+set.size()+"\n"); // 4


		// Set 컬랙션 읽기
		Iterator<String> data=set.iterator();
		while(data.hasNext()) {
			String val=data.next();
			System.out.print(val+"\t"); // 순서가 없음! 무작위로 꺼내온다.
		}System.out.println("\n");

		//System.out.println(data.next()); // NoSuchElementException
		// 18줄에서 넥스트로 해서 다 꺼내와서 그런가.?
		System.out.println(data.hasNext()); // false
		
		data=set.iterator();// 꺼내와서 hasNext없는거 채운거인가? 음...
		System.out.println(data.hasNext()+"\n"); // true
		System.out.println(data.next()+"\n");


		// Set 컬랙션 삭제
		set.remove("프랑스");
		System.out.println("set.remove() 프랑스 지움///\n\n▼아래는 while문으로 돌려서 data.next로 뽑아봄");
		data=set.iterator();
		while(data.hasNext()) {
			String val=data.next();
			System.out.print(val+"\t"); // 프랑스 날라갔다.
		}System.out.println("\n");


		// Set 전체삭ㅈ
		set.clear();
		System.out.println(set.size()); // 0
	}
}