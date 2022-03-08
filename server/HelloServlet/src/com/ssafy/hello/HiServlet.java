package com.ssafy.hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiServlet
 */
@WebServlet("/Hi")
public class HiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; // 컴퓨터마다 설정이 다를 수 있어서 통일

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hi");
	} // 6:15부터
		// http://localhost:8080/HelloServlet/HiServlet

}
