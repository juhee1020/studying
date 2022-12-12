package com.lec.ex04_while;

import javax.swing.JOptionPane;

public class SwingMain {
	public static void main(String[] args) {
		// 숫자 맞추기 게임 만들어보자.
		// Java에서 swing은 GUI환경으로 인터페이스를 만들어준다.
		String data = JOptionPane.showInputDialog("정답을 입력하시오.");
		System.out.println("입력된 값 : "+data);
		// JOptionPane.showConfirmDialog(null, data); // 예 누르면 true, 아니오 false 리턴?
		
		int target=77;
		int inputData=0;
		
		inputData=Integer.parseInt(data);
		if(inputData==target) {System.out.println("정답");}
		else if(inputData>target) {System.out.println("답보다 크다. 다음 기회에");}
		else {System.out.println("답보다 작다. 다음 기회에");}
	}
}