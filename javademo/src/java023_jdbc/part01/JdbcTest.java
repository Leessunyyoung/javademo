package java023_jdbc.part01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public JdbcTest() {
		// TODO Auto-generated constructor stub
	}
	public void process() {
			try {
				//1. 드라이버 로딩
				Class.forName("oracle.jdbc.OracleDriver");
				//2. DB 서버 연결
				String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
				String username = "hr";
				String password = "a1234";
				conn = DriverManager.getConnection(url,username,password);
				
//				System.out.println(conn);
				conn.setAutoCommit(false);//자동 auto commit TURE로하면 하나하나 COMMIT이된다 FALSE로 되어있는지 확인!
				
				//3. 쿼리문을 실행하기 위한 Statement타입의 객체를 가져옴
				stmt = conn.createStatement();
				
				//4. 쿼리문을 실행 : SELECT-executeQuery(), INSERT,UPDATE,DELETE -executeUpdate()
				String sql = "SELECT * FROM departments ORDER BY department_id";
				rs = stmt.executeQuery(sql);//결과값을resultset(rs)가 받는다
//				System.out.println(rs);
				
				//5. 쿼리문의 결과 출력
				while(rs.next()) {
					//인덱스로 가져오기x 가독성 떨어짐
					int departmentId = rs.getInt("department_id");
					String departName = rs.getString("department_name");
					int managerId = rs.getInt("manager_id");
					int locationId = rs.getInt("location_id");
					System.out.printf("%d %s %d %d\n",departmentId,departName,managerId,locationId);
				}
				
				conn.commit();//auto commit
			} catch (ClassNotFoundException e) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				
				try {
					conn.setAutoCommit(true);//안정적으로 하기위해 auto commit을 켜놨다.
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//6. JDBC 연결 종료
				if(rs!=null)
					try {
						rs.close();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
				if(stmt!=null)
					try {
						stmt.close();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
				if(conn !=null)
					try {
						conn.close();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
			}
	}
	
}//end class
