package com.lec.ex02_set;
import java.util.*;

public class HashSetMain2 {
	public static void main(String[] args) {
		Set<Member> members=new HashSet<>();
		members.add(new Member("손흥민",30));
		members.add(new Member("이강인",21));
		members.add(new Member("손흥민",30));
		members.add(new Member("손흥민",20));

		System.out.println("총 객체수 : "+members.size()); // 4 
		//이름이 같거나, 이름과 나이가 같거나 해도 카운트가 되는 모습

		for(Member member:members) {
			System.out.println(member.toString()+" / "+member.hashCode());
		}
		
		
	}
}

class Member{
	String name; int age;

	public Member(String name, int age) {
		super();
		this.name = name; this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		//return super.hashCode();
		return this.name.hashCode()+age;
	}

	@Override
	public boolean equals(Object obj) {
		//return super.equals(obj);
		// 이름과 나이가 같을 경우 동일객체로 판단
		if(obj instanceof Member) {
			Member member=(Member) obj;
			return (member.name.equals(this.name)&&member.age==this.age);
		}
		return false;
	}
}