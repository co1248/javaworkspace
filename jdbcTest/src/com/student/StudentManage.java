package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		int menu = 0;
		int no = 0;
		String name = "";
		int age = 0;
		String phone = "";
		String email = "";
		String search = "";
		String sql = "";
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "TIGER";
		
		System.out.println("============================");
		System.out.println("      SMHRD�л����� ���α׷�      ");
		System.out.println("============================");
		
		while(true) {
			System.out.println("1.�л��߰� 2.��ü�л���ȸ 3.Ư���л���ȸ 4.�л��������� 5.�л����� 6.���α׷�����");
			System.out.println("�޴� ���� >> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println("����� �л��� ������ �Է��Ͻÿ�.");
				System.out.println("�̸� : ");
				name = sc.next();
				System.out.println("���� : ");
				age = sc.nextInt();
				System.out.println("��ȭ��ȣ : ");
				phone = sc.next();
				System.out.println("�̸��� : ");
				email = sc.next();
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, id, pw);
					sql = "insert into student values (studentSeq.nextval,?,?,?,?)";
					pst = conn.prepareStatement(sql);
					pst.setString(1, name);
					pst.setInt(2, age);
					pst.setString(3, phone);
					pst.setString(4, email);
					
					int cnt = pst.executeUpdate();
					if(cnt > 0) {
						System.out.println("�л��߰� ����");
					} else {
						System.out.println("�л��߰� ����");
					}
				} catch(SQLException e) {
					e.printStackTrace();
					System.out.println("DB���� ����");
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("DB ��� �Ұ�");
				} finally {
					try {
						pst.close(); //��� ��� �����ִ� ������ �����ش�
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				break;
			case 2:
				System.out.println("=====SMHRD�л� ���=====");
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, id, pw);
					sql = "select rownum, a.* from student a order by no desc";
					pst = conn.prepareStatement(sql);
					rs = pst.executeQuery();
					
					while(rs.next() ) {
						int row = rs.getRow();
						no = rs.getInt(2);
						name = rs.getString(3);
						age = rs.getInt(4);
						phone = rs.getString(5);
						email = rs.getString(6);
						
						System.out.print("rm : " + row + "\t");
						System.out.print("�л���ȣ : " + no + "\t");
						System.out.print("�л��̸� : " + name + "\t");
						System.out.print("�л�����: " + age + "\t");
						System.out.print("�л���ȭ��ȣ : " + phone + "\t");
						System.out.print("�л��̸��� : " + email + "\t");
						System.out.println();
					}
				} catch(SQLException e) {
					e.printStackTrace();
					System.out.println("DB���� ����");
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("DB ��� �Ұ�");
				} finally {
					try {
						rs.close(); //��� ��� �����ִ� ������ �����ش�
						pst.close();
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				break;
			case 3:
				System.out.println("�л��̸��� �Է��ϼ���.");
				search = sc.next();
				System.out.println("=====" + search + " ������ȸ=====");
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, id, pw);
					sql = "select rownum, a.* from student a where name = ?";
					pst = conn.prepareStatement(sql);
					pst.setString(1, search);
					rs = pst.executeQuery();
					
					boolean isList = false;
					
					while(rs.next() ) {
						int row = rs.getRow();
						no = rs.getInt(2);
						name = rs.getString(3);
						age = rs.getInt(4);
						phone = rs.getString(5);
						email = rs.getString(6);
						
						System.out.print("rm : " + row + "\t");
						System.out.print("�л���ȣ : " + no + "\t");
						System.out.print("�л��̸� : " + name + "\t");
						System.out.print("�л�����: " + age + "\t");
						System.out.print("�л���ȭ��ȣ : " + phone + "\t");
						System.out.print("�л��̸��� : " + email + "\t");
						System.out.println();
						
						isList = true;
					}
					
					if(isList == false) {
						System.out.println("�˻��� �л��� �����ϴ�.");
					}
				} catch(SQLException e) {
					e.printStackTrace();
					System.out.println("DB���� ����");
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("DB ��� �Ұ�");
				} finally {
					try {
						rs.close(); //��� ��� �����ִ� ������ �����ش�
						pst.close();
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				break;
			case 4:
				System.out.println("�л��̸��� �Է��ϼ���.");
				search = sc.next();
				
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, id, pw);
					sql = "select * from student where name = ?";
					pst = conn.prepareStatement(sql);
					pst.setString(1, search);
					rs = pst.executeQuery();
					
					boolean isList = false;
					
					while(rs.next() ) {
						no = rs.getInt(1);
						name = rs.getString(2);
						age = rs.getInt(3);
						phone = rs.getString(4);
						email = rs.getString(5);
						
						System.out.println("======" + search + " ������ȸ=====");
						System.out.print("�л���ȣ : " + no + "\t");
						System.out.print("�л��̸� : " + name + "\t");
						System.out.print("�л�����: " + age + "\t");
						System.out.print("�л���ȭ��ȣ : " + phone + "\t");
						System.out.print("�л��̸��� : " + email + "\t");
						System.out.println("===============================");
						System.out.println();
						
						isList = true;
					}
					
					if(isList == false) {
						System.out.println("�˻��� �л��� �����ϴ�.");
					}
					
					System.out.println("�����Ͻ� ����: ���� 1.�̸� 2.���� 3.����ó 4.�̸��� 5.��ü����");
					int select = sc.nextInt();
					
					if(select == 1) {
						System.out.println("������ �̸� : ");
						name = sc.next();
					} else if(select == 2) {
						System.out.println("������ ���� : ");
						age = sc.nextInt();
					} else if(select == 3) {
						System.out.println("������ ����ó : ");
						phone = sc.next();
					} else if(select == 4) {
						System.out.println("������ �̸��� : ");
						email = sc.next();
					} else if(select == 5) {
						System.out.println("������ �̸� : ");
						name = sc.next();
						System.out.println("������ ���� : ");
						age = sc.nextInt();
						System.out.println("������ ����ó : ");
						phone = sc.next();
						System.out.println("������ �̸��� : ");
						email = sc.next();
					} 
					
					sql = "update student set name = ?, age = ?, phone = ?, email = ? where no = ?";
					pst = conn.prepareStatement(sql);
					pst.setString(1, name);
					pst.setInt(2, age);
					pst.setString(3, phone);
					pst.setString(4, email);
					pst.setInt(5, no);
					
					int cnt = pst.executeUpdate();
					if(cnt > 0) {
						System.out.println("�л����� ����");
					} else {
						System.out.println("�л����� ����");
					}
					
					
				} catch(SQLException e) {
					e.printStackTrace();
					System.out.println("DB���� ����");
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("DB ��� �Ұ�");
				} finally {
					try {
						rs.close(); //��� ��� �����ִ� ������ �����ش�
						pst.close();
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				break;
			case 5:
				System.out.println("�л��̸��� �Է��ϼ���.");
				search = sc.next();
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, id, pw);
					sql = "delete from student where name = ?";
					pst = conn.prepareStatement(sql);
					pst.setString(1, search);
					rs = pst.executeQuery();
					
					int cnt = pst.executeUpdate();
					if(cnt > 0) {
						System.out.println("�л����� ����");
					} else {
						System.out.println("�л����� ����");
					}
				} catch(SQLException e) {
					e.printStackTrace();
					System.out.println("DB���� ����");
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("DB ��� �Ұ�");
				} finally {
					try {
						rs.close(); //��� ��� �����ִ� ������ �����ش�
						pst.close();
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				break;
			case 6: 
				
				break;
			} //swich end
		} //while end
		
	}
}
