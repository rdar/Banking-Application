package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Balance;

/**
 * Servlet implementation class BalanceServlet
 */
@WebServlet("/BalanceServlet")
public class BalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
ArrayList<Balance> balances = new ArrayList<Balance>();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BalanceServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		

		if (request.getParameter("viewStatement") != null) {
			System.out.println("Working..!!! ");
			session.setAttribute("balances", balances);
			
			RequestDispatcher rs = request.getRequestDispatcher("Statements.jsp");
			rs.forward(request, response);
			//view(balances, response, request);
		}
		
		
		Balance balance = (Balance) session.getAttribute("balance");

		System.out.println("here!!!" + balance.getBalanceChecking() + "Deposit: " + balance.getDepositChecking());

		// Balance balance = new Balance();

		double amount = Double.parseDouble(
				request.getParameter("depositChecking") == null || request.getParameter("depositChecking").isEmpty()
						? "0" : request.getParameter("depositChecking"));
		balance.depositintoChecking(amount);

		double amount2 = Double.parseDouble(
				request.getParameter("depositSavings") == null || request.getParameter("depositSavings").isEmpty() ? "0"
						: request.getParameter("depositSavings"));
		balance.depositintoSavings(amount2);

		double amount3 = Double.parseDouble(
				request.getParameter("withdrawSavings") == null || request.getParameter("withdrawSavings").isEmpty()
						? "0" : request.getParameter("withdrawSavings"));
		balance.withdrawformSavings(amount3);

		double amount4 = Double.parseDouble(
				request.getParameter("withdrawChecking") == null || request.getParameter("withdrawChecking").isEmpty()
						? "0" : request.getParameter("withdrawChecking"));
		balance.withdrawformSavings(amount4);

		double amount5 = Double.parseDouble(
				request.getParameter("transferSavings") == null || request.getParameter("transferSavings").isEmpty()
						? "0" : request.getParameter("transferSavings"));
		balance.transfertoSavings(amount5);

		double amount6 = Double.parseDouble(
				request.getParameter("transferChecking") == null || request.getParameter("transferChecking").isEmpty()
						? "0" : request.getParameter("transferChecking"));
		balance.transfertoCheckings(amount6);
		session.setAttribute("balance", balance);
		

		balance.getBalanceChecking();
		balance.getBalanceSavings();

		

		balances.add(balance);
		
		session.setAttribute("balance", balance);
		response.sendRedirect("Balance.jsp");

	}

	public static void view(List<Balance> balances, HttpServletResponse response,HttpServletRequest request) throws IOException {
		
		System.out.println("Deposit Checking!!!");
		for(int i =0; i<balances.size(); i++){
			System.out.println(balances.get(i).getDepositChecking());
		}
		
		HttpSession session = request.getSession(true);
		session.setAttribute("balances", balances);
		
		response.sendRedirect("Statements.jsp");
		
		
		
		//session.setAttribute("balances", balances);
	}
	
}
