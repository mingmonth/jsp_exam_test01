package test01;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectOne")
public class SelectOne extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		
		GoodsDao dao = GoodsDao.getInstance();
		
		
		try {
			GoodsVo vo = dao.SelectOne(no);
			
			if(vo != null) {
				request.setAttribute("vo", vo);				
			} else {
				System.out.println("vo is null");
			}
						
			RequestDispatcher dis = request.getRequestDispatcher("View.jsp");
			dis.forward(request, response);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
