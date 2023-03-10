package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hmshopVO.*;

import hmshopDAO.*;

/**
 * Servlet implementation class list_servlet
 */
@WebServlet("/list_servlet")
public class list_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BoardDAO boardDAO = new BoardDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public list_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<BoardVO> list = boardDAO.selectAll();
		System.out.println(list.size());
		request.setAttribute("list", list);
		String url = "bbs/list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
