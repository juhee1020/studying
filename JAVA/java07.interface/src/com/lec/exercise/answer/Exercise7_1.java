package com.lec.exercise.answer;

class SutdaDeck_{
	final int CARD_NUM=20;
	SutdaCard[] cards=new SutdaCard[CARD_NUM];
	
	SutdaDeck_() {
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
class SutdaCard_{
	int num;
	boolean isKwang;
	
	SutdaCard_(){
		this(1,true);
	}
	
	SutdaCard_(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	//info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}

public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck_ deck=new SutdaDeck_();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}
	}
}