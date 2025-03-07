package basic.reqNresp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RequestTest02
 */
@WebServlet("/requestTest02.do")
public class RequestTest02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int input1 = Integer.parseInt(request.getParameter("input1"));
		int input2 = Integer.parseInt(request.getParameter("input2"));
		String op = request.getParameter("op");
		double result = 0;
		switch(op) {
			case "+": result = (double)(input1 + input2); break;
			case "-": result = (double)(input1 - input2); break;
			case "*": result = (double)(input1 * input2); break;
			case "/": result = (double)(input1 / input2); break;
		}
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><meta charset='utf-8'>");
		out.println("<title>Request객체 연습 2</title>");
		out.println("<body>");
		
		out.println("<h1>계산 결과</h1>");
		out.println("<br><hr><br>");
		
		out.printf("<p>%d %s %d = %.1f<p><br>",input1, op, input2, result);
		
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
