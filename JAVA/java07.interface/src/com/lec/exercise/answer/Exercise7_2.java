package com.lec.exercise.answer;


class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard[] cards=new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<CARD_NUM; i++) {
			if(i==0 || i==2 || i==7) {
				cards[i]=new SutdaCard(i+1,true);
			} else if(i>=10){
				if(i==CARD_NUM-1){cards[i]=new SutdaCard(10,false);}
				else{cards[i]=new SutdaCard((i+1)%10,false);}}
			else {cards[i]=new SutdaCard(i+1,false);}
		}
	}

	void shuffle() {
		int a=(int)(Math.random()*20);
		int b=(int)(Math.random()*20);
		SutdaCard temp=cards[a];
		cards[a]=cards[b];
		cards[b]=temp;
	}
	SutdaCard pick(int index) {
		return cards[index];
	}
	SutdaCard pick() {
		int a=(int)(Math.random()*20);
		
		return cards[a];
	}

} // SutdaDeck

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
	
	public String toString() {
		return num+(isKwang?"K":"");
	}
}

public class Exercise7_2 {
	public static void main(String[] args) {
		SutdaDeck deck= new SutdaDeck();
		
		System.out.println(deck.pick(10));
		System.out.println(deck.pick());
		deck.shuffle();
		System.out.println();
		
		for(int i=0; i<deck.cards.length;i++)
			{System.out.print(deck.cards[i]+",");}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
