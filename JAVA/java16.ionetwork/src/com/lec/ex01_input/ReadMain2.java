package com.lec.ex01_input;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadMain2 {
	public static void main(String[] args) throws Exception {
		// 2. read(byte[] b)
		InputStream is=new FileInputStream("src/com/lec/ex01_input/news.txt");
		
		byte[] read_bytes=new byte[100];
		int readByteNo;
		//readByteNo=is.read(read_bytes);
		readByteNo = is.read(read_bytes, 2, 3);
		/*      
		int readByteNo; 이렇게 변수선언하고 
		readByteNo = is.read(read_bytes, 2, 3); 요렇게 해줘서 is를 read했는데 굳이 이렇게 안하고 걍
		is.read(read_bytes, 2, 3); 해도 같은 결과가 나오긴한다...
		 */
		
		for(int i=0; i<read_bytes.length;i++) {
			//System.out.print(read_bytes[i]);
			System.out.println((char)read_bytes[i] +" : "+ read_bytes[i]);
		}
		is.close();
	}
}