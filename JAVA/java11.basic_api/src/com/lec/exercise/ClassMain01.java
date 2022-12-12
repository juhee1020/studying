package com.lec.exercise;

public class ClassMain01 {
	public static void main(String[] args) {
		SutdaCard c1=new SutdaCard(3,true);
		SutdaCard c2=new SutdaCard(3,true);
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2) : "+c1.equals(c2));
	}
}
class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	@Override
	public boolean equals(Object obj) {
	// 코드작성
		if(obj instanceof SutdaCard) {
			SutdaCard card=(SutdaCard)obj;
			if(this.num==card.num && this.isKwang==card.isKwang) {
				return true;
				}
		}return false; // 작성 끝
	}
	@Override
	public String toString() {
		return num+(isKwang?"K":"");
	}
}