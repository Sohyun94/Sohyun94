package com.ssafy.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; //컴퓨터마다 설정이 다를 수 있어서 통일

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("GET 요청");
		// System.out.println("ㅎㅇㅎㅇ");
		// http://localhost:8080/HelloServlet/HelloServlet
		// 약속 내 주소, 포트 번호 context 루트 "/HelloServlet" 얘임
//		response.setContentType("text/html");
//		response.setCharacterEncoding("UTF-8"); // 한글 인식할 수 있게
		response.setContentType("text/html; charset=UTF-8"); // 한 번에 쓰기
		PrintWriter writer = response.getWriter();
		writer.write("<html>");
		writer.write("<head>");
		writer.write("</head>");
		writer.write("<body>");
		writer.write("Hello SSAFY<br>");
		writer.write("하이루.");
		writer.write("</body>");
		writer.write("</html>");
	}
}