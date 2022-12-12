package com.lec.ex04_while;
import javax.swing.JOptionPane;

public class RemoconMain {
	public static void main(String[] args) {
		// JOptionpane을 이용한 리모콘제어프로그램 작성하기
		int menu=0;
		int volume=0;
		String data;
		
		do {
			data=JOptionPane.showInputDialog("번호입력\n\n"+"1. 볼륨업\n2. 볼륨다운\n3. 종료\n\n"+"1~3번까지 입력하시오.");
		/*	
			if(menu==null) {data="0"; if(data.equals("")) {menu=0;}else {menu=Integer.parseInt(data);}
			if(menu==1) {volume++;}else if(menu==2) {volume--;}else volume=0;}
		}while(menu!=3);
		*/
			
			if(data==null) data = "0";
			
			if(data.equals("")) {
				menu = 0;
			} else {
				menu = Integer.parseInt(data);
				
				if(menu==1) {
					volume++;
				} else if(menu==2) {
					volume--;
				} else {
					volume = 0;
				}
				System.out.println("현재 volumn = " + volume);
			}
			
		} while(menu!=3);	
		System.out.println("현 볼륨 : "+volume);
	}
}
