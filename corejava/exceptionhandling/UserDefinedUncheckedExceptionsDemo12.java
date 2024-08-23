package com.evergent.corejava.exceptionhandling;
class InvalidScoreException extends RuntimeException
{
	public InvalidScoreException(String message)
	{
		super(message);
	}
}

public class UserDefinedUncheckedExceptionsDemo12 {
	public static void validateScore(int score)
	{
		if(score<0 || score>100)
		{
			throw new InvalidScoreException("Score must be between 0 and 100");
		}
		else
		{
			System.out.println("Score is valid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validateScore(110);
		}
		
		catch(InvalidScoreException e)
		{
			System.out.println("caught the exception:"+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program flow continues");
	}
}
