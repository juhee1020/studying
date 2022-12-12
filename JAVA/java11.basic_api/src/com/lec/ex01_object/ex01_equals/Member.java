package com.lec.ex01_object.ex01_equals;
import java.util.Objects;
/*

	객체비교
	
	equals메서드는 매개타입이 Object인데 이 의미는 Java의 모든 객체가 매개값으로 대입될 수 있다는 것이다.
	그 이유는 Object가 최상위 클래스이기 때문에 모든 객체는
	Object타입으로 자동형변환될 수 있기 때문이다.
	
	Java에서는 두 객체를 비교할 때 동등연산자(=)가 아니라 equals()메서드를 사용한다.
	두 객체를 비교해서 논리적으로 동등하다면 true, 아님 false를 리턴한다.
	
	equals메서드를 재정의 할때 매개값(비교객체)이 기존 객체와 동일타입의 객체인지를 먼저 확인해야한다.
	그렇지않으면 ClassCastException이 발생한다.
*/
public class Member {
	public String id; public String ssn; public int age;
	public Member(String id) {
		this.id=id;
	}
	/*
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	*/
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member=(Member)obj;
			if(id.equals(member.id)) {return true;}
		}return false;
		/*
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
		*/
	}
}
