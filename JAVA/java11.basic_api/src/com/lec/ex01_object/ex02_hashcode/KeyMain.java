package com.lec.ex01_object.ex02_hashcode;
public class KeyMain {
	public static void main(String[] args) {
		Object object1=0; // 0은 기본타입 int에서 객체로 자동형변환 된것
		Object object2=0;
		Object object3="0";
		Object object4=new String("0");
		// 모두 객체로 형변환됏기 때문에 안에 내용물은 다 같음?
		
		
		System.out.println(object1.hashCode()); //0
		System.out.println(object2.hashCode()); //0
		System.out.println(object3.hashCode()); //48
		System.out.println(object4.hashCode()); //48
		System.out.println();
		
		System.out.println(object1==object2); //true
		System.out.println(object1==object3); //false
		System.out.println(object1==object4); //false
		System.out.println(object2==object3);
		System.out.println(object3==object4);
		System.out.println();
		
		System.out.println(object1.equals(object2)); //true
		System.out.println(object1.equals(object3)); //false
		System.out.println(object1.equals(object4)); //false
		System.out.println();
		
		System.out.println(object1.toString()); // 4개 다 0
		System.out.println(object2.toString());
		System.out.println(object3.toString());
		System.out.println(object4.toString());
		System.out.println();
		
		Key key1=new Key(0); Key key2=new Key(0);
		
		System.out.println(key1.hashCode()); // 1586600255
		System.out.println(key2.hashCode()); // 474675244
		System.out.println(key1.equals(key2)); // false
		System.out.println(key1.toString()); // com.lec.ex01_object.ex02_hashcode.Key@5e91993f
		System.out.println(key2.toString()); // com.lec.ex01_object.ex02_hashcode.Key@1c4af82c
		System.out.println(key1.hashCode()==key2.hashCode()); // false
		
		// Key에서 equals랑 hashcode 재정의하고 난 뒤 결과는 알아서 확인
		// 위에는 하기 전 결과임.
	}
}