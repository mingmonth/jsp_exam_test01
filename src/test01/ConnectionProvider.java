package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionProvider {
	public static Connection getConnection() throws SQLException {
		//"jdbc:mysql://localhost:3306/test"
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useSSL=false", "root", "test5555");
	}
	
	public static void close(Statement stmt, Connection conn) {
		if(stmt!= null) {
			try {
				stmt.close();
			} catch(SQLException ex) {
				
			}						
		}
		
		if(conn != null) {
			try {
				conn.close();
			} catch(SQLException ex) {
				
			}
		}
	}
	
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		if(rs!= null) {
			try {
				rs.close();
			} catch(SQLException ex) {
				
			}						
		}
		
		if(stmt!= null) {
			try {
				stmt.close();
			} catch(SQLException ex) {
				
			}						
		}
		
		if(conn != null) {
			try {
				conn.close();
			} catch(SQLException ex) {
				
			}
		}
	}
	
	/*
	 * public static void close(Connection conn) { if(conn != null) { try {
	 * conn.close(); } catch(SQLException ex) {
	 * 
	 * } } }
	 */
}
