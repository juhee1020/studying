package com.lec.ex03_map.hashmap;
import java.util.*;

public class HashMapMain2 {
	public static void main(String[] args) {
		Map<Student, Integer> students=new HashMap<>();
		
		students.put(new Student(1, "메이플"),100);
		students.put(new Student(1, "메이플"),95);
		System.out.println("총 객체수 : "+students.size());
		
	}
}


class Student{
	private int sno; private String name;

	public Student(int sno, String name) {
		super();
		this.sno = sno; this.name = name;
	}

	// 실습. hashCode, equals를 사용자가 재정의해 동일객체 여부
		// sno, name, (sno, name)
	
	@Override
	public int hashCode() {
		return this.sno+this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std=(Student)obj;
			return (this.sno==std.sno && this.name.equals(obj));
		}
		return false;
	}
	
	/*
	@Override
	public int hashCode() {
		return Objects.hash(name, sno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && sno == other.sno;
	}
	*/

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
}