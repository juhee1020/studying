package com.lec.exercise.answer;

class SutdaDeck_1{
	final int CARD_NUM=20;
	SutdaCard[] cards=new SutdaCard[CARD_NUM];
	
	SutdaDeck_1() {
		for(int i=0; i<CARD_NUM; i++) {
			if(i==0 || i==2 || i==7) {
				cards[i]=new SutdaCard(i+1,true);
			} else if(i>=10){
				if(i==CARD_NUM-1){cards[i]=new SutdaCard((i+1)/2,false);}
				else{cards[i]=new SutdaCard((i+1)%10,false);}}
			else {cards[i]=new SutdaCard(i+1,false);}
		}
	}
}
class SutdaCard_1{
	int num;
	final boolean isKwang;
	
	SutdaCard_1(){
		this(1,true);
	}
	
	SutdaCard_1(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	//info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}
public class Exercise7_14 {
	public static void main(String[] args) {
		SutdaCard card=new SutdaCard(1,true);
	}
}