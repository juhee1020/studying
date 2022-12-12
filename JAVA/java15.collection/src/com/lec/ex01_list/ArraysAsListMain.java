package com.lec.ex01_list;
import java.util.*;

public class ArraysAsListMain {
	public static void main(String[] args) {

	// 일반배열 초기화
		String[] names= {"프랑스","잉글랜드","아르헨티나","네덜란드"};

	// ArrayList는 일반배열처럼 초기화기능 없다.
	// 대신에 Arrays.asList(값,...값n) 이용해 초기화
	// ArrayList를 생성하고 런타임시에 필요에 따라 객체를 추가하는 방법이 일반적이만
	// 고정된 객체로 구성된 List를 생성할 경우에는 Arrays.asList() 메서드를 사용하는것이 편하다.
	// 다만, Arrays.asList()메서드로 생성된 ArrayList는 크기를 변경할 수 없다.
		
		List<String> list1=new ArrayList<>(4);
		// ArrayList생성자를 이용하는 대신에 Arrays.asList로 간편하게 생성할 수 있다.
		List<String> list2=Arrays.asList("프랑스","잉글랜드","아르헨티나","네덜란드");
		// 다만 Arrays.asList로 생성됐다면 크기가 고정된다. (추가,삭제 불가능)


		for(int i=0; i<names.length;i++) {list1.add(names[i]);}
		list1.add("한국");
		for(String name:list1) {System.out.println(name);}
		System.out.println("\n"+list1.size());
		//list2.add("한국"); // Exception in thread "main" java.lang.UnsupportedOperationException
		// list2.remove(0);


		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = 0;
		for(Integer num:numbers) {
			sum += num;
		}
		System.out.println("\n1~10까지의 합 = " + sum);
	}
}