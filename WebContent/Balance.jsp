<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import ="com.user.Balance" %>    
<%Balance balance=(Balance)session.getAttribute("balance"); %>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Balance</title>
<script type ="text/javascript">
	function depositsubmit(){
		alert('deposit submitted');
	}
	function withdrawsubmit(){
		alert('withdrawal submitted');
	}
	function transfersubmit(){
		alert('Transfer Submitted');
	}
</script>
</head>
<body>
<h1>Checking Account Balance</h1>
<p><% out.print(balance.getBalanceChecking()); %>
<h1>Savings Account Balance</h1>
<p><% out.print(balance.getBalanceSavings()); %>

<br>
<br>

<form class="form-inline" action ="BalanceServlet" method ="get">
<button type="submit" value="ViewStatement" name="viewStatement"></button>
</form>

<br>
<br>
<b></b>
<h2>Make a deposit into Checking Account!</h2>
<form class="form-inline" action ="BalanceServlet" method ="get">
 <input type="button" value="Statements" name="statements"/>
  <div class="form-group">
    <label for="exampleInputName2">Deposit Amount</label>
    <input type="text" name="depositChecking" class="form-control" id="deposit" value="${balance.depositChecking}">
  </div>
   <button type="submit" class="btn btn-default" placeholder="0.00" onclick="depositsubmit()">Confirm Deposit</button>
		
	
</form>
<h2>Make a deposit into Savings Account</h2>
<form class="form-inline" action ="BalanceServlet" method ="get">
  <div class="form-group">
    <label for="exampleInputName2">Deposit Amount</label>
    <input type="text" name="depositSavings" class="form-control" id="deposit" value="${balance.depositSavings}">
  </div>
   <button type="submit" class="btn btn-default" placeholder="0.00" onclick="depositsubmit()">Confirm Deposit</button>
		<%session.setAttribute("balance", balance); %>
	
</form>
<h2>Withdraw from Savings Account</h2>
<form class="form-inline" action ="BalanceServlet" method ="get">
  <div class="form-group">
    <label for="exampleInputName2">Deposit Amount</label>
    <input type="text" name="withdrawSavings" class="form-control" id="deposit" value="${balance.withdrawSavings}">
  </div>
   <button type="submit" class="btn btn-default" placeholder="0.00" onclick="depositsubmit()">Confirm Deposit</button>
	<%session.setAttribute("balance", balance); %>
</form>
<h2>Withdraw from Checking Account</h2>
<form class="form-inline" action ="BalanceServlet" method ="get">
  <div class="form-group">
    <label for="exampleInputName2">Deposit Amount</label>
    <input type="text" name="withdrawChecking" class="form-control" id="deposit" value="${balance.withdrawChecking}">
  </div>
   <button type="submit" class="btn btn-default" placeholder="0.00" onclick="depositsubmit()">Confirm Deposit</button>
	<%session.setAttribute("balance", balance); %>
</form>
<h1>Transfer from Checking Account into Savings Account</h1>
<form class="form-line" action="BalanceServlet" method="get">
<div class="form-group">
<label for ="transfer">Transfer Amount</label>
<input type ="text" name="transferSavings" class="form-control" id="withdraw" value="${balance.withdrawChecking}">
</div>
<button type="submit" class="btn btn-default" placeholder="0.00" onclick="transfersubmit()">Confirm Transfer</button>
<%session.setAttribute("balance", balance); %>
</form>
<h1>Transfer from Savings into Checking Account</h1>
<form class="form-line" action="BalanceServlet" method="get">
<div class="form-group">
<label for= "transfer">Transfer Amount</label>
<input type="text" name="transferChecking" class="form-control" id="withdraw" value="${balance.withdrawSavings}">
</div>
<button type="submit" class="btn btn-default" placeholder="0.00" onlick="transfersubmit()">Confirm Transfer</button>
</div>
<%session.setAttribute("balance", balance); %>
</form>

</body>
</html>