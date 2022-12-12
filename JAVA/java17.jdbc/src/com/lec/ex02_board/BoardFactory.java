package com.lec.ex02_board;

public class BoardFactory {
// 실습. BoardDAOImpl을 싱글톤으로 작성
// 1. BoardFactory 생성자를 외부에서 생성못하도록 
// 2. BoardImpl을 싱글돈으로 작성
	//1) BoardDAOImpl을 private, static으로 선언
	//2) BoardDAOImpl을 리턴할 getter메서드, getInstance()작성
	private BoardFactory() {}
	private static BoardDAOImpl bddao=null;
	public static BoardDAOImpl getInstance() {
		if(bddao==null) bddao=new BoardDAOImpl();
		return bddao;
	}

}