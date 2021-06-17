package com.exception;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ThrowException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 파일 이름을 입력하세요 : ");
		String fileName = sc.nextLine();
		
//		File f = createFile(fileName);
		
		try {
			File f = createFile(fileName);
			System.out.println("파일생성 완료");
		} catch(IOException e) {
			System.out.println(e.getMessage());	
		} catch(Exception e) {
			System.out.println(e.getMessage());	
		}
	}
	public static File createFile(String fileName) throws Exception , IOException{

		if(fileName == null || fileName.equals(" ")) {
	        throw new Exception("파일의 이름이 유효하지 않습니다.");
	     }

		File f = new File(fileName);
	
		f.createNewFile(); //throws IOException
		return f;	
//		try {
//			if(fileName == null || fileName.equals(" ")) {
//		     throw new Exception("파일의 이름이 유효하지 않습니다.");
//		     }
//		} catch(Exception e) {
//			fileName = "제목없음.txt";
//		} finally {
//			File f = new File(fileName);
//			try {
//				f.createNewFile(); //throws IOException
//			} catch(IOException e) {
//				System.out.println("파일 생성에 문제가 발생했습니다.");
//			}
//			create(f);
//			return f;
//		}
	}
//	static void create(File f) {
//		try {
//			f.createNewFile(); //throws IOException
//		} catch(IOException e) {
//			System.out.println("파일 생성에 문제가 발생했습니다.");
//		}
//	}
}
