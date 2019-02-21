package test01;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/goodsList")
public class goodsList extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GoodsDao dao = new GoodsDao();
		
		try {
			ArrayList<GoodsVo> list = dao.selectAll();
			if(list != null) {
				request.setAttribute("list", list);
			} else {
				System.out.println("list is empty.");
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("Board.jsp");
			dis.forward(request,  response);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
