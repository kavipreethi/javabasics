package com.basic;

public class SavingAccount {
	public static int AnnualintrestRate;
	private double savingbalance;
	public SavingAccount(double balance)
	{
		this.savingbalance = balance;
	} 
	public void CalculateMonthlyIntrest()
	{
		double MonthlyIntrest=(savingbalance*(AnnualintrestRate/100.0))/12;
		savingbalance=MonthlyIntrest + savingbalance;
	}
	public static void modifyIntrestRate(int newvalue)
	{
		AnnualintrestRate= newvalue;
	}
	public void showbalance()
	{
		System.out.println(savingbalance+"balance");
	}
	public static void main(String[]args)
	{
		SavingAccount s1 = new SavingAccount(2000);
		SavingAccount s2 = new SavingAccount(3000);
		SavingAccount.modifyIntrestRate(4);
		s1.showbalance();
		s2.showbalance();
		s1.CalculateMonthlyIntrest();
		s2.CalculateMonthlyIntrest();
		s1.showbalance();
		s2.showbalance();
		SavingAccount.modifyIntrestRate(5);
		s1.showbalance();
		s2.showbalance();
		s1.CalculateMonthlyIntrest();
		s2.CalculateMonthlyIntrest();
		s1.showbalance();
		s2.showbalance();
		
		
	}
			
}
	
