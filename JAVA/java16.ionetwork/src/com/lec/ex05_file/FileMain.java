package com.lec.ex05_file;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileMain {
	public static void main(String[] args) throws Exception {
		File dir=new File("C:/Users/ezen/Desktop/abcde/dir");
		File file1=new File("C:/Users/ezen/Desktop/abcde/dir/abcde1.txt");
		File file2=new File("C:/Users/ezen/Desktop/abcde/dir/abcde2.txt");
		
		// uri로 생성하는 방법
		File file3=new File(new URI("file:///C:/Users/ezen/Desktop/abcde/dir/abcde3.txt"));
		File file4=new File(new URI("file:///C:/Users/ezen/Desktop/abcde/abcde3.txt"));
		
		if(dir.exists() == false) { dir.mkdirs(); }
		if(!file1.exists()) { file1.createNewFile(); }
		if(!file2.exists()) { file2.createNewFile(); }
		if(!file3.exists()) { file3.createNewFile(); }
		if(!file4.exists()) { file4.createNewFile(); }
		
		File abcde=new File("C:/Users/ezen/Desktop/abcde");
		SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd      a      HH:mm");
		File[] fileList=abcde.listFiles();
		System.out.println("-------------------------------------------------------");
		for(File file:fileList) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.println("\t<DIR>\t" + file.getName());
			} else {
				System.out.println("\t" + file.length() + "\t" + file.getName());
			}
		}
	}
}