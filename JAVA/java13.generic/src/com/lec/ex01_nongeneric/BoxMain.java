package com.lec.ex01_nongeneric;
public class BoxMain {
	public static void main(String[] args) {
		Box 과일상자 = new Box();
		과일상자.setObject(new 사과()); // 자동형변환 : 사과 -> Object
		//▼ Object타입인 사과를 사과타입으로 뽑고싶다!
		사과 apple=(사과)과일상자.getObject(); // 강제형변환 Object -> 사과
		System.out.println(apple.getClass());
		

		Box 도구상자 = new Box();
		도구상자.setObject(new 해머()); // 자동형변환 : 해머 -> Object
		해머 hammer=(해머)도구상자.getObject(); // 강제형변환
		System.out.println(hammer.getClass());



		도구상자.setObject(new 사과());
		사과 hammer2=(사과)도구상자.getObject();
		
		과일상자.setObject(new 해머());
		해머 apple2=(해머)과일상자.getObject();
	}
}
class Box{
	//private String object;
	private Object object; // Object가 최상위라 다 들어갈 수잇ㅇ다.
	public Object getObject() {return object;}
	public void setObject(Object object) {this.object = object;}
	
}
class 사과{
	@Override
	public String toString() {
		return "^a^";
	}
}
class 배{
	@Override
	public String toString() {
		return "^ㅂ^";
	}
}
class 해머{
	@Override
	public String toString() {
		return "망치";
	}
}