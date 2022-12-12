package com.lec.ex04_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterMain {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("src/com/lec/ex04_writer/output1.txt");
		
		char[] data = "BlackpinkInYourArea".toCharArray();
		for(int i=0;i<data.length;i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
		
		writer=new FileWriter("src/com/lec/ex04_writer/output2.txt");
		data="BlackpinkInYourArea".toCharArray();
		writer.write(data,1,2);
		writer.flush();
		writer.close();
	}
}