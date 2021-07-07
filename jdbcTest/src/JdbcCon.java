import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement psmt = null; //자바에서 커리문을 작성하고 오라클로 보내서 실행할 수 있게 해줌
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "TIGER";
			
			con = DriverManager.getConnection(url, id, pw);
			
			
//			String sql = "insert into emp01 values (?,?,?,?,?,?,?,?)"; 추가
//			
//			psmt = con.prepareStatement(sql);
//			
//			psmt.setInt(1, 1111);
//			psmt.setString(2, "홍길동");
//			psmt.setString(3, "MANAGER");
//			psmt.setInt(4, 7788);
//			psmt.setString(5, "21/07/07");
//			psmt.setInt(6, 2000);
//			psmt.setInt(7, 0);
//			psmt.setInt(8, 10);		
				
//			String sql = "update emp01 set ename = '이순신' where empno = ?";	
//			psmt = con.prepareStatement(sql);
//			psmt.setInt(1, 1111);
			
//			String sql = "delete from emp01 where empno = ?"; 삭제
//			psmt = con.prepareStatement(sql);
//			psmt.setInt(1, 1111);
			
			String sql2 = "select empno,ename,sal,dname,grade\r\n"
		               + "from emp e,dept d,salgrade s\r\n"
		               + "where e.deptno = d.deptno\r\n"
		               + "and e.sal BETWEEN s.losal and s.hisal";

			psmt = con.prepareStatement(sql2);
			
//			int result = psmt.executeUpdate(); //insert, update, delete
//			
//			if(result > 0) {
//				System.out.println("데이터 처리 성공");
//				con.commit();
//			} else {
//				System.out.println("데이터 처리 실패");
//				con.rollback();
//			}
			
//			String sql2 = "select * from emp";
//			psmt = con.prepareStatement(sql2);
//			String sql = "select * from emp01 where deptno = ?";	
//			psmt = con.prepareStatement(sql);
//			psmt.setInt(1, 30);
			 
//			String sql = "select * from dept where loc = ?";
//			 psmt = con.prepareStatement(sql);
			 //psmt.setInt(1, 20);
//			 psmt.setString(1, "DALLAS");

			rs = psmt.executeQuery(); //데이터베이스에 쿼리문전달
			System.out.println("사원번호 사원명 급여 부서명 급여등급");			
			while(rs.next()) {
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				
//				int empno = rs.getInt(1);
//				String ename = rs.getString(2);
//				String job = rs.getString(3);
//				String mgr = rs.getString(4);
//				String hiredate = rs.getString(5);
//				String sal = rs.getString(6);
//				String comm = rs.getString(7);
//				String deptno = rs.getString(8);
				
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				int sal = rs.getInt(3);
				String dname = rs.getString(4);
				int grade = rs.getInt(5);
				
				System.out.println(empno + "  " + ename + "  " + sal + "  " + dname + "  " + grade);
	         }

		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결 실패");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("DB 사용 불가");
		}
	}
}
