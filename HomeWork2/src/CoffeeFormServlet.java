
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterFormServlet
 */
@WebServlet("/CoffeeFormServlet")
public class CoffeeFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String title = "填寫完畢~感謝您的光顧";
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " 
					+ "Transitional//EN\n" 
					+ "<HTML>\n"
					+ "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" 
					+ "<BODY BGCOLOR=\"#ECFFFF\">\n" 
					+ "<H1 ALIGN=CENTER>"
					+ title + "</H1>\n");
		out.println("貴賓暱稱：<br>");
		out.println(request.getParameter("name") + "<br>");
		out.println("<br><br>消費日期：<br>");
		out.println(request.getParameter("date") + "<br>");
		out.println("<br><br>消費時間：<br>");
		out.println(request.getParameter("time") + "<br>");
		out.println("<br><br>性別：<br>");
		out.println(request.getParameter("gender") + "<br>");
		out.println("<br><br>如何得知本店：<br>");

		String[] how = request.getParameterValues("how");
		for (int i = 0; i < how.length; i++)
			out.println(how[i] + "<br>");
		
		out.println("<br><br>今日消費品項：<br>");

		String[] consume = request.getParameterValues("consume");
		for (int i = 0; i < consume.length; i++)
			out.println(consume[i] + "<br>");

		out.println("<br><br>口味滿意度：<br>");
		out.println(request.getParameter("taste") + "<br>");

		out.println("<br><br>環境滿意度：<br>");
		out.println(request.getParameter("place") + "<br>");

		out.println("<br><br>服務滿意度：<br>");
		out.println(request.getParameter("survice") + "<br>");

		out.println("<br><br>寶貴意見:<br>");
		out.println(request.getParameter("comment") + "<br>");

		out.println("</BODY></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
