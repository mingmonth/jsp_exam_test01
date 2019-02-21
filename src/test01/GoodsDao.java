package test01;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GoodsDao {
	
	private static GoodsDao instance = new GoodsDao();
	
	public static GoodsDao getInstance() {
		return instance;
	}
	
	public int insertGoods(GoodsVo g) {

		int re = -1;

		String sql = "insert into goods(item, price, detail, img) values(?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = ConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, g.getItem());
			pstmt.setInt(2, g.getPrice());
			pstmt.setString(3, g.getDetail());
			pstmt.setString(4, g.getImg());
			re = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ConnectionProvider.close(pstmt, conn);
		}
		return re;
	}

	public ArrayList<GoodsVo> selectAll() throws ClassNotFoundException, IOException, SQLException {

		ArrayList<GoodsVo> tempList = new ArrayList<>();
		String sql = "select * from goods order by no asc";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = ConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				tempList.add(
						new GoodsVo(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ConnectionProvider.close(rs, pstmt, conn);
		}

		return tempList;
	}

	public GoodsVo SelectOne(int no) throws ClassNotFoundException, IOException, SQLException {
		GoodsVo vo = null;
		String sql = "select * from goods where no=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = ConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo = new GoodsVo(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ConnectionProvider.close(rs, pstmt, conn);
		}

		return vo;
	}
}
