package test01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

@WebServlet("/InsertGoods")
public class InsertGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public InsertGoods() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getRealPath("/upload");
		System.out.println("path:" + path);		
		response.setContentType("text/html); charset=UTF-8");
		//PrintWriter out = response.getWriter();
		
		MultipartRequest multi = new MultipartRequest(request, path);
		GoodsVo g = new GoodsVo();
		g.setItem(multi.getParameter("item"));
		g.setPrice(Integer.parseInt(multi.getParameter("price")));
		g.setDetail(multi.getParameter("detail"));
		g.setImg(multi.getFilesystemName("img"));
		
		//GoodsDao dao = new GoodsDao();
		GoodsDao dao = GoodsDao.getInstance();
		int re = dao.insertGoods(g);
		
		System.out.println("re:" + re);
		
		String moveUrl = "";
		if(re == 1) { 
			System.out.println("성공");
			moveUrl = "goodsList";
		} else { 
			System.out.println("실패");
			moveUrl = "index.jsp";
		}
		response.sendRedirect(moveUrl);
	}
}
