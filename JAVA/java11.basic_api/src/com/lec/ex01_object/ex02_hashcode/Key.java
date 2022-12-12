package com.lec.ex01_object.ex02_hashcode;
//import java.util.Objects;

/*     
	객체의 해시코드
	
	객체의 해시코드란? 객체를 식별하는 하나의 정수값을 말한다.
	Object의 hashCode()메서드는 객체의 메모리번지를 이용해서 
	해시코드를 만들어 리턴하기 때문에 객체마다 다른값을 가지고 있다.
	논리적으로 동등비교시에 hashCode를 재정의할 필요성이 있는
	Collection Framework에서 HashSet, HashMap, HashTable은 
	equals()메서드를 이용해서 비교하기 때문이다.
*/
public class Key {
	public int number;
	
	public Key(int number) {
		this.number=number;
	}

	@Override
	public int hashCode() {/*return Objects.hash(number);*/
		return this.number;}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key otherKey=(Key)obj;
			if(this.number==otherKey.number) {
				return true;}
		}
		return false;
		/*
		if (this == obj)return true;
		if (obj == null)return false;
		if (getClass() != obj.getClass())return false;
		Key other = (Key) obj;
		return number == other.number;
		*/
	}
	
	
}