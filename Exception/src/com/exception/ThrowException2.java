package com.exception;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ThrowException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �̸��� �Է��ϼ��� : ");
		String fileName = sc.nextLine();
		
//		File f = createFile(fileName);
		
		try {
			File f = createFile(fileName);
			System.out.println("���ϻ��� �Ϸ�");
		} catch(IOException e) {
			System.out.println(e.getMessage());	
		} catch(Exception e) {
			System.out.println(e.getMessage());	
		}
	}
	public static File createFile(String fileName) throws Exception , IOException{

		if(fileName == null || fileName.equals(" ")) {
	        throw new Exception("������ �̸��� ��ȿ���� �ʽ��ϴ�.");
	     }

		File f = new File(fileName);
	
		f.createNewFile(); //throws IOException
		return f;	
//		try {
//			if(fileName == null || fileName.equals(" ")) {
//		     throw new Exception("������ �̸��� ��ȿ���� �ʽ��ϴ�.");
//		     }
//		} catch(Exception e) {
//			fileName = "�������.txt";
//		} finally {
//			File f = new File(fileName);
//			try {
//				f.createNewFile(); //throws IOException
//			} catch(IOException e) {
//				System.out.println("���� ������ ������ �߻��߽��ϴ�.");
//			}
//			create(f);
//			return f;
//		}
	}
//	static void create(File f) {
//		try {
//			f.createNewFile(); //throws IOException
//		} catch(IOException e) {
//			System.out.println("���� ������ ������ �߻��߽��ϴ�.");
//		}
//	}
}
