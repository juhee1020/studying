package com.lec.ex03_map.hashtable;
import java.util.*;

public class HashTableMain {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
		
		// 로긴정보 : select id, pw from members;
		map.put("user1234", "12user34!");
		map.put("user1004", "10user04!");
		map.put("user9999", "99user99!");
		map.put("user7777", "77user77!");
		
		// containsKey()
		System.out.println("회원의 비번 : "+ map.get("xxxx")); // null
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.println("아이디==>");
			String id=scanner.nextLine();
			System.out.println("비밀번호==>");
			String password=scanner.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).endsWith(password)) {
					System.out.println("로그인성공");
					break;
				}else {System.out.println("로그인실패");}
			}else {
				System.out.println("아이디를 찾지 못했습니다.");
				break;
			}
		}
	}
}