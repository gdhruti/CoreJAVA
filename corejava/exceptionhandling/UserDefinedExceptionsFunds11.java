package com.evergent.corejava.exceptionhandling;
class InsufficientFundsExceptions extends Exception
{
	public InsufficientFundsExceptions(String message)
	{
		super(message);
	}
}

public class UserDefinedExceptionsFunds11 {
	public static void withdraw(double amount) throws InsufficientFundsExceptions
	{
		double balance= 500.00;
		if(amount> balance)
		{
			throw new InsufficientFundsExceptions("Insufficient funds for withdraw");
		}
		else
		{
			System.out.println("Withdrawl successful");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			withdraw(600.00);
		}
		catch(InsufficientFundsExceptions e)
		{
			System.out.println("caught InsufficientFundsExceptions:"+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after handling the exception");
	}
}
