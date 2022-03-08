package com.ssafy.ws.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.ws.dto.Movie;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// get방식 요청에 대해 응답하는 메서드
	// front controller pattern을 적용하기 위해 내부적으로 process 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	// post방식 요청에 대해 응답하는 메서드
	// front controller pattern을 적용하기 위해 내부적으로 process 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}

	// request 객체에서 action 파라미터를 추출해 실제 비즈니스 로직 메서드 호출
	private void process(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// doGet와 doPost 통해 들어온 요청에 맞게 기능 수행
		String action = req.getParameter("action");

		switch (action) {
		case "regist":
			doRegist(req, resp);
			break;
		}
	}

	private void doRegist(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String title = req.getParameter("title");
		String director = req.getParameter("director");
		String genre = req.getParameter("genre");
		// 문자열 숫자로 바꾸기
		int runningTime = Integer.parseInt(req.getParameter("runningTime"));
		Movie movie = new Movie(0, title, director, genre, runningTime);

		// 전달받은 파라미터를 request에 담는다
		req.setAttribute("title", title);
		req.setAttribute("director", director);
		req.setAttribute("genre", genre);
		req.setAttribute("runningTime", runningTime);

		// JSP 화면 호출을 위해 RequestDispatcher의 forward 사용
		// '/' context root 의미
		RequestDispatcher disp = req.getRequestDispatcher("/regist_result.jsp");
		disp.forward(req, resp);

	}
}
