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
		System.out.println("      SMHRD학생관리 프로그램      ");
		System.out.println("============================");
		
		while(true) {
			System.out.println("1.학생추가 2.전체학생조회 3.특정학생조회 4.학생정보수정 5.학생삭제 6.프로그램종료");
			System.out.println("메뉴 선택 >> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println("등록할 학생의 정보를 입력하시오.");
				System.out.println("이름 : ");
				name = sc.next();
				System.out.println("나이 : ");
				age = sc.nextInt();
				System.out.println("전화번호 : ");
				phone = sc.next();
				System.out.println("이메일 : ");
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
						System.out.println("학생추가 성공");
					} else {
						System.out.println("학생추가 실패");
					}
				} catch(SQLException e) {
					e.printStackTrace();
					System.out.println("DB연결 실패");
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("DB 사용 불가");
				} finally {
					try {
						pst.close(); //디비에 계속 남아있는 정보를 지워준다
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				break;
			case 2:
				System.out.println("=====SMHRD학생 목록=====");
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
						System.out.print("학생번호 : " + no + "\t");
						System.out.print("학생이름 : " + name + "\t");
						System.out.print("학생나이: " + age + "\t");
						System.out.print("학생전화번호 : " + phone + "\t");
						System.out.print("학생이메일 : " + email + "\t");
						System.out.println();
					}
				} catch(SQLException e) {
					e.printStackTrace();
					System.out.println("DB연결 실패");
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("DB 사용 불가");
				} finally {
					try {
						rs.close(); //디비에 계속 남아있는 정보를 지워준다
						pst.close();
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				break;
			case 3:
				System.out.println("학생이름을 입력하세요.");
				search = sc.next();
				System.out.println("=====" + search + " 정보조회=====");
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
						System.out.print("학생번호 : " + no + "\t");
						System.out.print("학생이름 : " + name + "\t");
						System.out.print("학생나이: " + age + "\t");
						System.out.print("학생전화번호 : " + phone + "\t");
						System.out.print("학생이메일 : " + email + "\t");
						System.out.println();
						
						isList = true;
					}
					
					if(isList == false) {
						System.out.println("검색된 학생이 없습니다.");
					}
				} catch(SQLException e) {
					e.printStackTrace();
					System.out.println("DB연결 실패");
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("DB 사용 불가");
				} finally {
					try {
						rs.close(); //디비에 계속 남아있는 정보를 지워준다
						pst.close();
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				break;
			case 4:
				System.out.println("학생이름을 입력하세요.");
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
						
						System.out.println("======" + search + " 정보조회=====");
						System.out.print("학생번호 : " + no + "\t");
						System.out.print("학생이름 : " + name + "\t");
						System.out.print("학생나이: " + age + "\t");
						System.out.print("학생전화번호 : " + phone + "\t");
						System.out.print("학생이메일 : " + email + "\t");
						System.out.println("===============================");
						System.out.println();
						
						isList = true;
					}
					
					if(isList == false) {
						System.out.println("검색된 학생이 없습니다.");
					}
					
					System.out.println("변경하실 정보: 선택 1.이름 2.나이 3.연락처 4.이메일 5.전체변경");
					int select = sc.nextInt();
					
					if(select == 1) {
						System.out.println("변경할 이름 : ");
						name = sc.next();
					} else if(select == 2) {
						System.out.println("변경할 나이 : ");
						age = sc.nextInt();
					} else if(select == 3) {
						System.out.println("변경할 연락처 : ");
						phone = sc.next();
					} else if(select == 4) {
						System.out.println("변경할 이메일 : ");
						email = sc.next();
					} else if(select == 5) {
						System.out.println("변경할 이름 : ");
						name = sc.next();
						System.out.println("변경할 나이 : ");
						age = sc.nextInt();
						System.out.println("변경할 연락처 : ");
						phone = sc.next();
						System.out.println("변경할 이메일 : ");
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
						System.out.println("학생수정 성공");
					} else {
						System.out.println("학생수정 실패");
					}
					
					
				} catch(SQLException e) {
					e.printStackTrace();
					System.out.println("DB연결 실패");
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("DB 사용 불가");
				} finally {
					try {
						rs.close(); //디비에 계속 남아있는 정보를 지워준다
						pst.close();
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				break;
			case 5:
				System.out.println("학생이름을 입력하세요.");
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
						System.out.println("학생삭제 성공");
					} else {
						System.out.println("학생삭제 실패");
					}
				} catch(SQLException e) {
					e.printStackTrace();
					System.out.println("DB연결 실패");
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("DB 사용 불가");
				} finally {
					try {
						rs.close(); //디비에 계속 남아있는 정보를 지워준다
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
