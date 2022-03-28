package com.teja;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCreation {
public static void main(String[] args) {
	File file=new File("H:\\Testing\\test1.txt");
	String str="";
	try {
		
		if(!file.exists()) {
		if(file.createNewFile()) {
		 System.out.println("file is created at "+file.getCanonicalPath());	
		 str="Data adding throught java file";
		}else {
			System.out.println("file is not created ");
		}
		}else {
			System.out.println("file is also created ");
		}
		if(file.exists()) {
			FileOutputStream fos=new FileOutputStream(file,true);
			str=str.equals("")?"\nData adding throught java file":str;
			byte[] b=str.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("Data has been added");
		}
		if(file.exists()) {
			FileInputStream fis=new FileInputStream(file);
			int i=0;
			while((i=fis.read())!=-1) {
			System.out.print((char)i);
			}
			fis.close();
		}
	}catch (Exception e) {
     e.printStackTrace();
	}
}
}
