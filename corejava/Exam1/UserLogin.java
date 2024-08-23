package com.evergent.corejava.Exam1;
// Method Overloading- same method name Different parameters
public class UserLogin {
	public void loginDetails()
	{
		System.out.println("Login Details");
	}
	public void loginDetails(String uname,String pass)
	{
		System.out.println("Username:" + uname);
		System.out.println("Password:" + pass);
	}
	public void loginDetails(String uname,String pass,String captcha)
	{
		System.out.println("Username:" + uname);
		System.out.println("Password:" + pass);
		System.out.println("Captcha:" + captcha);
	}
	public void loginDetails(int mobile, String pass)
	{
		System.out.println("Mobile:" + mobile);
		System.out.println("Password:" + pass);
	}
	public void show()
	{
		System.out.println("method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserLogin ulogin=new UserLogin();
				ulogin.loginDetails();
				ulogin.loginDetails("Dhruti","Dhru123");
				ulogin.loginDetails("Dhruti","Dhru123","123abc");
				ulogin.loginDetails(1111111111,"Dhru123");
				ulogin.show();
	}
}
