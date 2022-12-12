package com.lec.ex03_map.hashmap;
import java.util.*;

public class HashMapMain1 {
	public static void main(String[] args) {
	// 1. Map객체 생성
		Map<String, Integer> map=new HashMap<>();


	// 2. put() 객체 저장
		map.put("메이플", 2000);
		map.put("네덜란드", 105);
		map.put("잉글랜드", 120);
		map.put("프랑스", 150);
		map.put("아르헨티나", 200);
		map.put("한국", 222);
		map.put("메이플", 100); // 키 중복은 에러는 발생하지않지만 위에 2000에서 100으로 대체된다.
		System.out.println("총 객체 수 : "+map.size()+"\n"); // 6
		
		Map<Integer, String> map2=new HashMap<>();
		map2.put(1, "오마이걸");
		map2.put(1, "블랙핑크");
		System.out.println("총 객체 수 : "+map2.size()+"\n"); // 1 
		// 오마이걸에서 블랙핑크로 대체됨.


	// 3. 객체검색(1) - get(Object)
		System.out.println("네덜란드의 숫자는 : "+map.get("네덜란드"));
		System.out.println("메이플의 숫자는 : "+map.get("메이플"));
		System.out.println("1번 걸그룹은 "+map2.get(1)+"입니다.\n");


	// 4. 객체검색(2) - keySet()
		Set<String> keySet=map.keySet();
		Iterator<String>names=keySet.iterator();
		while(names.hasNext()) {
			String name=names.next();
			map.get(name);
			Integer num=map.get(name);
			System.out.println(name+"의 번호는 "+num);
		}
		System.out.println();


	// 5. 객체검색(3) - entrySet()
		Set<Map.Entry<String, Integer>>entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entrys=entrySet.iterator();
		while(entrys.hasNext()) {
			Map.Entry<String, Integer>entry=entrys.next();
			entry.getKey();
			entry.getValue();
			String name=entry.getKey();
			Integer num=entry.getValue();
			System.out.println(name+"의 번호는 "+num);
		}
		System.out.println();


	// 6. 객체삭제 - remove
		map.remove("네덜란드");
		System.out.println("총 객체 수 : "+map.size()+"\n");


	// 7. 전체삭제 - clear()
		map.clear();
		System.out.println("총 객체 수 : "+map.size()+"\n");
	}
}