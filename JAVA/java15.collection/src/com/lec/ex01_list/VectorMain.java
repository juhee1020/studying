package com.lec.ex01_list;
import java.util.*;

public class VectorMain {
	public static void main(String[] args) {
	// 1. ArrayList - Member
		List<Member> members=new ArrayList<>();
		// insert into member values();
		members.add(new Member(101, "maplestory","메이플스토리","maple@nexon.com"));
		members.add(new Member(102, "Brazil","브라질","brazil@nexon.com"));
		members.add(new Member(103, "Korea","한국","korea@nexon.com"));
		members.add(new Member(104, "Argentina","아르헨티나","argentina@nexon.com"));
		members.add(new Member(105, "Spain","스페인","spain@nexon.com"));
		//for(int i=0; i<members.size(); i++) {
		for(Member member:members) {
			/*if(i!=members.size()-1) {
			System.out.println(members.get(i));
			} else {System.out.println(members.get(i)+"\n");}*/
			System.out.println(member.name); // .toString()은 길어서 .name했다.
		}
		System.out.println("\n");



	// 2. Vector - Board
		// - 스레드에 안전한지 아닌지의 차이 (외엔 차이가 없다?)
		List<Board> boards=new Vector<>();

		// 실습. board를 5건 추가, 2번째 삭제, 출력
		boards.add(new Board(101, "title1","작성자1","===내용1==="));
		boards.add(new Board(102, "title2","작성자2","===내용2==="));
		boards.add(new Board(103, "title3","작성자3","===내용3==="));
		boards.add(new Board(104, "title4","작성자4","===내용4==="));
		boards.add(new Board(105, "title5","작성자5","===내용5==="));

		for(int i=0; i<boards.size(); i++) {
			if(i!=boards.size()-1) {
			System.out.print(boards.get(i).writer+"\t");
			} else {System.out.println(boards.get(i).writer+"\n");}
		}
		boards.remove(1); // 102, title2, 작성자2, 내용2 << 얘를 삭제
		for(int i=0; i<boards.size(); i++) {
			Board board=boards.get(i);
			System.out.print(board.writer+"\t"); // 작성자2가 사라진 모습.
		}
	}
}



class Member{
	int id; String pw, name, email;

	public Member(int id, String pw, String name, String email) { // 생성자
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + 
				", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}



class Board{
	int bno; String title, writer, content;

	public Board(int bno, String title, String writer, String content) {
		super();
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content + "]";
	}
}