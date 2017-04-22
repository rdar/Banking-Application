package com.user;

import java.util.ArrayList;
import java.util.Date;

public class Balance {
	
	private double balanceChecking;
	private double balanceSavings; //balance of regular-checkingsaccount
	private double depositSavings;
	private double withdrawSavings;
	private double depositChecking;
	private double withdrawChecking;
	private double transferSavings;
	private double transferChecking;
	Date date = new Date();
	
	
	
	public double getBalanceChecking() {
		return balanceChecking;
	}

	public void setBalanceChecking(double balanceChecking) {
		this.balanceChecking = balanceChecking;
	}

	public double getBalanceSavings() {
		return balanceSavings;
	}

	public void setBalanceSavings(double balanceSavings) {
		this.balanceSavings = balanceSavings;
	}

	public double getDepositSavings() {
		return depositSavings;
	}

	public void setDepositSavings(double depositSavings) {
	this.depositSavings = depositSavings;
	}

	public double getWithdrawSavings() {
		return withdrawSavings;
	}

	public void setWithdrawSavings(double withdrawSavings) {
		this.withdrawSavings = withdrawSavings;
	}

	public double getDepositChecking() {
		return depositChecking;
	}

	public void setDepositChecking(double depositChecking) {
		this.depositChecking = depositChecking;
	}

	public double getWithdrawChecking() {
		return withdrawChecking;
	}

	public void setWithdrawChecking(double withdrawChecking) {
		this.withdrawChecking = withdrawChecking;
	}

	
public double getTransferSavings() {
		return transferSavings;
	}

	public void setTransferSavings(double transferSavings) {
		this.transferSavings = transferSavings;
	}

	public double getTransferChecking() {
		return transferChecking;
	}

	public void setTransferChecking(double transferChecking) {
		this.transferChecking = transferChecking;
	}

	
	
public void depositintoSavings(double amount){
		if(amount!=0)
		{
			this.balanceSavings += Math.abs(amount);
		depositSavings = amount;
		
	}
	}
		
	public void withdrawformSavings(double amount){
		if(amount!=0){
			balanceSavings = Math.abs(balanceSavings - amount);
			withdrawSavings = amount;
		}
	}
	

	public void depositintoChecking(double amount){
		if(amount!=0)
		{
			this.balanceChecking += Math.abs(amount);
			depositChecking = amount;
		}
	}

	public void setBalanceSavings(double amount2, double amount3) {
		// TODO Auto-generated method stub
		
	}
		
	public void withdrawfromChecking(double amount){
		if(amount!=0){
			balanceChecking = Math.abs(balanceChecking - amount);
			withdrawChecking = amount;
	}
}
	
	
	public void transfertoCheckings(double amount){
		if (amount!=0){
			balanceChecking = amount + balanceChecking;
			balanceSavings = Math.abs(balanceSavings - amount);
			transferChecking = amount;
		}
	}
	
	public void transfertoSavings(double amount){
		if(amount!=0){
		balanceSavings = amount + balanceSavings;
		balanceChecking = Math.abs(amount - balanceChecking);
		transferSavings = amount;
		}
	}
	 
	
	@SuppressWarnings("deprecation")
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		
		return( this.getDepositChecking() + "/n" + this.getWithdrawChecking() + "/n" + this.getTransferChecking() + "/n" + this.getDepositSavings() + "/n" + this.getWithdrawSavings() + "/n" + this.getTransferSavings());
		}
				
		
	
	}




