package com.lec.ex01_list;
import java.util.*;

public class ArrayListMain {
	public static void main(String[] args) {
	// 1. ArrayList - non Generic
		//1) add
		List list=new ArrayList<>();
		list.add("문자"); list.add(new String("브라질"));
		list.add(100); list.add(Integer.valueOf(100));
		list.add(new Car()); list.add(new Apple()); list.add(new Hammer());


		//2) get
		String str1=(String)list.get(0); // 첫번째꺼
		String str2=(String)list.get(1);
		Integer int1=(Integer)list.get(2);
		//String int2=(String)list.get(3); // Exception in thread "main" java.lang.ClassCastException
		Integer int2=(Integer)list.get(3);
		Car car = (Car) list.get(4);
		Apple apple = (Apple) list.get(5);
		Hammer hammer = (Hammer) list.get(6);
		
		System.out.println(str1+","+str2);
		System.out.println(int1+","+int2);
		System.out.println("car: "+car+"\napple: "+apple+"\nhammer: "+hammer);
		System.out.println();



	// 2. ArrayList - Generic
		List<String> list1=new ArrayList<>(); // 기본크기 10
		list1.add(new String("맨체스터유나이티드"));
		list1.add("2022월드컵");
		list1.add("Java");
		list1.add("JDBC");
		list1.add("JSP");
		list1.add("SpringFramework");
		//list1.add(100); // 에러
		//list1.add(Integer.valueOf(100)); // 도 당연 에러
		// ▲ The method add(int, String) in the type List<String> is not applicable for the arguments (int)
		// list1.add(new Car()); // 애플이나 해머도 당근 안됨.
		
		String str3=list1.get(0); // 제네릭으로 선언되엇기 때문에 형변환 필요없음
		System.out.println(str3);
		System.out.println();



	// 3. 삽입 - add(위치, 값)
		list1.add(0,"레알마드리드"); // 0 위치에 레알마드리드 집어넣음
		for(int i=0;i<list1.size();i++) {
			System.out.println("list[" + i + "] = " + list1.get(i));
		}
		// 원래 0번째에 맨유부터 다들 한칸씩 밀린다.
		System.out.println();



	// 4. 삭제 - remove(위치)
		list1.remove(1); // 1번위치꺼 삭제
		for(int i=0; i<list1.size();i++) {
			System.out.println(list1.get(i));
		} // 맨유가 삭제됏다.
		System.out.println();



	// 5. 중복확인 - JSP가 두개
		list1.add(2, "JSP"); // jsp 추가.
		for(int i=0;i<list1.size();i++) {
			System.out.println("list[" + i + "] = " + list1.get(i));
		} // 다 출력해보면 jsp가 두개 나온다.
		System.out.println();



	// 6. 전체삭제 clear()
		list1.clear();
		System.out.println("list1의 사이즈 : "+list1.size());

	}
}

class Car{}
class Apple{}
class Hammer{}