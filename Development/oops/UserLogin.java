package com.evergent.corejava.oops;

public class UserLogin {
	public void loginDetails()
	{
		System.out.println("login details");
	}
	public void loginDetails(String username,String pass)
	{
		System.out.println("Username:"+username);
		System.out.println("password:"+pass);
	}
	public void loginDetails(String uname,String pass,String captcha)
	{
		System.out.println("Username:"+uname);
		System.out.println("password:"+pass);
		System.out.println("Captcha:"+captcha);
	}
	public void loginDetails(int mobile,String pass)
	{
		System.out.println("Mobile:"+mobile);
		System.out.println("password:"+pass);
	}
	public void show()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserLogin ulogin = new UserLogin();
		ulogin.loginDetails();
		ulogin.loginDetails("Dhruti","Dhru123");
		ulogin.loginDetails("Vinay","Dhru123","xyz");
		ulogin.loginDetails(1111111111,"Dhru123");
		ulogin.show();
	}
}
