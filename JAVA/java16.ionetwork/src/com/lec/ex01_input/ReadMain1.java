package com.lec.ex01_input;
import java.io.FileInputStream;
import java.io.InputStream;

/*
	InputStream
	
	InputStream은 바이트기반 입력스트림의 최상위 추상클래스이다.
	FileInputStream, BufferedInputStream, DataInputStream은 모두
	InputStream을 상속하고 있다.
	
	InputStream의 주소 메서드
		1. read()
		2. read(byte[] b)
		3. read(byte[]b, int off, int len)
		4. close()

	참고 : 입력 스트림으로부터 더 이상 바이트를 읽을 수 없으면 read()는 -1 리턴 
*/
public class ReadMain1 {
	public static void main(String[] args) throws Exception {

		// 1. read()
		InputStream is=new FileInputStream("src/com/lec/ex01_input/news.txt");
		System.out.println(is); // java.io.FileInputStream@626b2d4a
		System.out.println("----------------------");
		
		int read_bytes;

		while(true) {
			read_bytes=is.read(); // 1byte를 읽어서 4바이트크기인 read_bytes로 리턴
			if(read_bytes==-1) break;
			System.out.println(read_bytes+"="+(char)read_bytes);
		}
	}
}